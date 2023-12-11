import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import style.CenterAlignCellRenderer;
import style.BoldFontRenderer;

import java.awt.Rectangle;
import javax.swing.JOptionPane;

public class App extends javax.swing.JFrame {
    private boolean isSelling = true;
    private boolean isSalesEditingMode = false;
    private boolean isManageAddMode = false;
    private boolean isManageEditMode = false;
    private boolean hasUpdates = false;

    
    static {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());

            // Set global properties for disabled buttons
            Color disabledButtonColor = new Color(166,166,166); // Example color
            UIManager.put("Button.disabledText", Color.GRAY); // For the text color
            UIManager.put("Button.disabledBackground", disabledButtonColor); // For the background color
            UIManager.put("TextField.disabledForeground", new Color(255,255,255)); // For the text color
            
            // Make all buttons rounded
            UIManager.put("Button.arc", 20); // Setting corner radius for buttons
            
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }

    public App() {
        initComponents();
        applyTblDataStyle(tblData);
        DatabaseUtil.populateTblData(tblData);
        applyTblStagingStyle(tblStaging);
        pnlControlText.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlRoot = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        pnlSideControls = new javax.swing.JPanel();
        pnlIDControlID = new javax.swing.JPanel();
        lblControlID = new javax.swing.JLabel();
        txtControlID = new javax.swing.JTextField();
        pnlIDControlQty = new javax.swing.JPanel();
        lblControlQty = new javax.swing.JLabel();
        txtControlQty = new javax.swing.JTextField();
        btnControlAdd = new javax.swing.JButton();
        btnControlRemove = new javax.swing.JButton();
        btnControlSave = new javax.swing.JButton();
        btnControlEdit = new javax.swing.JButton();
        btnControlSearch = new javax.swing.JButton();
        pnlControlText = new javax.swing.JPanel();
        lblControlName = new javax.swing.JLabel();
        txtControlName = new javax.swing.JTextField();
        lblControlPrice = new javax.swing.JLabel();
        txtControlPrice = new javax.swing.JTextField();
        pnlControlMajotButtons = new javax.swing.JPanel();
        btnControlLeftButton = new javax.swing.JButton();
        btnControlRightButton = new javax.swing.JButton();
        crzypnlStaging = new raven.crazypanel.CrazyPanel();
        scrollStaging = new javax.swing.JScrollPane();
        tblStaging = new javax.swing.JTable();
        pnlTotal = new javax.swing.JPanel();
        lblStagingTotalLabel = new javax.swing.JLabel();
        lblStagingTotalAmount = new javax.swing.JLabel();
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

        pnlIDControlID.setBackground(new java.awt.Color(0, 0, 0));
        pnlIDControlID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlIDControlID.setPreferredSize(new java.awt.Dimension(97, 64));
        pnlIDControlID.setLayout(new java.awt.BorderLayout());

        lblControlID.setFont(new java.awt.Font("Gilroy-Bold", 0, 16)); // NOI18N
        lblControlID.setForeground(new java.awt.Color(255, 255, 255));
        lblControlID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblControlID.setText("ID");
        lblControlID.setAlignmentY(0.0F);
        pnlIDControlID.add(lblControlID, java.awt.BorderLayout.CENTER);

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
        pnlIDControlID.add(txtControlID, java.awt.BorderLayout.PAGE_END);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 5);
        pnlSideControls.add(pnlIDControlID, gridBagConstraints);

        pnlIDControlQty.setBackground(new java.awt.Color(0, 0, 0));
        pnlIDControlQty.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlIDControlQty.setPreferredSize(new java.awt.Dimension(97, 64));
        pnlIDControlQty.setLayout(new java.awt.BorderLayout());

        lblControlQty.setFont(new java.awt.Font("Gilroy-Bold", 0, 16)); // NOI18N
        lblControlQty.setForeground(new java.awt.Color(255, 255, 255));
        lblControlQty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblControlQty.setText("Qty");
        lblControlQty.setAlignmentY(0.0F);
        pnlIDControlQty.add(lblControlQty, java.awt.BorderLayout.CENTER);

        txtControlQty.setFont(new java.awt.Font("Gilroy-Medium", 0, 20)); // NOI18N
        txtControlQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtControlQty.setText("0");
        txtControlQty.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtControlQty.setEnabled(false);
        txtControlQty.setPreferredSize(new java.awt.Dimension(97, 41));
        txtControlQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtControlQtyActionPerformed(evt);
            }
        });
        pnlIDControlQty.add(txtControlQty, java.awt.BorderLayout.PAGE_END);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 5, 0, 5);
        pnlSideControls.add(pnlIDControlQty, gridBagConstraints);

        btnControlAdd.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 16)); // NOI18N
        btnControlAdd.setForeground(new java.awt.Color(35, 166, 95));
        btnControlAdd.setText("Add");
        btnControlAdd.setBorder(null);
        btnControlAdd.setEnabled(false);
        btnControlAdd.setPreferredSize(new java.awt.Dimension(115, 30));
        btnControlAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlAddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        pnlSideControls.add(btnControlAdd, gridBagConstraints);

        btnControlRemove.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 16)); // NOI18N
        btnControlRemove.setForeground(new java.awt.Color(230, 70, 59));
        btnControlRemove.setText("Remove");
        btnControlRemove.setBorder(null);
        btnControlRemove.setEnabled(false);
        btnControlRemove.setPreferredSize(new java.awt.Dimension(115, 30));
        btnControlRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlRemoveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        pnlSideControls.add(btnControlRemove, gridBagConstraints);

        btnControlSave.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 16)); // NOI18N
        btnControlSave.setText("Save");
        btnControlSave.setToolTipText("");
        btnControlSave.setBorder(null);
        btnControlSave.setEnabled(false);
        btnControlSave.setPreferredSize(new java.awt.Dimension(115, 30));
        btnControlSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlSaveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 2, 1);
        pnlSideControls.add(btnControlSave, gridBagConstraints);

        btnControlEdit.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 16)); // NOI18N
        btnControlEdit.setText("Edit");
        btnControlEdit.setBorder(null);
        btnControlEdit.setEnabled(false);
        btnControlEdit.setPreferredSize(new java.awt.Dimension(115, 30));
        btnControlEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlEditActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 2, 0);
        pnlSideControls.add(btnControlEdit, gridBagConstraints);

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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 2, 5);
        pnlSideControls.add(btnControlSearch, gridBagConstraints);

        pnlControlText.setBackground(new java.awt.Color(31, 31, 31));
        pnlControlText.setPreferredSize(new java.awt.Dimension(329, 30));
        pnlControlText.setLayout(new javax.swing.BoxLayout(pnlControlText, javax.swing.BoxLayout.LINE_AXIS));

        lblControlName.setForeground(new java.awt.Color(255, 255, 255));
        lblControlName.setText("  Name  ");
        pnlControlText.add(lblControlName);

        txtControlName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtControlName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        txtControlName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtControlNameActionPerformed(evt);
            }
        });
        pnlControlText.add(txtControlName);

        lblControlPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblControlPrice.setText("  Price  ");
        pnlControlText.add(lblControlPrice);

        txtControlPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        pnlControlText.add(txtControlPrice);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 4);
        pnlSideControls.add(pnlControlText, gridBagConstraints);

        pnlControlMajotButtons.setBackground(new java.awt.Color(0, 0, 0));
        pnlControlMajotButtons.setPreferredSize(new java.awt.Dimension(454, 60));
        pnlControlMajotButtons.setLayout(new java.awt.BorderLayout(10, 0));

        btnControlLeftButton.setBackground(new java.awt.Color(230, 70, 59));
        btnControlLeftButton.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 20)); // NOI18N
        btnControlLeftButton.setForeground(new java.awt.Color(255, 255, 255));
        btnControlLeftButton.setText("Clear All");
        btnControlLeftButton.setBorder(null);
        btnControlLeftButton.setPreferredSize(new java.awt.Dimension(130, 60));
        btnControlLeftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlLeftButtonActionPerformed(evt);
            }
        });
        pnlControlMajotButtons.add(btnControlLeftButton, java.awt.BorderLayout.WEST);

        btnControlRightButton.setBackground(new java.awt.Color(35, 166, 95));
        btnControlRightButton.setFont(new java.awt.Font("Gilroy-ExtraBold", 0, 20)); // NOI18N
        btnControlRightButton.setForeground(new java.awt.Color(255, 255, 255));
        btnControlRightButton.setText("Place Order");
        btnControlRightButton.setBorder(null);
        btnControlRightButton.setPreferredSize(new java.awt.Dimension(130, 60));
        btnControlRightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlRightButtonActionPerformed(evt);
            }
        });
        pnlControlMajotButtons.add(btnControlRightButton, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        pnlSideControls.add(pnlControlMajotButtons, gridBagConstraints);

        pnlSide.add(pnlSideControls, java.awt.BorderLayout.SOUTH);

        crzypnlStaging.setBackground(new java.awt.Color(0, 0, 0));
        crzypnlStaging.setMigLayoutConstraints(new raven.crazypanel.MigLayoutConstraints(
            "wrap,fill,insets 20 20 0 20",
            "[fill]",
            "[fill]20[grow 0]",
            null
        ));

        tblStaging.setBackground(new java.awt.Color(31, 31, 31));
        tblStaging.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblStaging.setForeground(new java.awt.Color(255, 255, 255));
        tblStaging.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MENU ITEM", "PRICE", "QTY", "TOTAL"
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
        tblStaging.setPreferredSize(new java.awt.Dimension(433, 446));
        tblStaging.setRowHeight(40);
        scrollStaging.setViewportView(tblStaging);
        if (tblStaging.getColumnModel().getColumnCount() > 0) {
            tblStaging.getColumnModel().getColumn(0).setResizable(false);
            tblStaging.getColumnModel().getColumn(1).setResizable(false);
            tblStaging.getColumnModel().getColumn(2).setResizable(false);
            tblStaging.getColumnModel().getColumn(3).setResizable(false);
            tblStaging.getColumnModel().getColumn(4).setResizable(false);
        }
        if (tblStaging.getColumnModel().getColumnCount() > 0) {
            // Set width for ID column
            tblStaging.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblStaging.getColumnModel().getColumn(0).setMinWidth(50);
            tblStaging.getColumnModel().getColumn(0).setMaxWidth(50);

            // Set width for price column
            tblStaging.getColumnModel().getColumn(2).setPreferredWidth(70);
            tblStaging.getColumnModel().getColumn(2).setMinWidth(70);
            tblStaging.getColumnModel().getColumn(2).setMaxWidth(70);

            // Set width for quantity column
            tblStaging.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblStaging.getColumnModel().getColumn(3).setMinWidth(50);
            tblStaging.getColumnModel().getColumn(3).setMaxWidth(50);

            // Set width for total column
            tblStaging.getColumnModel().getColumn(4).setPreferredWidth(85);
            tblStaging.getColumnModel().getColumn(4).setMinWidth(85);
            tblStaging.getColumnModel().getColumn(4).setMaxWidth(85);

            tblStaging.getColumnModel().getColumn(0).setCellRenderer(new CenterAlignCellRenderer());
            tblStaging.getColumnModel().getColumn(1).setCellRenderer(new BoldFontRenderer());
        }

        tblStaging.setShowHorizontalLines(true); // Enable horizontal lines
        tblStaging.setGridColor(new Color(0x515151)); // Set the color of the grid lines

        crzypnlStaging.add(scrollStaging);

        pnlTotal.setBackground(new java.awt.Color(31, 31, 31));
        pnlTotal.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 20));
        pnlTotal.setPreferredSize(new java.awt.Dimension(452, 55));
        pnlTotal.setLayout(new java.awt.BorderLayout());

        lblStagingTotalLabel.setFont(new java.awt.Font("Gilroy-Medium", 0, 18)); // NOI18N
        lblStagingTotalLabel.setForeground(new java.awt.Color(255, 255, 255));
        lblStagingTotalLabel.setText("Total");
        lblStagingTotalLabel.setPreferredSize(new java.awt.Dimension(27, 16));
        pnlTotal.add(lblStagingTotalLabel, java.awt.BorderLayout.CENTER);

        lblStagingTotalAmount.setFont(new java.awt.Font("Gilroy-Medium", 1, 20)); // NOI18N
        lblStagingTotalAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblStagingTotalAmount.setText("PHP 0.00");
        pnlTotal.add(lblStagingTotalAmount, java.awt.BorderLayout.LINE_END);

        crzypnlStaging.add(pnlTotal);

        pnlSide.add(crzypnlStaging, java.awt.BorderLayout.PAGE_START);

        pnlRoot.add(pnlSide, java.awt.BorderLayout.WEST);

        pnlNorth.setBackground(new java.awt.Color(255, 0, 0));
        pnlNorth.setPreferredSize(new java.awt.Dimension(1194, 98));
        pnlNorth.setLayout(new java.awt.BorderLayout());

        pnlLogo.setBackground(new java.awt.Color(31, 31, 31));
        pnlLogo.setPreferredSize(new java.awt.Dimension(492, 98));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/logo.png"))); // NOI18N
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
        Spacing.setPreferredSize(new java.awt.Dimension(387, 10));

        javax.swing.GroupLayout SpacingLayout = new javax.swing.GroupLayout(Spacing);
        Spacing.setLayout(SpacingLayout);
        SpacingLayout.setHorizontalGroup(
            SpacingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );
        SpacingLayout.setVerticalGroup(
            SpacingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
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
        lblDisplayLocation.setText("MENU      ");
        lblDisplayLocation.setPreferredSize(new java.awt.Dimension(364, 51));
        lblDisplayLocation.setRequestFocusEnabled(false);
        pnlDisplayLocation.add(lblDisplayLocation, java.awt.BorderLayout.CENTER);

        pnlNorthControls.add(pnlDisplayLocation, java.awt.BorderLayout.CENTER);

        pnlNorth.add(pnlNorthControls, java.awt.BorderLayout.CENTER);

        pnlRoot.add(pnlNorth, java.awt.BorderLayout.NORTH);

        crzypnlCenter.setBackground(new java.awt.Color(245, 245, 245));
        crzypnlCenter.setMigLayoutConstraints(new raven.crazypanel.MigLayoutConstraints(
            "wrap,fill,insets 20 50 50 50",
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
        tblData.setRowHeight(60);
        scrollData.setViewportView(tblData);
        if (tblData.getColumnModel().getColumnCount() > 0) {
            tblData.getColumnModel().getColumn(0).setResizable(false);
            tblData.getColumnModel().getColumn(1).setResizable(false);
            tblData.getColumnModel().getColumn(2).setResizable(false);
            tblData.getColumnModel().getColumn(3).setResizable(false);
        }
        if (tblData.getColumnModel().getColumnCount() > 0) {
            // Set width for ID column
            tblData.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblData.getColumnModel().getColumn(0).setMinWidth(50);
            tblData.getColumnModel().getColumn(0).setMaxWidth(50);

            // Set width for price column
            tblData.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblData.getColumnModel().getColumn(2).setMinWidth(100);
            tblData.getColumnModel().getColumn(2).setMaxWidth(100);

            // Set width for quantity column
            tblData.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblData.getColumnModel().getColumn(3).setMinWidth(100);
            tblData.getColumnModel().getColumn(3).setMaxWidth(100);

            tblData.getColumnModel().getColumn(0).setCellRenderer(new CenterAlignCellRenderer());
            tblData.getColumnModel().getColumn(1).setCellRenderer(new BoldFontRenderer());
        }

        tblData.setShowHorizontalLines(true); // Enable horizontal lines
        tblData.setGridColor(new Color(0xe6e6e6)); // Set the color of the grid lines

        crzypnlCenter.add(scrollData);

        pnlRoot.add(crzypnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtControlIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtControlIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtControlIDActionPerformed

    private void txtControlQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtControlQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtControlQtyActionPerformed

    private void btnControlRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlRemoveActionPerformed
        // TODO add your handling code here:
        if (isSelling) {
            removeRowFromStaging();
        }
    }//GEN-LAST:event_btnControlRemoveActionPerformed

    private void btnControlSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlSaveActionPerformed
        // TODO add your handling code here:
        if (isSelling) {
            saveStagingAndToggleButtons();
        } else {
            this.editProduct();
        }
    }//GEN-LAST:event_btnControlSaveActionPerformed

    private void btnControlSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlSearchActionPerformed
        if (isSelling) {
            txtControlName.setEnabled(true);
            searchInTblDataSell();
        } if(!isSelling){
            searchInTblDataManage(); 
        }
    }//GEN-LAST:event_btnControlSearchActionPerformed

    private void btnSellTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellTabActionPerformed
        btnSellTab.setBackground(new Color(222, 179, 137));
        btnManageTab.setBackground(new Color(217, 217, 217));
        btnControlLeftButton.setText("Clear All");
        btnControlRightButton.setText("Place Order");
        lblDisplayLocation.setText("MENU      ");
        this.pnlControlText.setVisible(false);
        isSelling = true;
        
        // Control Access
        this.btnControlAdd.setText("Add");
    }//GEN-LAST:event_btnSellTabActionPerformed

    private void btnManageTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTabActionPerformed
        btnManageTab.setBackground(new Color(222, 179, 137));
        btnSellTab.setBackground(new Color(217, 217, 217));
        btnControlLeftButton.setText("Unstock");
        btnControlRightButton.setText("Add to Inventory");
        lblDisplayLocation.setText("INVENTORY      ");
        isSelling = false;
        
        // Control access
        this.btnControlAdd.setEnabled(true);
        this.btnControlAdd.setText("Add New");
    }//GEN-LAST:event_btnManageTabActionPerformed

    private void txtControlNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtControlNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtControlNameActionPerformed

    private void btnControlRightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlRightButtonActionPerformed
        if(isSelling){    
            this.decreaseQuantityInDataBasedOnStaging();
            this.clearStagingTableIfSelling();
            this.btnControlEdit.setEnabled(false);
            this.showMessageDialogue("Ordered!");
        } if(!isSelling){
            this.stockItem();
            this.addProduct();
        }
            
    }//GEN-LAST:event_btnControlRightButtonActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnControlLeftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlLeftButtonActionPerformed
        // TODO add your handling code here:
        if (isSelling) {
            clearStagingTableIfSelling();
        } if(!isSelling) {
            txtControlQty.setEnabled(true);
            unstockItem();
        }
    }//GEN-LAST:event_btnControlLeftButtonActionPerformed

    private void btnControlAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlAddActionPerformed
        // Selling Mode
        if (isSelling) {
            addSelectedRowToTblStaging();
            updateStagingTotalAmount();
        } else {
            if (!this.isManageAddMode){
                // Enter Manage Add Mode
                this.isManageAddMode = true;        
                this.isManageEditMode = false;    
                this.btnControlAdd.setText("Exit");
                this.pnlControlText.setVisible(true);
                this.txtControlID.setEnabled(false);
                this.btnControlEdit.setEnabled(false);
                this.btnControlSearch.setEnabled(false);
                this.txtControlQty.setEnabled(true);
                this.txtControlID.setText("0");
            } else {
                // Exit Manage Add Mode
                this.isManageAddMode = false;
                this.btnControlAdd.setText("Add New");
                this.pnlControlText.setVisible(false);
                this.txtControlID.setEnabled(true);
                this.btnControlSearch.setEnabled(true);
                this.txtControlQty.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnControlAddActionPerformed

    private void btnControlEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlEditActionPerformed
        if (isSelling) {
            toggleButtonsIfStagingPopulated();
        } else {
            if (!this.isManageEditMode){
                // Enter Manage Edit Mode
                this.isManageEditMode = true;
                this.isManageAddMode = false;
                
                // Texts
                this.txtControlID.setEnabled(false);
                this.txtControlQty.setEnabled(true);
                this.pnlControlText.setVisible(true);
                
                // Buttons
                this.btnControlAdd.setEnabled(false);
                this.btnControlEdit.setText("Exit");
                this.btnControlSearch.setEnabled(false);
                this.btnControlSave.setEnabled(true);
                this.btnControlLeftButton.setEnabled(false);
                this.btnControlRightButton.setEnabled(false);
                
                // Set text values based on selected row in tblData
                int selectedRow = tblData.getSelectedRow();
                if (selectedRow >= 0) {
                    this.txtControlQty.setText(tblData.getValueAt(selectedRow, 3).toString());  // Assuming column 3 is the quantity column
                    this.txtControlName.setText(tblData.getValueAt(selectedRow, 1).toString());  // Assuming column 1 is the name column
                    this.txtControlPrice.setText(tblData.getValueAt(selectedRow, 2).toString()); // Assuming column 2 is the price column
                }
                
                
            } else {
                // Exit Manage Edit Mode
                this.isManageEditMode = false;
                
                // Texts
                this.txtControlID.setEnabled(true);
                this.txtControlQty.setEnabled(false);
                this.txtControlQty.setText("0");
                this.pnlControlText.setVisible(false);
                
                // Buttons
                this.btnControlAdd.setEnabled(true);
                this.btnControlSearch.setEnabled(true);
                this.btnControlEdit.setText("Edit");
                this.btnControlSave.setEnabled(false);
                this.btnControlEdit.setEnabled(false);
                this.btnControlLeftButton.setEnabled(true);
                this.btnControlRightButton.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnControlEditActionPerformed

    private TableCellRenderer getTblDataAlignmentCellRender(TableCellRenderer oldRender, boolean header) {
        return new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component com = oldRender.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (com instanceof JLabel label) {
                    switch (column) {
                        case 0, 4 -> label.setHorizontalAlignment(SwingConstants.CENTER);
                        case 2, 3 -> label.setHorizontalAlignment(SwingConstants.TRAILING);
                        default -> label.setHorizontalAlignment(SwingConstants.LEADING);
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
    
    private void applyTblDataStyle(JTable table) {
        JScrollPane scroll = (JScrollPane) table.getParent().getParent();
        scroll.setBorder(BorderFactory.createEmptyBorder());
        scroll.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Table.background;"
                + "track:$Table.background;"
                + "trackArc:999");

        table.getTableHeader().putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        table.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");

        //  To Create table alignment
        table.getTableHeader().setDefaultRenderer(getTblDataAlignmentCellRender(table.getTableHeader().getDefaultRenderer(), true));
        table.setDefaultRenderer(Object.class, getTblDataAlignmentCellRender(table.getDefaultRenderer(Object.class), false));
    }
    
    
    
    private TableCellRenderer getTblStagingAlignmentCellRender(TableCellRenderer oldRender, boolean header) {
        return new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component com = oldRender.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (com instanceof JLabel label) {
                    switch (column) {
                        case 0 -> label.setHorizontalAlignment(SwingConstants.CENTER);
                        case 2, 3, 4 -> label.setHorizontalAlignment(SwingConstants.TRAILING);
                        default -> label.setHorizontalAlignment(SwingConstants.LEADING);
                    }
                    
//                    if (header == false) {
//                        if (column == 4) {
//                            if (Double.parseDouble(value.toString()) > 0) {
//                                com.setForeground(new Color(17, 182, 60));
//                                label.setText("+" + value);
//                            } else {
//                                com.setForeground(new Color(202, 48, 48));
//                            }
//                        } else {
//                            if (isSelected) {
//                                com.setForeground(table.getSelectionForeground());
//                            } else {
//                                com.setForeground(table.getForeground());
//                            }
//                        }
//                    }
                }
                return com;
            }
        };
    }
    
    private void applyTblStagingStyle(JTable table) {
        JScrollPane scroll = (JScrollPane) table.getParent().getParent();
        scroll.setBorder(BorderFactory.createEmptyBorder());
        scroll.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Table.background;"
                + "track:$Table.background;"
                + "trackArc:999");

        table.getTableHeader().putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");
        table.putClientProperty(FlatClientProperties.STYLE_CLASS, "table_style");

        //  To Create table alignment
        table.getTableHeader().setDefaultRenderer(getTblStagingAlignmentCellRender(table.getTableHeader().getDefaultRenderer(), true));
        table.setDefaultRenderer(Object.class, getTblStagingAlignmentCellRender(table.getDefaultRenderer(Object.class), false));
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
    private javax.swing.JButton btnControlEdit;
    private javax.swing.JButton btnControlLeftButton;
    private javax.swing.JButton btnControlRemove;
    private javax.swing.JButton btnControlRightButton;
    private javax.swing.JButton btnControlSave;
    private javax.swing.JButton btnControlSearch;
    private javax.swing.JButton btnManageTab;
    private javax.swing.JButton btnSellTab;
    private raven.crazypanel.CrazyPanel crzypnlCenter;
    private raven.crazypanel.CrazyPanel crzypnlStaging;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblControlID;
    private javax.swing.JLabel lblControlName;
    private javax.swing.JLabel lblControlPrice;
    private javax.swing.JLabel lblControlQty;
    private javax.swing.JLabel lblDisplayLocation;
    private javax.swing.JLabel lblStagingTotalAmount;
    private javax.swing.JLabel lblStagingTotalLabel;
    private javax.swing.JPanel pnlControlMajotButtons;
    private javax.swing.JPanel pnlControlText;
    private javax.swing.JPanel pnlDisplayLocation;
    private javax.swing.JPanel pnlIDControlID;
    private javax.swing.JPanel pnlIDControlQty;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlNorth;
    private javax.swing.JPanel pnlNorthControls;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPanel pnlSideControls;
    private javax.swing.JPanel pnlTabbedControls;
    private javax.swing.JPanel pnlTotal;
    private javax.swing.JScrollPane scrollData;
    private javax.swing.JScrollPane scrollStaging;
    private javax.swing.JTable tblData;
    private javax.swing.JTable tblStaging;
    private javax.swing.JTextField txtControlID;
    private javax.swing.JTextField txtControlName;
    private javax.swing.JTextField txtControlPrice;
    private javax.swing.JTextField txtControlQty;
    // End of variables declaration//GEN-END:variables
    
    // Operation handling methods

    private void clearStagingTableIfSelling() {
        DefaultTableModel model = (DefaultTableModel) tblStaging.getModel();
        model.setRowCount(0);
        applyTblDataStyle(tblStaging);

        // Clear lblStagingTotalAmount
        lblStagingTotalAmount.setText(String.format("PHP %.2f", 0.0));
    } // QA'ed

    private void searchInTblDataSell() {
        String idToSearch = txtControlID.getText(); // Get the ID to search from the text field
        String nameToSearch = txtControlName.getText(); // Get the name to search from the text field

        DefaultTableModel modelData = (DefaultTableModel) tblData.getModel();

        for (int i = 0; i < modelData.getRowCount(); i++) {
            String idInRow = modelData.getValueAt(i, 0).toString(); // Get the ID in the row
            
            System.out.println("Searching: " + idToSearch);

            if (idInRow.equals(idToSearch)) {
                // If the ID in the row matches the ID to search, or the name in the row contains the name to search, select the row
                tblData.setRowSelectionInterval(i, i);

                System.out.println("Found");
                // Scroll to the searched row
                Rectangle rect = tblData.getCellRect(i, 0, true);
                tblData.scrollRectToVisible(rect);

                // Enable the "Add" button and the "txtControlID1" JTextField
                btnControlAdd.setEnabled(true);
                txtControlQty.setEnabled(true);

                break; // Exit the loop as we've found the ID or name to search
            }    
        }
    } // QA'ed

    private void searchInTblDataManage() {
        String idToSearch = txtControlID.getText(); // Get the ID to search from the text field
    
        DefaultTableModel modelData = (DefaultTableModel) tblData.getModel();
    
        for (int i = 0; i < modelData.getRowCount(); i++) {
            String idInRow = modelData.getValueAt(i, 0).toString(); // Get the ID in the row
    
            if (idInRow.equals(idToSearch)) {
                // If the ID or name in the row matches the ID or name to search, select the row
                tblData.setRowSelectionInterval(i, i);
    
                // Scroll to the searched row
                Rectangle rect = tblData.getCellRect(i, 0, true);
                tblData.scrollRectToVisible(rect);
    
                // Enable the "Add" button and the "txtControlID1" JTextField
                txtControlQty.setEnabled(true);
    
                break; // Exit the loop as we've found the ID or name to search
            }    
        }
        
        btnControlEdit.setEnabled(true);
    }



    private void addSelectedRowToTblStaging() {
        DefaultTableModel modelData = (DefaultTableModel) tblData.getModel();
        DefaultTableModel modelStaging = (DefaultTableModel) tblStaging.getModel();
        
        // Autoselect item to add when in editing mode
        if (isSalesEditingMode){
            searchInTblDataSell();
        }

        int selectedRow = tblData.getSelectedRow(); // Get the selected row
        int id = Integer.parseInt(modelData.getValueAt(selectedRow, 0).toString()); // Get the ID in the selected row
        String name = modelData.getValueAt(selectedRow, 1).toString(); // Get the name in the selected row
        double price = Double.parseDouble(modelData.getValueAt(selectedRow, 2).toString()); // Get the price in the selected row
        int qty = Integer.parseInt(txtControlQty.getText()); // Get the quantity from txtControlID1
        
        if (qty == 0 && !isSalesEditingMode){
            this.showMessageDialogue("Please input how many drinks the customer would like to order.");
            return;
        }

        // Check if the item is already in the staging table
        boolean isAlreadyInStaging = false;
        for (int i = 0; i < modelStaging.getRowCount(); i++) {
            int idInStaging = Integer.parseInt(modelStaging.getValueAt(i, 0).toString()); // Get the ID in the row
            if (idInStaging == id) {
                isAlreadyInStaging = true;
                break;
            }
        }
        

        if (isAlreadyInStaging) {
            
            // If the item is already in the staging table, update the quantity
            for (int i = 0; i < modelStaging.getRowCount(); i++) {
                int idInStaging = Integer.parseInt(modelStaging.getValueAt(i, 0).toString()); // Get the ID in the row
                if (idInStaging == id) {
                    int qtyInStaging = Integer.parseInt(modelStaging.getValueAt(i, 3).toString()); // Get the quantity in the row
                    modelStaging.setValueAt(qtyInStaging + qty, i, 3); // Update the quantity
                    modelStaging.setValueAt(String.format("%.2f", (qtyInStaging + qty) * price), i, 4); // Update the total
                    break;
                }
            }
        } else {
            // If the item is not yet in the staging table, add it
            if(!isSalesEditingMode){
                modelStaging.addRow(new Object[]{id, name, String.format("%.2f", price), qty, String.format("%.2f", price * qty )});
            }
        }
        
        // Enable btnControlRemove, btnControlEdit, and btnControlSave if tblStaging is populated
        if (modelStaging.getRowCount() > 0) {
            btnControlEdit.setEnabled(true);
        }

        // Reset txtControlID and txtControlID1 to 0 and disable buttonControlAdd and txtControlID1
        txtControlID.setText("0");
        txtControlQty.setText("0");
        txtControlName.setText("");
        
        if(!isSalesEditingMode){
            btnControlAdd.setEnabled(false);
            txtControlQty.setEnabled(false);
        }
    } // QA'ed

    private void toggleButtonsIfStagingPopulated() {
        // Get the model of tblStaging
        DefaultTableModel modelStaging = (DefaultTableModel) tblStaging.getModel();

        // Check if tblStaging is populated
        if (modelStaging.getRowCount() > 0) {
           if(!isSalesEditingMode){
                this.isSalesEditingMode = true;
                btnControlEdit.setText("Exit");
                btnControlAdd.setEnabled(true);
                btnControlRemove.setEnabled(true);
                txtControlQty.setEnabled(true);
                btnControlSearch.setEnabled(false);
           } else {
                this.isSalesEditingMode = false;
                btnControlEdit.setText("Edit");
                btnControlAdd.setEnabled(false);
                btnControlRemove.setEnabled(false);
                txtControlQty.setEnabled(false);
                btnControlSearch.setEnabled(true);
               
           }
        }
    } //QA'ed

    private void removeRowFromStaging() {
        // Get the model of tblStaging
        DefaultTableModel modelStaging = (DefaultTableModel) tblStaging.getModel();

        // Get the ID or name to remove from txtControlID or txtControlName
        String idOrNameToRemove = txtControlID.getText().isEmpty() ? txtControlName.getText() : txtControlID.getText();

        // Get the quantity to remove from txtControlID1
        int qtyToRemove = Integer.parseInt(txtControlQty.getText());

        double totalAmount = 0.0;

        for (int i = modelStaging.getRowCount() - 1; i >= 0; i--) {
            String idInRow = modelStaging.getValueAt(i, 0).toString(); // Get the ID in the row
            String nameInRow = modelStaging.getValueAt(i, 1).toString(); // Get the name in the row

            int qtyInRow = Integer.parseInt(modelStaging.getValueAt(i, 3).toString()); // Get the quantity in the row

            if (idInRow.equals(idOrNameToRemove) || nameInRow.toLowerCase().startsWith(idOrNameToRemove.toLowerCase())) {
                // If the ID in the row matches the ID to remove, or the name in the row starts with the name to remove, decrease the quantity

                if (qtyInRow > qtyToRemove) {
                    // If the quantity in the row is greater than the quantity to remove, decrease the quantity
                    modelStaging.setValueAt(qtyInRow - qtyToRemove, i, 3);
                    qtyInRow -= qtyToRemove; // Update qtyInRow after decreasing the quantity
                } else {
                    // If the quantity in the row is less than or equal to the quantity to remove, remove the row
                    modelStaging.removeRow(i);
                    continue; // Skip the rest of the loop for this iteration
                }

                // Reset txtControlID, txtControlName and txtControlID1 to "0"
                txtControlID.setText("0");
                txtControlName.setText("");
                txtControlQty.setText("0");
            }

            // Calculate the total amount
            double priceInRow = Double.parseDouble(modelStaging.getValueAt(i, 2).toString()); // Get the price in the row
            totalAmount += priceInRow * qtyInRow;
        }

        // Update the total price in the 5th column of tblStaging
        // Assuming the last row of the table is reserved for displaying the total price
        modelStaging.setValueAt(String.format("%.2f", totalAmount), modelStaging.getRowCount() - 1, 4);

        // Update the total amount in lblStagingTotalAmount
        lblStagingTotalAmount.setText(String.format("PHP %.2f", 0.0));
    } // QA'ed


    private void saveStagingAndToggleButtons() {
        // Disable btnControlRemove
        btnControlRemove.setEnabled(false);

        // Enable btnControlSearch
        btnControlSearch.setEnabled(true);
    }

    private void decreaseQuantityInDataBasedOnStaging() {
        // Get the models of tblData and tblStaging
        DefaultTableModel modelData = (DefaultTableModel) tblData.getModel();
        DefaultTableModel modelStaging = (DefaultTableModel) tblStaging.getModel();

        // Iterate over the rows in tblStaging
        for (int i = 0; i < modelStaging.getRowCount(); i++) {
            int idInStaging = Integer.parseInt(modelStaging.getValueAt(i, 0).toString()); // Get the ID in the row
            int qtyInStaging = Integer.parseInt(modelStaging.getValueAt(i, 3).toString()); // Get the quantity in the row

            // Iterate over the rows in tblData
            for (int j = 0; j < modelData.getRowCount(); j++) {
                int idInData = Integer.parseInt(modelData.getValueAt(j, 0).toString()); // Get the ID in the row

                if (idInData == idInStaging) {
                    // If the ID in tblData matches the ID in tblStaging, decrease the quantity in tblData
                    int qtyInData = Integer.parseInt(modelData.getValueAt(j, 3).toString()); // Get the quantity in the row
                    modelData.setValueAt(qtyInData - qtyInStaging, j, 3); // Update the quantity

                    // Update the quantity in the database
                    DatabaseUtil.reduceStockQuantity(idInData, qtyInStaging);

                    break; // Exit the loop as we've found the ID to update
                }
            }
        }
    } 


    private void updateStagingTotalAmount() {
        // Get the model of tblStaging
        DefaultTableModel modelStaging = (DefaultTableModel) tblStaging.getModel();

        // Update the total
        double total = 0;
        for (int i = 0; i < modelStaging.getRowCount(); i++) {
            double totalInStaging = Double.parseDouble(modelStaging.getValueAt(i, 4).toString()); // Get the total in the row
            total += totalInStaging;
        }

        lblStagingTotalAmount.setText(String.format("PHP %.2f", total));
    } // QA'ed


    public void unstockItem() {
        // Get the ID or name from txtControlID or txtControlName
        String idOrName = txtControlID.getText().isEmpty() ? txtControlName.getText() : txtControlID.getText();

        // Get the quantity to unstock from txtControllerID1
        int quantityToUnstock = Integer.parseInt(txtControlQty.getText());

        // Scroll to the item in txtData that matches the ID or name
        for (int i = 0; i < tblData.getRowCount(); i++) {
            if (tblData.getValueAt(i, 0).toString().equals(idOrName) || tblData.getValueAt(i, 1).toString().equals(idOrName)) {
                // Subtract the quantity from the item's current quantity
                int currentQuantity = Integer.parseInt(tblData.getValueAt(i, 3).toString()); // Changed index to 3
                tblData.setValueAt(currentQuantity - quantityToUnstock, i, 3); // Changed index to 3

                // Update the quantity in the database
                int productId = Integer.parseInt(tblData.getValueAt(i, 0).toString());
                DatabaseUtil.reduceStockQuantity(productId, quantityToUnstock);

                // Scroll to the item
                tblData.setRowSelectionInterval(i, i);
                tblData.scrollRectToVisible(new Rectangle(tblData.getCellRect(i, 0, true)));

                // Reset txtControlID and txtControlID1 to 0
                txtControlID.setText("0");
                txtControlQty.setText("0");

                break;
            }
        }
    }



    public void stockItem() {
        // Get the ID or name from txtControlID or txtControlName
        String id = txtControlID.getText();

        // Get the quantity to stock from txtControllerID1
        int quantityToStock = Integer.parseInt(txtControlQty.getText());

        // Scroll to the item in txtData that matches the ID or name
        for (int i = 0; i < tblData.getRowCount(); i++) {
            if (tblData.getValueAt(i, 0).toString().equals(id)) {
                // Add the quantity to the item's current quantity
                int currentQuantity = Integer.parseInt(tblData.getValueAt(i, 3).toString());
                tblData.setValueAt(currentQuantity + quantityToStock, i, 3);

                // Update the quantity in the database
                int productId = Integer.parseInt(tblData.getValueAt(i, 0).toString());
                DatabaseUtil.addStockQuantity(productId, quantityToStock);

                // Scroll to the item
                tblData.setRowSelectionInterval(i, i);
                tblData.scrollRectToVisible(new Rectangle(tblData.getCellRect(i, 0, true)));

                // Reset txtControlID and txtControlID1 to 0
                txtControlID.setText("0");
                txtControlQty.setText("0");

                break;
            }
        }
    }


    public void addProduct() {
        // Get data from control
        String productName = txtControlName.getText();
        double productPrice = Double.parseDouble(txtControlPrice.getText());
        int productQuantity = Integer.parseInt(txtControlQty.getText());

        // Add the new product to the database
        Product product = DatabaseUtil.addNewProduct(productName, productPrice);
        product.setStockQuantity(productQuantity);

        // Get the ID of the new product

        // Add the initial stock quantity for the new product
        DatabaseUtil.updateStockQuantity(product.getId(), productQuantity);

        // Create a new row with the product data
        Object[] row = new Object[]{product.getId(), product.getName(), String.format("%.2f", product.getPrice()), product.getStockQuantity()};

        // Get the table model
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();

        // Add the new row to the table model
        model.addRow(row);

        // Scroll to the added row and select it
        int rowCount = model.getRowCount();
        tblData.setRowSelectionInterval(rowCount - 1, rowCount - 1);
        Rectangle rect = tblData.getCellRect(rowCount - 1, 0, true);
        tblData.scrollRectToVisible(rect);

        // Reset txtControlName, txtControlPrice, and txtControlID1
        txtControlName.setText("");
        txtControlPrice.setText("0");
        txtControlQty.setText("0");
        
        // Exit Manage Add Mode
        this.isManageAddMode = false;
        this.btnControlAdd.setText("Add New");
        this.pnlControlText.setVisible(false);
        this.txtControlID.setEnabled(true);
        this.btnControlSearch.setEnabled(true);
        this.txtControlQty.setEnabled(false);
    }

    public void editProduct() {
        // Get data from controls
        int productId = Integer.parseInt(txtControlID.getText());
        String productName = txtControlName.getText();
        double productPrice = Double.parseDouble(txtControlPrice.getText());
        int productQuantity = Integer.parseInt(txtControlQty.getText());

        // Update the product in the database
        DatabaseUtil.updateProductName(productId, productName);
        DatabaseUtil.updateProductPrice(productId, productPrice);
        DatabaseUtil.updateStockQuantity(productId, productQuantity);

        // Update the row in the table model
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        int rowCount = model.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            if ((int) model.getValueAt(i, 0) == productId) {
                model.setValueAt(productName, i, 1);
                model.setValueAt(String.format("%.2f", productPrice), i, 2);
                model.setValueAt(productQuantity, i, 3);
                break;
            }
        }

        // Reset controls
        txtControlID.setText("0");
        txtControlName.setText("");
        txtControlPrice.setText("0");
        txtControlQty.setText("0");

        
        // Exit Manage Edit Mode
        this.isManageEditMode = false;
        this.txtControlID.setEnabled(true);
        this.txtControlQty.setEnabled(false);
        this.pnlControlText.setVisible(false);
        this.btnControlAdd.setEnabled(true);
        this.btnControlSearch.setEnabled(true);
        this.btnControlEdit.setText("Edit");
        this.btnControlSave.setEnabled(false);
        this.btnControlEdit.setEnabled(false);
        this.btnControlLeftButton.setEnabled(true);
        this.btnControlRightButton.setEnabled(true);
    }

    
    // Helper methods
    
    public void showMessageDialogue(String message){
        JOptionPane.showMessageDialog(null, message, "The Coffee Canvas", JOptionPane.INFORMATION_MESSAGE);
    }



}