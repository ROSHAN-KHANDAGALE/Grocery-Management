package grocery_management;

import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

/**
 * @author Roshan
 */
public class ITEM_ACCUMULATION extends javax.swing.JFrame {
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ITEM_ACCUMULATION() {
        initComponents();
        Fetch();
    }

    public void Fetch() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery", "", "");
            PreparedStatement pst = con.prepareStatement("SELECT * FROM grocery.item ");
            ResultSet rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, sql);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NAME = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BRAND = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ITM_TYPE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        QTY = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        MNF = new javax.swing.JTextField();
        EXP = new javax.swing.JTextField();
        CONT_TYPE = new javax.swing.JComboBox<>();
        PRICE = new javax.swing.JTextField();
        ORIGIN = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MNF_DETAIL = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        STOCK = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        SAVEBTN = new javax.swing.JButton();
        UPDATEBTN = new javax.swing.JButton();
        REFRESH = new javax.swing.JButton();
        BACKBTN = new javax.swing.JButton();
        EXIT_PAGE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ITEM ACCUMULATION",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 153, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ITEM ID");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID -");

        ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ITEM NAME");

        NAME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ITEM BRAND");

        BRAND.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ITEM TYPE");

        ITM_TYPE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("QUANTITY");

        QTY.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MANUFACTURING DATE");

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EXPIRY DATE");

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CONTAINER TYPE");

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RETAILER's PRIZE");

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("COUNTRY OF ORIGIN");

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("MANUFACTURING DETAILS");

        MNF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        EXP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        CONT_TYPE.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        CONT_TYPE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "** SELECT THE TYPE** ",
                "PLASTIC PACKAGING", "BOX PACKAGING", "BOX + PLASTIC PACKED" }));

        PRICE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ORIGIN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        MNF_DETAIL.setColumns(20);
        MNF_DETAIL.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        MNF_DETAIL.setLineWrap(true);
        MNF_DETAIL.setRows(5);
        jScrollPane1.setViewportView(MNF_DETAIL);

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("AVAILABLE IN STOCK");

        STOCK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel11)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel12)))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(STOCK, javax.swing.GroupLayout.PREFERRED_SIZE, 175,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 93,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(QTY, javax.swing.GroupLayout.PREFERRED_SIZE, 106,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(EXP)
                                                .addComponent(MNF)
                                                .addComponent(ITM_TYPE)
                                                .addComponent(BRAND)
                                                .addComponent(NAME)
                                                .addComponent(CONT_TYPE, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)
                                                .addComponent(ORIGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 166,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane1)))
                                .addContainerGap(32, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(BRAND, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(ITM_TYPE, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(QTY, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(MNF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(EXP, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CONT_TYPE, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(PRICE, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ORIGIN, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 60,
                                                Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(STOCK, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)));

        jPanel3.setBackground(new java.awt.Color(0, 102, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AVAILABLE RECORDS",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 153, 0))); // NOI18N

        jTable1.setBackground(new java.awt.Color(0, 255, 153));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null }
                },
                new String[] {
                        "ID", "NAME", "BRAND", "TYPE", "QTY", "MNF DATE", "EXP DATE", "CONTAINER", "PRICE", "ORIGIN",
                        "DETAILS"
                }));
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(30);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));

        jPanel4.setBackground(new java.awt.Color(0, 102, 51));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        SAVEBTN.setBackground(new java.awt.Color(0, 153, 0));
        SAVEBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SAVEBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/sendadd.png"))); // NOI18N
        SAVEBTN.setText("SAVE ITEM");
        SAVEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEBTNActionPerformed(evt);
            }
        });

        UPDATEBTN.setBackground(new java.awt.Color(255, 0, 0));
        UPDATEBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UPDATEBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/setting.png"))); // NOI18N
        UPDATEBTN.setText("UPDATE/ DELETE RECORD");
        UPDATEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEBTNActionPerformed(evt);
            }
        });

        REFRESH.setBackground(new java.awt.Color(255, 153, 51));
        REFRESH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        REFRESH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/reset.png"))); // NOI18N
        REFRESH.setText("REFRESH");
        REFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESHActionPerformed(evt);
            }
        });

        BACKBTN.setBackground(new java.awt.Color(102, 102, 255));
        BACKBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BACKBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/home.png"))); // NOI18N
        BACKBTN.setText("BACK TO PAGE");
        BACKBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKBTNActionPerformed(evt);
            }
        });

        EXIT_PAGE.setBackground(new java.awt.Color(204, 51, 0));
        EXIT_PAGE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EXIT_PAGE.setForeground(new java.awt.Color(255, 255, 255));
        EXIT_PAGE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/exit.png"))); // NOI18N
        EXIT_PAGE.setText("EXIT");
        EXIT_PAGE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXIT_PAGEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(SAVEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(UPDATEBTN)
                                .addGap(87, 87, 87)
                                .addComponent(REFRESH, javax.swing.GroupLayout.PREFERRED_SIZE, 133,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(BACKBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EXIT_PAGE, javax.swing.GroupLayout.PREFERRED_SIZE, 125,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SAVEBTN)
                                        .addComponent(UPDATEBTN)
                                        .addComponent(REFRESH)
                                        .addComponent(BACKBTN)
                                        .addComponent(EXIT_PAGE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SAVEBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SAVEBTNActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery", "", "");
            PreparedStatement pst = con.prepareStatement(
                    "INSERT INTO Item(ID,NAME,BRAND,ITM_TYPE,QTY,MNF,EXP,CONT_TYPE,PRICE,ORIGIN,MNF_DETAILS,STOCK) values(?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, ID.getText());
            pst.setString(2, NAME.getText());
            pst.setString(3, BRAND.getText());
            pst.setString(4, ITM_TYPE.getText());
            pst.setString(5, QTY.getText());
            pst.setString(6, MNF.getText());
            pst.setString(7, EXP.getText());
            pst.setString(8, CONT_TYPE.getSelectedItem().toString());
            pst.setString(9, PRICE.getText());
            pst.setString(10, ORIGIN.getText());
            pst.setString(11, MNF_DETAIL.getText());
            pst.setString(12, STOCK.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "DATA SUCCESSFULLY ADDED !");
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, "INVALID INSERTION");
        }
        Fetch();
    }// GEN-LAST:event_SAVEBTNActionPerformed

    private void UPDATEBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_UPDATEBTNActionPerformed
        ITEM_EDIT ITM_EDIT = new ITEM_EDIT();
        ITM_EDIT.setVisible(true);
        dispose();
    }// GEN-LAST:event_UPDATEBTNActionPerformed

    private void REFRESHActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_REFRESHActionPerformed
        ID.setText(null);
        NAME.setText(null);
        BRAND.setText(null);
        ITM_TYPE.setText(null);
        QTY.setText(null);
        MNF.setText(null);
        EXP.setText(null);
        CONT_TYPE.setSelectedIndex(0);
        PRICE.setText(null);
        ORIGIN.setText(null);
        MNF_DETAIL.setText(null);
        STOCK.setText(null);
    }// GEN-LAST:event_REFRESHActionPerformed

    private void BACKBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BACKBTNActionPerformed
        Admin_OPTION ADMIN = new Admin_OPTION();
        ADMIN.setVisible(true);
        dispose();
    }// GEN-LAST:event_BACKBTNActionPerformed

    private void EXIT_PAGEActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EXIT_PAGEActionPerformed
        System.exit(0);
    }// GEN-LAST:event_EXIT_PAGEActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ITEM_ACCUMULATION().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACKBTN;
    private javax.swing.JTextField BRAND;
    private javax.swing.JComboBox<String> CONT_TYPE;
    private javax.swing.JButton EXIT_PAGE;
    private javax.swing.JTextField EXP;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField ITM_TYPE;
    private javax.swing.JTextField MNF;
    private javax.swing.JTextArea MNF_DETAIL;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField ORIGIN;
    private javax.swing.JTextField PRICE;
    private javax.swing.JTextField QTY;
    private javax.swing.JButton REFRESH;
    private javax.swing.JButton SAVEBTN;
    private javax.swing.JTextField STOCK;
    private javax.swing.JButton UPDATEBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
