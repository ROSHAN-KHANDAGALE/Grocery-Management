package grocery_management;

import REPORTS.VENDOR_REPORT;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

/**
 * @author Roshan
 */
public class VENDOR_EDIT extends javax.swing.JFrame {
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public VENDOR_EDIT() {
        initComponents();
        Fetch();
    }

    public void Fetch() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery", "", "");
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM grocery.Vendor");
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
        jLabel2 = new javax.swing.JLabel();
        VNDRID = new javax.swing.JTextField();
        SEARCHBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        VNDRNAME = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ADRES = new javax.swing.JTextArea();
        EMAIL = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        MOBILE = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        FAX = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        WEBSITE = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        REPRESENT = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        REVIEWDATE = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        UPDATEBTN = new javax.swing.JButton();
        DELETEBTN = new javax.swing.JButton();
        REFRESHBTN = new javax.swing.JButton();
        BACKBTN = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        REPORT_VENDOR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EDITING VENDORS DATABASES",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 102, 51));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 3, true));
        jPanel2.setForeground(new java.awt.Color(0, 102, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUSTOMER - ID");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VNDR -");

        VNDRID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        SEARCHBTN.setBackground(new java.awt.Color(255, 153, 0));
        SEARCHBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SEARCHBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/search.png"))); // NOI18N
        SEARCHBTN.setText("SEARCH");
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
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VNDRID, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SEARCHBTN)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(VNDRID, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(SEARCHBTN))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel3.setBackground(new java.awt.Color(0, 102, 51));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 3, true));
        jPanel3.setForeground(new java.awt.Color(0, 102, 51));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VENDOR NAME");

        VNDRNAME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADDRESS");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("EMAIL - ID");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ADRES.setColumns(20);
        ADRES.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        ADRES.setLineWrap(true);
        ADRES.setRows(5);
        ADRES.setTabSize(4);
        ADRES.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ADRES);

        EMAIL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MOBILE NO.");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 204, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("+ 91");

        MOBILE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FAX NUMBER");

        FAX.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("WEBSITE");

        WEBSITE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WEBSITE.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("REPRESENTATIVES");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        REPRESENT.setColumns(20);
        REPRESENT.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        REPRESENT.setLineWrap(true);
        REPRESENT.setRows(5);
        REPRESENT.setWrapStyleWord(true);
        jScrollPane2.setViewportView(REPRESENT);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ANNUAL REVIEW DATE");

        REVIEWDATE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 204, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("FAX");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(EMAIL)
                                        .addComponent(jScrollPane1)
                                        .addComponent(jScrollPane2)
                                        .addComponent(VNDRNAME)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel13))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(FAX, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(MOBILE)))
                                        .addComponent(WEBSITE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(REVIEWDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 126,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(VNDRNAME, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(EMAIL, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel12)
                                        .addComponent(MOBILE, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(FAX, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(WEBSITE, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(REVIEWDATE, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                .addContainerGap(13, Short.MAX_VALUE)));

        jPanel4.setBackground(new java.awt.Color(0, 102, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VENDOR's RECORDS",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 204, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(0, 102, 51));

        jTable1.setBackground(new java.awt.Color(102, 255, 102));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null }
                },
                new String[] {
                        "ID", "NAME", "ADDRESS", "EMAIL", "MOBILE", "FAX", "WEBSITE", "REPRESENTATIVE", "REVIEW DATE"
                }));
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(30);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));

        jPanel5.setBackground(new java.awt.Color(0, 102, 51));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 3, true));
        jPanel5.setForeground(new java.awt.Color(0, 102, 51));

        UPDATEBTN.setBackground(new java.awt.Color(0, 204, 0));
        UPDATEBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UPDATEBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/update.png"))); // NOI18N
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
                                        .addComponent(UPDATEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 186,
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(REFRESHBTN)
                                        .addComponent(BACKBTN))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel6.setBackground(new java.awt.Color(0, 102, 51));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 3, true));

        REPORT_VENDOR.setBackground(new java.awt.Color(204, 102, 0));
        REPORT_VENDOR.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        REPORT_VENDOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/edit.png"))); // NOI18N
        REPORT_VENDOR.setText("VENDOR MANAGEMENT REPORT");
        REPORT_VENDOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPORT_VENDORActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(REPORT_VENDOR, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(REPORT_VENDOR, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BACKBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BACKBTNActionPerformed
        VENDOR_MANAGEMENT Vendor = new VENDOR_MANAGEMENT();
        Vendor.setVisible(true);
        dispose();
    }// GEN-LAST:event_BACKBTNActionPerformed

    private void REFRESHBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_REFRESHBTNActionPerformed
        VNDRID.setText(null);
        VNDRNAME.setText(null);
        ADRES.setText(null);
        EMAIL.setText(null);
        MOBILE.setText(null);
        FAX.setText(null);
        WEBSITE.setText(null);
        REPRESENT.setText(null);
        REVIEWDATE.setText(null);
    }// GEN-LAST:event_REFRESHBTNActionPerformed

    private void DELETEBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DELETEBTNActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery", "", "");
            PreparedStatement stmt = con.prepareStatement("DELETE from Vendor where ID = " + VNDRID.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "SUCCESSFULLY DELETED THE RECORD!!");
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, "NO DATA FOUND IN RECORDS");
        }
        Fetch();
    }// GEN-LAST:event_DELETEBTNActionPerformed

    private void UPDATEBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_UPDATEBTNActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery", "", "");
            PreparedStatement stmt = con.prepareStatement(
                    "UPDATE Vendor set NAME = ?,ADDRESS = ?,EMAIL = ?,MOBILE = ?,FAX = ?,WEBSITE = ?,REPRESENTATIVE = ?,REVIEW = ? where ID = "
                            + VNDRID.getText());
            stmt.setString(1, VNDRNAME.getText());
            stmt.setString(2, ADRES.getText());
            stmt.setString(3, EMAIL.getText());
            stmt.setString(4, MOBILE.getText());
            stmt.setString(5, FAX.getText());
            stmt.setString(6, WEBSITE.getText());
            stmt.setString(7, REPRESENT.getText());
            stmt.setString(8, REVIEWDATE.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "UPDATED RECORD!!");
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, "UNSELECTIVE CHOICE OF DATA");
        }
        Fetch();
    }// GEN-LAST:event_UPDATEBTNActionPerformed

    private void SEARCHBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SEARCHBTNActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery", "", "");
            PreparedStatement pst = con.prepareStatement("SELECT * FROM Vendor where ID = " + VNDRID.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next() == false) {
                VNDRID.setText(null);
                VNDRNAME.setText(null);
                ADRES.setText(null);
                EMAIL.setText(null);
                MOBILE.setText(null);
                FAX.setText(null);
                WEBSITE.setText(null);
                REPRESENT.setText(null);
                REVIEWDATE.setText(null);
                JOptionPane.showMessageDialog(rootPane, "NO DATA FOUND");
            } else {
                VNDRNAME.setText(rs.getString("NAME"));
                ADRES.setText(rs.getString("ADDRESS"));
                EMAIL.setText(rs.getString("EMAIL"));
                MOBILE.setText(rs.getString("MOBILE"));
                FAX.setText(rs.getString("FAX"));
                WEBSITE.setText(rs.getString("WEBSITE"));
                REPRESENT.setText(rs.getString("REPRESENTATIVE"));
                REVIEWDATE.setText(rs.getString("REVIEW"));
            }
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, "INVALID DATA ENTRY");
        }
    }// GEN-LAST:event_SEARCHBTNActionPerformed

    private void REPORT_VENDORActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_REPORT_VENDORActionPerformed
        VENDOR_REPORT VENDOR = new VENDOR_REPORT();
        VENDOR.setVisible(true);
        dispose();
    }// GEN-LAST:event_REPORT_VENDORActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new VENDOR_EDIT().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ADRES;
    private javax.swing.JButton BACKBTN;
    private javax.swing.JButton DELETEBTN;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JTextField FAX;
    private javax.swing.JTextField MOBILE;
    private javax.swing.JButton REFRESHBTN;
    private javax.swing.JButton REPORT_VENDOR;
    private javax.swing.JTextArea REPRESENT;
    private javax.swing.JTextField REVIEWDATE;
    private javax.swing.JButton SEARCHBTN;
    private javax.swing.JButton UPDATEBTN;
    private javax.swing.JTextField VNDRID;
    private javax.swing.JTextField VNDRNAME;
    private javax.swing.JTextField WEBSITE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
