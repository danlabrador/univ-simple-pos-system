import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class App extends javax.swing.JFrame {

    /**
     * Creates new form App
     */
    public App() {
        initComponents();
        applyTableStyle(tblData);
        testData(tblData);
    }
    
    private void testData(JTable table) {
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
    
    private Object[] getRandomRowData(String name) {
        DecimalFormat df = new DecimalFormat("#,##0.##");
        return new Object[]{1, name, df.format(getAmount(130,250)), (int) getAmount(1, 300)};
    }
    
    private void testStaging(JTable table) {
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
    
    private Object[] getRandomRowStaging(String name) {
        DecimalFormat df = new DecimalFormat("#,##0.##");
        return new Object[]{1, name, df.format(getAmount(130,250)), (int) getAmount(1, 300), df.format(getAmount(130,2500))};
    }
    
    
    private double getAmount(int from, int to) {
        Random ran = new Random();
        return (ran.nextInt(to - from) + from) * ran.nextDouble();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlRoot = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        pnlSideControls = new javax.swing.JPanel();
        pnlIDControl = new javax.swing.JPanel();
        lblControlID = new javax.swing.JLabel();
        txtControlID = new javax.swing.JTextField();
        pnlIDControl1 = new javax.swing.JPanel();
        lblControlID1 = new javax.swing.JLabel();
        txtControlID1 = new javax.swing.JTextField();
        btnControlAdd = new javax.swing.JButton();
        btnControlRemove = new javax.swing.JButton();
        btnControlSearch = new javax.swing.JButton();
        btnControlSave = new javax.swing.JButton();
        btnControlSearch1 = new javax.swing.JButton();
        pnlControlConsole = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        pnlControlMajotButtons = new javax.swing.JPanel();
        btnControlLeftButton = new javax.swing.JButton();
        btnControlRightButton = new javax.swing.JButton();
        crzypnlSide = new raven.crazypanel.CrazyPanel();
        scrollStaging = new javax.swing.JScrollPane();
        tblStaging = new javax.swing.JTable();
        pnlNorth = new javax.swing.JPanel();
        pnlLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlNorthControls = new javax.swing.JPanel();
        pnlTabbedControls = new javax.swing.JPanel();
        Spacing = new javax.swing.JPanel();
        Spacing1 = new javax.swing.JPanel();
        btnSellTab = new javax.swing.JButton();
        Spacing2 = new javax.swing.JPanel();
        btnManageTab = new javax.swing.JButton();
        pnlDisplayLocation = new javax.swing.JPanel();
        lblDisplayLocation = new javax.swing.JLabel();
        crzypnlCenter = new raven.crazypanel.CrazyPanel();
        scrollData = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Coffee Canvas");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(245, 245, 245));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/img/icon.png")));
        setMinimumSize(new java.awt.Dimension(1194, 834));
        setResizable(false);

        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlSide.setBackground(new java.awt.Color(0, 0, 0));
        pnlSide.setPreferredSize(new java.awt.Dimension(492, 834));
        pnlSide.setLayout(new java.awt.BorderLayout());

        pnlSideControls.setBackground(new java.awt.Color(0, 0, 0));
        pnlSideControls.setPreferredSize(new java.awt.Dimension(492, 218));
        pnlSideControls.setLayout(new java.awt.GridBagLayout());

        pnlIDControl.setBackground(new java.awt.Color(0, 0, 0));
        pnlIDControl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlIDControl.setPreferredSize(new java.awt.Dimension(97, 64));
        pnlIDControl.setLayout(new java.awt.BorderLayout());

        lblControlID.setFont(new java.awt.Font("Gilroy-Bold", 0, 16)); // NOI18N
        lblControlID.setForeground(new java.awt.Color(255, 255, 255));
        lblControlID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblControlID.setText("ID");
        lblControlID.setAlignmentY(0.0F);
        pnlIDControl.add(lblControlID, java.awt.BorderLayout.CENTER);

        txtControlID.setFont(new java.awt.Font("Gilroy-Medium", 0, 20)); // NOI18N
        txtControlID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtControlID.setText("0");
        txtControlID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtControlID.setPreferredSize(new java.awt.Dimension(97, 41));
        txtControlID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtControlIDActionPerformed(evt);
            }
        });
        pnlIDControl.add(txtControlID, java.awt.BorderLayout.PAGE_END);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 5);
        pnlSideControls.add(pnlIDControl, gridBagConstraints);

        pnlIDControl1.setBackground(new java.awt.Color(0, 0, 0));
        pnlIDControl1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlIDControl1.setPreferredSize(new java.awt.Dimension(97, 64));
        pnlIDControl1.setLayout(new java.awt.BorderLayout());

        lblControlID1.setFont(new java.awt.Font("Gilroy-Bold", 0, 16)); // NOI18N
        lblControlID1.setForeground(new java.awt.Color(255, 255, 255));
        lblControlID1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblControlID1.setText("Qty");
        lblControlID1.setAlignmentY(0.0F);
        pnlIDControl1.add(lblControlID1, java.awt.BorderLayout.CENTER);

        txtControlID1.setFont(new java.awt.Font("Gilroy-Medium", 0, 20)); // NOI18N
        txtControlID1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtControlID1.setText("0");
        txtControlID1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtControlID1.setPreferredSize(new java.awt.Dimension(97, 41));
        txtControlID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtControlID1ActionPerformed(evt);
            }
        });
        pnlIDControl1.add(txtControlID1, java.awt.BorderLayout.PAGE_END);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 5, 0, 5);
        pnlSideControls.add(pnlIDControl1, gridBagConstraints);

        btnControlAdd.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 16)); // NOI18N
        btnControlAdd.setForeground(new java.awt.Color(35, 166, 95));
        btnControlAdd.setText("Add");
        btnControlAdd.setBorder(null);
        btnControlAdd.setPreferredSize(new java.awt.Dimension(115, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        pnlSideControls.add(btnControlAdd, gridBagConstraints);

        btnControlRemove.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 16)); // NOI18N
        btnControlRemove.setForeground(new java.awt.Color(230, 70, 59));
        btnControlRemove.setText("Remove");
        btnControlRemove.setBorder(null);
        btnControlRemove.setPreferredSize(new java.awt.Dimension(115, 30));
        btnControlRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlRemoveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        pnlSideControls.add(btnControlRemove, gridBagConstraints);

        btnControlSearch.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 16)); // NOI18N
        btnControlSearch.setText("Search");
        btnControlSearch.setToolTipText("");
        btnControlSearch.setBorder(null);
        btnControlSearch.setPreferredSize(new java.awt.Dimension(115, 30));
        btnControlSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlSearchActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 2, 1);
        pnlSideControls.add(btnControlSearch, gridBagConstraints);

        btnControlSave.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 16)); // NOI18N
        btnControlSave.setText("Edit");
        btnControlSave.setBorder(null);
        btnControlSave.setPreferredSize(new java.awt.Dimension(115, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 2, 0);
        pnlSideControls.add(btnControlSave, gridBagConstraints);

        btnControlSearch1.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 16)); // NOI18N
        btnControlSearch1.setText("Search");
        btnControlSearch1.setToolTipText("");
        btnControlSearch1.setBorder(null);
        btnControlSearch1.setPreferredSize(new java.awt.Dimension(115, 30));
        btnControlSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlSearch1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 2, 5);
        pnlSideControls.add(btnControlSearch1, gridBagConstraints);

        pnlControlConsole.setBackground(new java.awt.Color(31, 31, 31));
        pnlControlConsole.setPreferredSize(new java.awt.Dimension(329, 30));
        pnlControlConsole.setLayout(new java.awt.BorderLayout());

        jTextField1.setBackground(new java.awt.Color(31, 31, 31));
        jTextField1.setFont(new java.awt.Font("Gilroy-Regular", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(229, 229, 229));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Welcome!");
        jTextField1.setBorder(null);
        pnlControlConsole.add(jTextField1, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 4);
        pnlSideControls.add(pnlControlConsole, gridBagConstraints);

        pnlControlMajotButtons.setBackground(new java.awt.Color(0, 0, 0));
        pnlControlMajotButtons.setPreferredSize(new java.awt.Dimension(454, 60));
        pnlControlMajotButtons.setLayout(new java.awt.BorderLayout(10, 0));

        btnControlLeftButton.setBackground(new java.awt.Color(230, 70, 59));
        btnControlLeftButton.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 20)); // NOI18N
        btnControlLeftButton.setForeground(new java.awt.Color(255, 255, 255));
        btnControlLeftButton.setText("Clear All");
        btnControlLeftButton.setBorder(null);
        btnControlLeftButton.setPreferredSize(new java.awt.Dimension(130, 60));
        pnlControlMajotButtons.add(btnControlLeftButton, java.awt.BorderLayout.WEST);

        btnControlRightButton.setBackground(new java.awt.Color(35, 166, 95));
        btnControlRightButton.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 20)); // NOI18N
        btnControlRightButton.setForeground(new java.awt.Color(255, 255, 255));
        btnControlRightButton.setText("Place Order");
        btnControlRightButton.setBorder(null);
        btnControlRightButton.setPreferredSize(new java.awt.Dimension(130, 60));
        pnlControlMajotButtons.add(btnControlRightButton, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        pnlSideControls.add(pnlControlMajotButtons, gridBagConstraints);

        pnlSide.add(pnlSideControls, java.awt.BorderLayout.SOUTH);

        crzypnlSide.setBackground(new java.awt.Color(0, 0, 0));
        crzypnlSide.setMigLayoutConstraints(new raven.crazypanel.MigLayoutConstraints(
            "wrap,fill,insets 20",
            "[fill]",
            "[fill]",
            new String[]{
                ""
            }
        ));

        tblStaging.setBackground(new java.awt.Color(31, 31, 31));
        tblStaging.setFont(new java.awt.Font("Gilroy-Black", 0, 12)); // NOI18N
        tblStaging.setForeground(new java.awt.Color(255, 255, 255));
        tblStaging.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Menu Item", "Price", "Qty", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollStaging.setViewportView(tblStaging);
        if (tblStaging.getColumnModel().getColumnCount() > 0) {
            tblStaging.getColumnModel().getColumn(0).setResizable(false);
            tblStaging.getColumnModel().getColumn(1).setResizable(false);
            tblStaging.getColumnModel().getColumn(2).setResizable(false);
            tblStaging.getColumnModel().getColumn(3).setResizable(false);
            tblStaging.getColumnModel().getColumn(4).setResizable(false);
        }

        crzypnlSide.add(scrollStaging);

        pnlSide.add(crzypnlSide, java.awt.BorderLayout.CENTER);

        pnlRoot.add(pnlSide, java.awt.BorderLayout.WEST);

        pnlNorth.setBackground(new java.awt.Color(255, 0, 0));
        pnlNorth.setPreferredSize(new java.awt.Dimension(1194, 98));
        pnlNorth.setLayout(new java.awt.BorderLayout());

        pnlLogo.setBackground(new java.awt.Color(31, 31, 31));
        pnlLogo.setPreferredSize(new java.awt.Dimension(492, 98));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dan Labrador\\OneDrive - addu.edu.ph\\Documents\\CS 2136\\7 GUI\\univ-simple-pos-system\\src\\resources\\img\\logo.png")); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setPreferredSize(new java.awt.Dimension(480, 86));
        pnlLogo.add(jLabel1);

        pnlNorth.add(pnlLogo, java.awt.BorderLayout.WEST);

        pnlNorthControls.setBackground(new java.awt.Color(245, 245, 245));
        pnlNorthControls.setLayout(new java.awt.BorderLayout());

        pnlTabbedControls.setBackground(new java.awt.Color(245, 245, 245));
        pnlTabbedControls.setPreferredSize(new java.awt.Dimension(364, 98));
        pnlTabbedControls.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        Spacing.setBackground(new java.awt.Color(245, 245, 245));
        Spacing.setPreferredSize(new java.awt.Dimension(387, 30));

        javax.swing.GroupLayout SpacingLayout = new javax.swing.GroupLayout(Spacing);
        Spacing.setLayout(SpacingLayout);
        SpacingLayout.setHorizontalGroup(
            SpacingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );
        SpacingLayout.setVerticalGroup(
            SpacingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlTabbedControls.add(Spacing);

        Spacing1.setBackground(new java.awt.Color(245, 245, 245));
        Spacing1.setPreferredSize(new java.awt.Dimension(40, 10));

        javax.swing.GroupLayout Spacing1Layout = new javax.swing.GroupLayout(Spacing1);
        Spacing1.setLayout(Spacing1Layout);
        Spacing1Layout.setHorizontalGroup(
            Spacing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Spacing1Layout.setVerticalGroup(
            Spacing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnlTabbedControls.add(Spacing1);

        btnSellTab.setBackground(new java.awt.Color(222, 179, 137));
        btnSellTab.setFont(new java.awt.Font("Gilroy-Bold", 0, 24)); // NOI18N
        btnSellTab.setText("Sell");
        btnSellTab.setBorder(null);
        btnSellTab.setPreferredSize(new java.awt.Dimension(115, 50));
        btnSellTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellTabActionPerformed(evt);
            }
        });
        pnlTabbedControls.add(btnSellTab);

        Spacing2.setBackground(new java.awt.Color(245, 245, 245));
        Spacing2.setPreferredSize(new java.awt.Dimension(5, 10));

        javax.swing.GroupLayout Spacing2Layout = new javax.swing.GroupLayout(Spacing2);
        Spacing2.setLayout(Spacing2Layout);
        Spacing2Layout.setHorizontalGroup(
            Spacing2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        Spacing2Layout.setVerticalGroup(
            Spacing2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnlTabbedControls.add(Spacing2);

        btnManageTab.setBackground(new java.awt.Color(217, 217, 217));
        btnManageTab.setFont(new java.awt.Font("Gilroy-Bold", 0, 24)); // NOI18N
        btnManageTab.setText("Manage");
        btnManageTab.setBorder(null);
        btnManageTab.setPreferredSize(new java.awt.Dimension(150, 50));
        btnManageTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTabActionPerformed(evt);
            }
        });
        pnlTabbedControls.add(btnManageTab);

        pnlNorthControls.add(pnlTabbedControls, java.awt.BorderLayout.WEST);

        pnlDisplayLocation.setBackground(new java.awt.Color(245, 245, 245));
        pnlDisplayLocation.setPreferredSize(new java.awt.Dimension(364, 98));
        pnlDisplayLocation.setLayout(new java.awt.BorderLayout());

        lblDisplayLocation.setBackground(new java.awt.Color(245, 245, 245));
        lblDisplayLocation.setFont(new java.awt.Font("Gilroy-Black", 0, 40)); // NOI18N
        lblDisplayLocation.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDisplayLocation.setText("MENU  ");
        lblDisplayLocation.setPreferredSize(new java.awt.Dimension(364, 51));
        lblDisplayLocation.setRequestFocusEnabled(false);
        pnlDisplayLocation.add(lblDisplayLocation, java.awt.BorderLayout.CENTER);

        pnlNorthControls.add(pnlDisplayLocation, java.awt.BorderLayout.CENTER);

        pnlNorth.add(pnlNorthControls, java.awt.BorderLayout.CENTER);

        pnlRoot.add(pnlNorth, java.awt.BorderLayout.NORTH);

        crzypnlCenter.setBackground(new java.awt.Color(245, 245, 245));
        crzypnlCenter.setMigLayoutConstraints(new raven.crazypanel.MigLayoutConstraints(
            "wrap,fill,insets 50",
            "[fill]",
            "[fill]",
            null
        ));
        crzypnlCenter.setPreferredSize(new java.awt.Dimension(600, 502));

        tblData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MENU ITEM", "PRICE", "QUANTITY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.setRowHeight(30);
        scrollData.setViewportView(tblData);
        if (tblData.getColumnModel().getColumnCount() > 0) {
            tblData.getColumnModel().getColumn(0).setResizable(false);
            tblData.getColumnModel().getColumn(1).setResizable(false);
            tblData.getColumnModel().getColumn(2).setResizable(false);
            tblData.getColumnModel().getColumn(3).setResizable(false);
        }

        crzypnlCenter.add(scrollData);

        pnlRoot.add(crzypnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtControlIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtControlIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtControlIDActionPerformed

    private void txtControlID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtControlID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtControlID1ActionPerformed

    private void btnControlRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnControlRemoveActionPerformed

    private void btnControlSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnControlSearchActionPerformed

    private void btnControlSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnControlSearch1ActionPerformed

    private void btnSellTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellTabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSellTabActionPerformed

    private void btnManageTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageTabActionPerformed

    private TableCellRenderer getAlignmentCellRender(TableCellRenderer oldRender, boolean header) {
        return new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component com = oldRender.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (com instanceof JLabel) {
                    JLabel label = (JLabel) com;
                    if (column == 0 || column == 4) {
                        label.setHorizontalAlignment(SwingConstants.CENTER);
                    } else if (column == 2 || column == 3) {
                        label.setHorizontalAlignment(SwingConstants.TRAILING);
                    } else {
                        label.setHorizontalAlignment(SwingConstants.LEADING);
                    }
                    if (header == false) {
                        if (column == 4) {
                            if (Double.parseDouble(value.toString()) > 0) {
                                com.setForeground(new Color(17, 182, 60));
                                label.setText("+" + value);
                            } else {
                                com.setForeground(new Color(202, 48, 48));
                            }
                        } else {
                            if (isSelected) {
                                com.setForeground(table.getSelectionForeground());
                            } else {
                                com.setForeground(table.getForeground());
                            }
                        }
                    }
                }
                return com;
            }
        };
    }
    
    private void applyTableStyle(JTable table) {
        JScrollPane scroll = (JScrollPane) table.getParent().getParent();
        scroll.setBorder(BorderFactory.createEmptyBorder());
        scroll.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Table.background;"
                + "track:$Table.background;"
                + "trackArc:999");

        table.getTableHeader().putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        table.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");

        //  To Create table alignment
        table.getTableHeader().setDefaultRenderer(getAlignmentCellRender(table.getTableHeader().getDefaultRenderer(), true));
        table.setDefaultRenderer(Object.class, getAlignmentCellRender(table.getDefaultRenderer(Object.class), false));
    }
    
    public static void main(String args[]) {
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatRobotoFont.install();
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Spacing;
    private javax.swing.JPanel Spacing1;
    private javax.swing.JPanel Spacing2;
    private javax.swing.JButton btnControlAdd;
    private javax.swing.JButton btnControlLeftButton;
    private javax.swing.JButton btnControlRemove;
    private javax.swing.JButton btnControlRightButton;
    private javax.swing.JButton btnControlSave;
    private javax.swing.JButton btnControlSearch;
    private javax.swing.JButton btnControlSearch1;
    private javax.swing.JButton btnManageTab;
    private javax.swing.JButton btnSellTab;
    private raven.crazypanel.CrazyPanel crzypnlCenter;
    private raven.crazypanel.CrazyPanel crzypnlSide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblControlID;
    private javax.swing.JLabel lblControlID1;
    private javax.swing.JLabel lblDisplayLocation;
    private javax.swing.JPanel pnlControlConsole;
    private javax.swing.JPanel pnlControlMajotButtons;
    private javax.swing.JPanel pnlDisplayLocation;
    private javax.swing.JPanel pnlIDControl;
    private javax.swing.JPanel pnlIDControl1;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlNorth;
    private javax.swing.JPanel pnlNorthControls;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPanel pnlSideControls;
    private javax.swing.JPanel pnlTabbedControls;
    private javax.swing.JScrollPane scrollData;
    private javax.swing.JScrollPane scrollStaging;
    private javax.swing.JTable tblData;
    private javax.swing.JTable tblStaging;
    private javax.swing.JTextField txtControlID;
    private javax.swing.JTextField txtControlID1;
    // End of variables declaration//GEN-END:variables
}
