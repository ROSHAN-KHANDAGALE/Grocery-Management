package REPORTS;

import TABLES.CUSTOMER_TABLE;
import grocery_management.Admin_OPTION;
import java.awt.print.PrinterException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Roshan
 */
public class CUSTOMER_REPORT extends javax.swing.JFrame {
    String link = "jdbc:mysql://localhost:3306/grocery";
    String username = "";
    String pass = "";

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public CUSTOMER_REPORT() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IDF = new javax.swing.JTextField();
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
        Gender = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        GENERATE = new javax.swing.JButton();
        PRINT = new javax.swing.JButton();
        REFRESH = new javax.swing.JButton();
        Database_SHow = new javax.swing.JButton();
        BACK_PAGE = new javax.swing.JButton();
        EXIT_SYSTEM = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        RECIEPT = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CUSTOMER REPORT GENERATOR",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 3, true));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUSTOMER - ID");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CUST -");

        IDF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDFActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CUSTOMER NAME");

        NAMEF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GENDER");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
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

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DATE OF BIRTH");

        DOBF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("AGE");

        AGEF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MOBILE NO.");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("+ 91");

        MOBILEF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("EMAIL - ID");

        EMAILF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29,
                                        Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(IDF, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(NAMEF, javax.swing.GroupLayout.PREFERRED_SIZE, 184,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(MOBILEF, javax.swing.GroupLayout.PREFERRED_SIZE, 153,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(AGEF,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(EMAILF,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 185,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(1, 1, 1))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                        .createSequentialGroup()
                                                        .addGroup(jPanel2Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(Gender,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 134,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(DOBF,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 134,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(52, 52, 52))))
                                .addGap(43, 43, 43)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(IDF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(NAMEF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(MOBILEF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(DOBF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AGEF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(EMAILF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(22, Short.MAX_VALUE)));

        jPanel3.setBackground(new java.awt.Color(51, 0, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 4, true));

        GENERATE.setBackground(new java.awt.Color(255, 102, 0));
        GENERATE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GENERATE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/bill.png"))); // NOI18N
        GENERATE.setText("GENERATE REPORT");
        GENERATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GENERATEActionPerformed(evt);
            }
        });

        PRINT.setBackground(new java.awt.Color(255, 153, 0));
        PRINT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PRINT.setForeground(new java.awt.Color(204, 0, 0));
        PRINT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/print.png"))); // NOI18N
        PRINT.setText("PRINT YOUR BILL");
        PRINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRINTActionPerformed(evt);
            }
        });

        REFRESH.setBackground(new java.awt.Color(0, 204, 204));
        REFRESH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        REFRESH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/reset.png"))); // NOI18N
        REFRESH.setText("REFRESH");
        REFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESHActionPerformed(evt);
            }
        });

        Database_SHow.setBackground(new java.awt.Color(255, 255, 255));
        Database_SHow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Database_SHow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/database (1).png"))); // NOI18N
        Database_SHow.setText("GO TO DATABASE");
        Database_SHow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Database_SHowActionPerformed(evt);
            }
        });

        BACK_PAGE.setBackground(new java.awt.Color(204, 204, 0));
        BACK_PAGE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BACK_PAGE.setForeground(new java.awt.Color(255, 0, 51));
        BACK_PAGE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/home.png"))); // NOI18N
        BACK_PAGE.setText("BACK");
        BACK_PAGE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK_PAGEActionPerformed(evt);
            }
        });

        EXIT_SYSTEM.setBackground(new java.awt.Color(255, 0, 0));
        EXIT_SYSTEM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EXIT_SYSTEM.setForeground(new java.awt.Color(255, 255, 255));
        EXIT_SYSTEM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/exit.png"))); // NOI18N
        EXIT_SYSTEM.setText("EXIT SYSTEM");
        EXIT_SYSTEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXIT_SYSTEMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(EXIT_SYSTEM, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(GENERATE)
                                                .addGap(41, 41, 41)
                                                .addComponent(Database_SHow)
                                                .addGap(37, 37, 37)
                                                .addComponent(PRINT)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(REFRESH)
                                                .addGap(50, 50, 50)
                                                .addComponent(BACK_PAGE, javax.swing.GroupLayout.PREFERRED_SIZE, 125,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(GENERATE)
                                        .addComponent(Database_SHow)
                                        .addComponent(PRINT, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(REFRESH)
                                        .addComponent(BACK_PAGE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EXIT_SYSTEM)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        RECIEPT.setColumns(20);
        RECIEPT.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        RECIEPT.setLineWrap(true);
        RECIEPT.setRows(5);
        RECIEPT.setTabSize(4);
        RECIEPT.setWrapStyleWord(true);
        jScrollPane2.setViewportView(RECIEPT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 9, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 628,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));

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

    private void GENERATEActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_GENERATEActionPerformed
        RECIEPT.append("=========================GROCERY MANAGEMENT SYSTEM=========================" + "\n"
                + "\nCUSTOMER REGISTRATION ID\t\t" + IDF.getText()
                + "\n" + "===========================================================================\n"
                + "\nCUSTOMER NAME     : \t" + NAMEF.getText()
                + "\nADDRESS           : \t" + ADRESF.getText()
                + "\nMOBILE NUMBER     : \t+91" + MOBILEF.getText()
                + "\nGENDER            : \t" + Gender.getText()
                + "\nDATE OF BIRTH     : \t" + DOBF.getText()
                + "\nAGE               : \t" + AGEF.getText()
                + "\nEMAIL - ID        : \t" + EMAILF.getText()
                + "\n===========================================================================");
    }// GEN-LAST:event_GENERATEActionPerformed

    private void PRINTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PRINTActionPerformed
        try {
            RECIEPT.print();
        } catch (PrinterException ex) {
            Logger.getLogger(CUSTOMER_REPORT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_PRINTActionPerformed

    private void REFRESHActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_REFRESHActionPerformed
        IDF.setText(null);
        NAMEF.setText(null);
        ADRESF.setText(null);
        MOBILEF.setText(null);
        Gender.setText(null);
        DOBF.setText(null);
        AGEF.setText(null);
        EMAILF.setText(null);
    }// GEN-LAST:event_REFRESHActionPerformed

    private void Database_SHowActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Database_SHowActionPerformed
        CUSTOMER_TABLE table = new CUSTOMER_TABLE();
        table.setVisible(true);
        dispose();
    }// GEN-LAST:event_Database_SHowActionPerformed

    private void BACK_PAGEActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BACK_PAGEActionPerformed
        Admin_OPTION OPTION = new Admin_OPTION();
        OPTION.setVisible(true);
        dispose();
    }// GEN-LAST:event_BACK_PAGEActionPerformed

    private void EXIT_SYSTEMActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EXIT_SYSTEMActionPerformed
        System.exit(0);
    }// GEN-LAST:event_EXIT_SYSTEMActionPerformed

    private void IDFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_IDFActionPerformed
        try {
            Connection con = DriverManager.getConnection(link, username, pass);
            PreparedStatement pst = con.prepareStatement(
                    "CREATE TABLE IF NOT EXIST customerenroll(ID int,NAME varchar(50), ADDRESS varchar(100), MOBILE int, GENDER varchar(6), DOB varchar(8), AGE int, EMAIL varchar(25));SELECT * FROM customerenroll where ID = "
                            + IDF.getText());
            ResultSet result = pst.executeQuery();
            if (result.next() == false) {
                IDF.setText(null);
                NAMEF.setText(null);
                ADRESF.setText(null);
                MOBILEF.setText(null);
                Gender.setText(null);
                DOBF.setText(null);
                AGEF.setText(null);
                EMAILF.setText(null);
                JOptionPane.showMessageDialog(rootPane, "NO RECORD FOUND !!!!");
            } else {
                NAMEF.setText(result.getString("NAME"));
                ADRESF.setText(result.getString("ADDRESS"));
                MOBILEF.setText(result.getString("MOBILE"));
                Gender.setText(result.getString("GENDER"));
                DOBF.setText(result.getString("DOB"));
                AGEF.setText(result.getString("AGE"));
                EMAILF.setText(result.getString("EMAIL"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CUSTOMER_REPORT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_IDFActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER_REPORT.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new CUSTOMER_REPORT().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ADRESF;
    private javax.swing.JTextField AGEF;
    private javax.swing.JButton BACK_PAGE;
    private javax.swing.JTextField DOBF;
    private javax.swing.JButton Database_SHow;
    private javax.swing.JTextField EMAILF;
    private javax.swing.JButton EXIT_SYSTEM;
    private javax.swing.JButton GENERATE;
    private javax.swing.JTextField Gender;
    private javax.swing.JTextField IDF;
    private javax.swing.JTextField MOBILEF;
    private javax.swing.JTextField NAMEF;
    private javax.swing.JButton PRINT;
    private javax.swing.JTextArea RECIEPT;
    private javax.swing.JButton REFRESH;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
