package grocery_management;

import REPORTS.CUSTOMER_REPORT;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

/**
 * @author Roshan
 */
public class EDIT_CUST extends javax.swing.JFrame {
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public EDIT_CUST() {
        initComponents();
        FetchData();
        DATE.setEditable(false);
    }

    public void FetchData() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery", "", "");
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM grocery.CustomerEnroll");
            ResultSet rs = stmt.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        IDF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SEARCHBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        NAMEF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ADRESF = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        DOBF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AGEF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        MOBILEF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        EMAILF = new javax.swing.JTextField();
        FEMALE = new javax.swing.JRadioButton();
        MALE = new javax.swing.JRadioButton();
        OTHER = new javax.swing.JRadioButton();
        DATE = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        UPDATEBTN = new javax.swing.JButton();
        DELETEBTN = new javax.swing.JButton();
        REFRESHBTN = new javax.swing.JButton();
        BACKBTN = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        REPORT_BTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 103));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CUSTOMIZE CUSTOMERS SETTING",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 204, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUSTOMER - ID");

        IDF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CUST -");

        SEARCHBTN.setBackground(new java.awt.Color(255, 153, 0));
        SEARCHBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SEARCHBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/search.png"))); // NOI18N
        SEARCHBTN.setText("SEARCH ");
        SEARCHBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDF, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SEARCHBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 125,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(IDF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SEARCHBTN)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CUSTOMER NAME");

        NAMEF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GENDER");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ADDRESS");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ADRESF.setColumns(20);
        ADRESF.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        ADRESF.setLineWrap(true);
        ADRESF.setRows(5);
        jScrollPane1.setViewportView(ADRESF);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DATE OF BIRTH");

        DOBF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("AGE");

        AGEF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MOBILE NO.");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("+ 91");

        MOBILEF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("EMAIL - ID");

        EMAILF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        FEMALE.setBackground(new java.awt.Color(0, 0, 102));
        FEMALE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FEMALE.setForeground(new java.awt.Color(255, 255, 255));
        FEMALE.setText("FEMALE");
        FEMALE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEMALEActionPerformed(evt);
            }
        });

        MALE.setBackground(new java.awt.Color(0, 0, 102));
        MALE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MALE.setForeground(new java.awt.Color(255, 255, 255));
        MALE.setText("MALE");
        MALE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MALEActionPerformed(evt);
            }
        });

        OTHER.setBackground(new java.awt.Color(0, 0, 102));
        OTHER.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OTHER.setForeground(new java.awt.Color(255, 255, 255));
        OTHER.setText("OTHER");
        OTHER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OTHERActionPerformed(evt);
            }
        });

        DATE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("REGISTRATION DATE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel6)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout
                                                .createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel10))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 185,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AGEF, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(MALE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(FEMALE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(OTHER))
                                        .addComponent(NAMEF, javax.swing.GroupLayout.PREFERRED_SIZE, 182,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout
                                                        .createSequentialGroup()
                                                        .addComponent(jLabel11)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(MOBILEF))
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(DOBF, javax.swing.GroupLayout.PREFERRED_SIZE, 128,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(EMAILF, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(NAMEF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(MOBILEF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(MALE)
                                        .addComponent(FEMALE)
                                        .addComponent(OTHER)
                                        .addComponent(jLabel4))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(DOBF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AGEF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(EMAILF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AVAILABLE RECORDS",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 204, 0))); // NOI18N

        jTable1.setBackground(new java.awt.Color(255, 204, 0));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.gray));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null }
                },
                new String[] {
                        "ID", "NAME", "GENDER", "ADDRESS", "DOB", "AGE", "MOBILE", "EMAIL"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(30);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 873,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 10, Short.MAX_VALUE)));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        UPDATEBTN.setBackground(new java.awt.Color(0, 204, 0));
        UPDATEBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UPDATEBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/edit.png"))); // NOI18N
        UPDATEBTN.setText("UPDATE DETAILS");
        UPDATEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEBTNActionPerformed(evt);
            }
        });

        DELETEBTN.setBackground(new java.awt.Color(255, 0, 0));
        DELETEBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DELETEBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/delete.png"))); // NOI18N
        DELETEBTN.setText("DELETE RECORD");
        DELETEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEBTNActionPerformed(evt);
            }
        });

        REFRESHBTN.setBackground(new java.awt.Color(102, 0, 255));
        REFRESHBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        REFRESHBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/reset.png"))); // NOI18N
        REFRESHBTN.setText("REFRESH");
        REFRESHBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESHBTNActionPerformed(evt);
            }
        });

        BACKBTN.setBackground(new java.awt.Color(255, 102, 255));
        BACKBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BACKBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/home.png"))); // NOI18N
        BACKBTN.setText("BACK TO MENU");
        BACKBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(UPDATEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 185,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(REFRESHBTN))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DELETEBTN)
                                        .addComponent(BACKBTN))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(UPDATEBTN)
                                        .addComponent(DELETEBTN))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13,
                                        Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(REFRESHBTN)
                                        .addComponent(BACKBTN))
                                .addContainerGap()));

        jPanel6.setBackground(new java.awt.Color(0, 0, 102));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        REPORT_BTN.setBackground(new java.awt.Color(255, 153, 0));
        REPORT_BTN.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        REPORT_BTN.setText("CUSTOMER's REPORTS");
        REPORT_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPORT_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(REPORT_BTN, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(REPORT_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UPDATEBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_UPDATEBTNActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery", "", "");
            PreparedStatement stmt = con.prepareStatement(
                    "UPDATE CustomerEnroll set NAME = ?,ADDRESS = ?,MOBILE = ?,GENDER = ?,DOB = ?,AGE = ?,EMAIL = ?,REG_DATE = ? where ID = "
                            + IDF.getText());
            stmt.setString(1, NAMEF.getText());
            stmt.setString(2, ADRESF.getText());
            stmt.setString(3, MOBILEF.getText());
            if (MALE.isSelected()) {
                stmt.setString(4, MALE.getText());
            }
            if (FEMALE.isSelected()) {
                stmt.setString(4, FEMALE.getText());
            }
            if (OTHER.isSelected()) {
                stmt.setString(4, OTHER.getText());
            }
            stmt.setString(5, DOBF.getText());
            stmt.setString(6, AGEF.getText());
            stmt.setString(7, EMAILF.getText());
            stmt.setString(8, DATE.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "UPDATED RECORD!!");
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, "UNSELECTIVE CHOICE OF DATA");
        }
        FetchData();
    }// GEN-LAST:event_UPDATEBTNActionPerformed

    private void DELETEBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DELETEBTNActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery", "", "");
            PreparedStatement stmt = con.prepareStatement("DELETE from CustomerEnroll where ID = " + IDF.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "SUCCESSFULLY DELETED THE RECORD!!");
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, "NO DATA FOND IN THE RECORDS");
        }
        FetchData();
    }// GEN-LAST:event_DELETEBTNActionPerformed

    private void REFRESHBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_REFRESHBTNActionPerformed
        IDF.setText(null);
        NAMEF.setText(null);
        ADRESF.setText(null);
        MOBILEF.setText(null);
        MALE.setSelected(false);
        FEMALE.setSelected(false);
        OTHER.setSelected(false);
        DOBF.setText(null);
        AGEF.setText(null);
        EMAILF.setText(null);
        DATE.setText(null);
    }// GEN-LAST:event_REFRESHBTNActionPerformed

    private void BACKBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BACKBTNActionPerformed
        CUSTOMER_ENROLL customer = new CUSTOMER_ENROLL();
        customer.setVisible(true);
        dispose();
    }// GEN-LAST:event_BACKBTNActionPerformed

    private void SEARCHBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SEARCHBTNActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery", "", "");
            PreparedStatement pst = con.prepareStatement("SELECT * FROM CustomerEnroll where ID = " + IDF.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next() == false) {
                NAMEF.setText(null);
                ADRESF.setText(null);
                MOBILEF.setText(null);
                MALE.setSelected(false);
                FEMALE.setSelected(false);
                OTHER.setSelected(false);
                DOBF.setText(null);
                AGEF.setText(null);
                EMAILF.setText(null);
                JOptionPane.showMessageDialog(rootPane, "NO RECORD FOUND");
            } else {
                NAMEF.setText(rs.getString("NAME"));
                ADRESF.setText(rs.getString("ADDRESS"));
                MOBILEF.setText(rs.getString("MOBILE"));
                if (rs.getString("GENDER") != null)
                    switch (rs.getString("GENDER")) {
                        case "MALE" -> MALE.setSelected(true);
                        case "FEMALE" -> FEMALE.setSelected(true);
                        case "OTHER" -> OTHER.setSelected(true);
                        default -> {
                            MALE.setSelected(false);
                            FEMALE.setSelected(false);
                            OTHER.setSelected(false);
                        }
                    }
                DOBF.setText(rs.getString("DOB"));
                AGEF.setText(rs.getString("AGE"));
                EMAILF.setText(rs.getString("EMAIL"));
                DATE.setText(rs.getString("REG_DATE"));
            }
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, "INVALID DATA ENTRY");
        }
    }// GEN-LAST:event_SEARCHBTNActionPerformed

    private void FEMALEActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FEMALEActionPerformed
        if (FEMALE.isSelected()) {
            MALE.setSelected(false);
            OTHER.setSelected(false);
        }
    }// GEN-LAST:event_FEMALEActionPerformed

    private void MALEActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_MALEActionPerformed
        if (MALE.isSelected()) {
            FEMALE.setSelected(false);
            OTHER.setSelected(false);
        }
    }// GEN-LAST:event_MALEActionPerformed

    private void OTHERActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_OTHERActionPerformed
        if (OTHER.isSelected()) {
            MALE.setSelected(false);
            FEMALE.setSelected(false);
        }
    }// GEN-LAST:event_OTHERActionPerformed

    private void REPORT_BTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_REPORT_BTNActionPerformed
        CUSTOMER_REPORT REPORT = new CUSTOMER_REPORT();
        REPORT.setVisible(true);
        dispose();
    }// GEN-LAST:event_REPORT_BTNActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new EDIT_CUST().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ADRESF;
    private javax.swing.JTextField AGEF;
    private javax.swing.JButton BACKBTN;
    private javax.swing.JTextField DATE;
    private javax.swing.JButton DELETEBTN;
    private javax.swing.JTextField DOBF;
    private javax.swing.JTextField EMAILF;
    private javax.swing.JRadioButton FEMALE;
    private javax.swing.JTextField IDF;
    private javax.swing.JRadioButton MALE;
    private javax.swing.JTextField MOBILEF;
    private javax.swing.JTextField NAMEF;
    private javax.swing.JRadioButton OTHER;
    private javax.swing.JButton REFRESHBTN;
    private javax.swing.JButton REPORT_BTN;
    private javax.swing.JButton SEARCHBTN;
    private javax.swing.JButton UPDATEBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}