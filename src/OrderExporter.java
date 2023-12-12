import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderExporter {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/JavaDBExam";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static String exportToCSV() {
        // Adjust the file path to be relative to the manifest.mf file
        String relativeFilePath = "export.csv";
        Path absolutePath = Paths.get(System.getProperty("user.dir"), relativeFilePath);

        String query = "SELECT o.id AS OrderID, o.customer_name AS CustomerName, o.order_date AS OrderDate, " +
                       "po.quantity AS Quantity, p.name AS ProductName, p.price AS ProductPrice, " +
                       "(po.quantity * p.price) AS TotalPrice " +
                       "FROM `order` o " +
                       "JOIN product_order po ON o.id = po.order_id " +
                       "JOIN products p ON po.product_id = p.id " +
                       "ORDER BY o.order_date DESC";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            // Check if the file is in use by another process
            try (FileWriter csvWriter = new FileWriter(absolutePath.toString())) {
                // Write CSV header
                csvWriter.append("OrderID,CustomerName,OrderDate,Quantity,ProductName,ProductPrice,TotalPrice\n");

                // Write data to CSV
                while (resultSet.next()) {
                    csvWriter.append(resultSet.getString("OrderID")).append(",");
                    csvWriter.append(resultSet.getString("CustomerName")).append(",");
                    csvWriter.append(resultSet.getString("OrderDate")).append(",");
                    csvWriter.append(resultSet.getString("Quantity")).append(",");
                    csvWriter.append(resultSet.getString("ProductName")).append(",");
                    csvWriter.append(resultSet.getString("ProductPrice")).append(",");
                    csvWriter.append(resultSet.getString("TotalPrice")).append("\n");
                }

                System.out.println("CSV export successful. File path: " + absolutePath);
                return "CSV file is updated. File path: " + absolutePath;

            } catch (IOException e) {
                // Handle the case where the file is being used by another process
                return "Error updating the CSV file. There is another program that is using the file. If you wish the CSV file to be updated, kindly terminate that program.";
            }

        } catch (SQLException e) {
            System.err.println("Error exporting to CSV: " + e.getMessage());
            return "Error updating the CSV file: " + e.getMessage();
        }
    }
}
