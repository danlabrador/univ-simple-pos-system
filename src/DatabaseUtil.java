import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DatabaseUtil {
    public static String dbUrl = "jdbc:mysql://localhost:3306/JavaDBExam";
    public static String dbUser = "root";
    public static String dbPassword = "root";
  
    public static void populateTblData(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String query = "SELECT p.id AS ProductID, p.name AS ProductName, p.price AS Price, " +
                       "SUM(s.quantity) AS StockQuantity FROM products p " +
                       "LEFT JOIN stock s ON p.id = s.product_id " +
                       "GROUP BY p.id, p.name, p.price;";
        try (ResultSet resultSet = sendPreparedStatementQuery(query)) {
            while(resultSet.next()) {
                model.addRow(new Object[]{
                    resultSet.getInt("ProductID"),
                    resultSet.getString("ProductName"),
                    String.format("%.2f", resultSet.getDouble("Price")),
                    resultSet.getInt("StockQuantity")
                });
            }
            resultSet.close();
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
    }
    
    public static void addNewProduct(String name, double price) {
        String query = "INSERT INTO products (name, price) VALUES (?, ?)";
        try {
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, name);
            statement.setDouble(2, price);
            statement.executeUpdate();
            statement.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
    }
    
    public static void updateStockQuantity(int productId, int quantity) {
        // First, check if the product already has a stock record
        String checkQuery = "SELECT COUNT(*) FROM stock WHERE product_id = ?";
        String updateQuery = "UPDATE stock SET quantity = quantity + ? WHERE product_id = ?";
        String insertQuery = "INSERT INTO stock (product_id, quantity) VALUES (?, ?)";
        try {
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
            checkStmt.setInt(1, productId);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                // If record exists, update it
                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                updateStmt.setInt(1, quantity);
                updateStmt.setInt(2, productId);
                updateStmt.executeUpdate();
                updateStmt.close();
            } else {
                // If no record exists, insert a new one
                PreparedStatement insertStmt = con.prepareStatement(insertQuery);
                insertStmt.setInt(1, productId);
                insertStmt.setInt(2, quantity);
                insertStmt.executeUpdate();
                insertStmt.close();
            }
            checkStmt.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
    }


    public static void addStockQuantity(int productId, int quantity) {
        String query = "INSERT INTO stock (product_id, quantity) VALUES (?, ?)";
        try {
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, productId);
            pstmt.setInt(2, quantity);
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
    }
    
    public static void reduceStockQuantity(int productId, int quantity) {
        addStockQuantity(productId, -quantity); // Reuse the addStockQuantity method with negative value
    }


    // Helper Methods
    
    private static ResultSet sendPreparedStatementQuery(String query) {
        try {
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            PreparedStatement pstmt = con.prepareStatement(query);
            return pstmt.executeQuery();
            // Note: It's important to not close pstmt and connection here
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
            return null;
        }
    }
    
    private static ResultSet sendQuery(String query) {
        // Load the driver class
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
            return null;
        }

        // Get data from the database
        try {
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            // Note: It's important to not close statement and connection here
            return resultSet;
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }

        return null;
    }

    
}

