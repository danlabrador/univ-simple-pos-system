package style;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TestData {
    public static void populateTblData(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(getRandomRowData("Beer"));
        model.addRow(getRandomRowData("Shirt"));
        model.addRow(getRandomRowData("Laptop"));
        model.addRow(getRandomRowData("Book"));
        model.addRow(getRandomRowData("Coffee"));
        model.addRow(getRandomRowData("Phone"));
        model.addRow(getRandomRowData("Chair"));
        model.addRow(getRandomRowData("Watch"));
        model.addRow(getRandomRowData("Sunglasses"));
        model.addRow(getRandomRowData("Bag"));
        model.addRow(getRandomRowData("Headphones"));
        model.addRow(getRandomRowData("Camera"));
        model.addRow(getRandomRowData("Necklace"));
        model.addRow(getRandomRowData("Perfume"));
        model.addRow(getRandomRowData("Wallet"));
        model.addRow(getRandomRowData("Jacket"));
        model.addRow(getRandomRowData("Bicycle"));
        model.addRow(getRandomRowData("Game console"));
        model.addRow(getRandomRowData("Tennis racket"));
        model.addRow(getRandomRowData("Watch"));
        model.addRow(getRandomRowData("Sunglasses"));
        model.addRow(getRandomRowData("Bag"));
        model.addRow(getRandomRowData("Headphones"));
        model.addRow(getRandomRowData("Camera"));
        model.addRow(getRandomRowData("Necklace"));
        model.addRow(getRandomRowData("Perfume"));
        model.addRow(getRandomRowData("Wallet"));
        model.addRow(getRandomRowData("Jacket"));
        model.addRow(getRandomRowData("Bicycle"));
        model.addRow(getRandomRowData("Game console"));
        model.addRow(getRandomRowData("Tennis racket"));
    }
    
    private static Object[] getRandomRowData(String name) {
        DecimalFormat df = new DecimalFormat("#,##0.##");
        return new Object[]{1, name, df.format(getAmount(130,250)), (int) getAmount(1, 300)};
    }
    
    public static void populateTblStaging(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(getRandomRowStaging("Beer"));
        model.addRow(getRandomRowStaging("Shirt"));
        model.addRow(getRandomRowStaging("Laptop"));
        model.addRow(getRandomRowStaging("Book"));
        model.addRow(getRandomRowStaging("Coffee"));
        model.addRow(getRandomRowStaging("Phone"));
        model.addRow(getRandomRowStaging("Chair"));
        model.addRow(getRandomRowStaging("Watch"));
        model.addRow(getRandomRowStaging("Sunglasses"));
        model.addRow(getRandomRowStaging("Bag"));
        model.addRow(getRandomRowStaging("Headphones"));
        model.addRow(getRandomRowStaging("Camera"));
        model.addRow(getRandomRowStaging("Necklace"));
        model.addRow(getRandomRowStaging("Perfume"));
        model.addRow(getRandomRowStaging("Wallet"));
        model.addRow(getRandomRowStaging("Jacket"));
        model.addRow(getRandomRowStaging("Bicycle"));
        model.addRow(getRandomRowStaging("Game console"));
        model.addRow(getRandomRowStaging("Tennis racket"));
        model.addRow(getRandomRowStaging("Watch"));
        model.addRow(getRandomRowStaging("Sunglasses"));
        model.addRow(getRandomRowStaging("Bag"));
        model.addRow(getRandomRowStaging("Headphones"));
        model.addRow(getRandomRowStaging("Camera"));
        model.addRow(getRandomRowStaging("Necklace"));
        model.addRow(getRandomRowStaging("Perfume"));
        model.addRow(getRandomRowStaging("Wallet"));
        model.addRow(getRandomRowStaging("Jacket"));
        model.addRow(getRandomRowStaging("Bicycle"));
        model.addRow(getRandomRowStaging("Game console"));
        model.addRow(getRandomRowStaging("Tennis racket"));
    }
    
    private static Object[] getRandomRowStaging(String name) {
        DecimalFormat df = new DecimalFormat("#,##0.##");
        return new Object[]{1, name, df.format(getAmount(130,250)), (int) getAmount(1, 300), df.format(getAmount(130,2500))};
    }
    
    
    private static double getAmount(int from, int to) {
        Random ran = new Random();
        return (ran.nextInt(to - from) + from) * ran.nextDouble();
    }
}
