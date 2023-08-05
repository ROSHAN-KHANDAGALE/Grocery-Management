package REPORTS;

import TABLES.VENDOR_TABLE;
import grocery_management.Admin_OPTION;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author Roshan
 */
public class VENDOR_REPORT extends javax.swing.JFrame {
    String link = "jdbc:mysql://localhost:3306/grocery";
    String username = "";
    String pass = "";

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public VENDOR_REPORT() {
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
        VNDRID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        VNDRNAME = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ADRES = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        EMAIL = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MOBILE = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FAX = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        WEBSITE = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        REPRESENT = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        REVIEWDATE = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        GENERATE = new javax.swing.JButton();
        REFRESH = new javax.swing.JButton();
        BACK_PAGE = new javax.swing.JButton();
        EXIT_SYSTEM = new javax.swing.JButton();
        DATABASE_SHOW = new javax.swing.JButton();
        PRINT_RECORD = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        RECIEPT = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(
                javax.swing.BorderFactory.createTitledBorder(null, "VENDOR REPORT CREATOR",
                        javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18),
                        new java.awt.Color(255, 204, 0)),
                "VENDOR REPORT GENERATOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18),
                new java.awt.Color(255, 255, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 3, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENDOR - ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VNDR -");

        VNDRID.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        VNDRID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VNDRIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VENDOR NAME");

        VNDRNAME.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADRESS");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ADRES.setColumns(20);
        ADRES.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        ADRES.setLineWrap(true);
        ADRES.setRows(5);
        ADRES.setTabSize(4);
        ADRES.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ADRES);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("EMAIL - ID");

        EMAIL.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MOBILE NO.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("+ 91");

        MOBILE.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("FAX NUMBER");

        FAX.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("WEBSITE");

        WEBSITE.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        WEBSITE.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("REPRESENTATIVES");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        REPRESENT.setColumns(20);
        REPRESENT.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        REPRESENT.setLineWrap(true);
        REPRESENT.setRows(5);
        REPRESENT.setWrapStyleWord(true);
        jScrollPane2.setViewportView(REPRESENT);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ANUAL REVIEW DATE");

        REVIEWDATE.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 204, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("FAX");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(
                                                jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel9)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel10)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel1)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel2Layout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel8)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel11)))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(VNDRID, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(WEBSITE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FAX))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(MOBILE))
                                        .addComponent(EMAIL)
                                        .addComponent(VNDRNAME)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203,
                                                Short.MAX_VALUE)
                                        .addComponent(jScrollPane2)
                                        .addComponent(REVIEWDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(VNDRID, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(VNDRNAME, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(MOBILE, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(FAX, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(WEBSITE, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(REVIEWDATE, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11))
                                .addContainerGap(16, Short.MAX_VALUE)));

        jPanel3.setBackground(new java.awt.Color(51, 0, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 4, true));

        GENERATE.setBackground(new java.awt.Color(255, 153, 0));
        GENERATE.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        GENERATE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/bill.png"))); // NOI18N
        GENERATE.setText("GENERATE REPORT");
        GENERATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GENERATEActionPerformed(evt);
            }
        });

        REFRESH.setBackground(new java.awt.Color(0, 204, 204));
        REFRESH.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        REFRESH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/reset.png"))); // NOI18N
        REFRESH.setText("REFRESH");
        REFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESHActionPerformed(evt);
            }
        });

        BACK_PAGE.setBackground(new java.awt.Color(204, 204, 0));
        BACK_PAGE.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        BACK_PAGE.setForeground(new java.awt.Color(255, 0, 51));
        BACK_PAGE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/home.png"))); // NOI18N
        BACK_PAGE.setText("BACK");
        BACK_PAGE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK_PAGEActionPerformed(evt);
            }
        });

        EXIT_SYSTEM.setBackground(new java.awt.Color(255, 0, 0));
        EXIT_SYSTEM.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        EXIT_SYSTEM.setForeground(new java.awt.Color(255, 255, 255));
        EXIT_SYSTEM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/exit.png"))); // NOI18N
        EXIT_SYSTEM.setText("EXIT SYSTEM");
        EXIT_SYSTEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXIT_SYSTEMActionPerformed(evt);
            }
        });

        DATABASE_SHOW.setBackground(new java.awt.Color(153, 153, 0));
        DATABASE_SHOW.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        DATABASE_SHOW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/database (1).png"))); // NOI18N
        DATABASE_SHOW.setText("GO TO DATABASE");
        DATABASE_SHOW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DATABASE_SHOWActionPerformed(evt);
            }
        });

        PRINT_RECORD.setBackground(new java.awt.Color(255, 255, 255));
        PRINT_RECORD.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        PRINT_RECORD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/print.png"))); // NOI18N
        PRINT_RECORD.setText("PRINT REPORT");
        PRINT_RECORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRINT_RECORDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(GENERATE)
                                                .addGap(60, 60, 60)
                                                .addComponent(PRINT_RECORD)
                                                .addGap(64, 64, 64)
                                                .addComponent(DATABASE_SHOW)
                                                .addGap(82, 82, 82)
                                                .addComponent(REFRESH)
                                                .addGap(72, 72, 72)
                                                .addComponent(BACK_PAGE, javax.swing.GroupLayout.PREFERRED_SIZE, 126,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(138, 138, 138)
                                                .addComponent(EXIT_SYSTEM, javax.swing.GroupLayout.PREFERRED_SIZE, 725,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(GENERATE)
                                        .addComponent(PRINT_RECORD)
                                        .addComponent(DATABASE_SHOW)
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
        jScrollPane4.setViewportView(RECIEPT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane4)))
                                .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GENERATEActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_GENERATEActionPerformed
        RECIEPT.append("============================GROCERY MANAGEMENT SYSTEM=============================" + "\n"
                + "\nVENDOR REGISTRATION ID\t\t" + VNDRID.getText()
                + "\n" + "==================================================================================\n"
                + "\nVENDOR NAME      : \t" + VNDRNAME.getText()
                + "\nADDRESS          : \t" + ADRES.getText()
                + "\nEMAIL ID         : \t" + EMAIL.getText()
                + "\nMOBILE NUMBER    : \t+91 " + MOBILE.getText()
                + "\nFAX NUMBER       : \tFAX " + FAX.getText()
                + "\nWEBSITE          : \t" + WEBSITE.getText()
                + "\nREPRESENTATIVES  : \t" + REPRESENT.getText()
                + "\nREVIEW DATE      : \t" + REVIEWDATE.getText()
                + "\n==================================================================================");
    }// GEN-LAST:event_GENERATEActionPerformed

    private void REFRESHActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_REFRESHActionPerformed
        VNDRID.setText(null);
        VNDRNAME.setText(null);
        ADRES.setText(null);
        EMAIL.setText(null);
        MOBILE.setText(null);
        FAX.setText(null);
        WEBSITE.setText(null);
        REPRESENT.setText(null);
        REVIEWDATE.setText(null);
    }// GEN-LAST:event_REFRESHActionPerformed

    private void BACK_PAGEActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BACK_PAGEActionPerformed
        Admin_OPTION OPTION = new Admin_OPTION();
        OPTION.setVisible(true);
        dispose();
    }// GEN-LAST:event_BACK_PAGEActionPerformed

    private void EXIT_SYSTEMActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EXIT_SYSTEMActionPerformed
        System.exit(0);
    }// GEN-LAST:event_EXIT_SYSTEMActionPerformed

    private void DATABASE_SHOWActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DATABASE_SHOWActionPerformed
        VENDOR_TABLE TABLE = new VENDOR_TABLE();
        TABLE.setVisible(true);
        dispose();
    }// GEN-LAST:event_DATABASE_SHOWActionPerformed

    private void PRINT_RECORDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PRINT_RECORDActionPerformed
        try {
            RECIEPT.print();
        } catch (PrinterException ex) {
            Logger.getLogger(VENDOR_REPORT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_PRINT_RECORDActionPerformed

    private void VNDRIDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_VNDRIDActionPerformed
        try {
            Connection con = DriverManager.getConnection(link, username, pass);
            PreparedStatement pst = con.prepareStatement("SELECT * FROM VENDOR where ID = " + VNDRID.getText());
            ResultSet result = pst.executeQuery();
            if (result.next() == false) {
                VNDRID.setText(null);
                VNDRNAME.setText(null);
                ADRES.setText(null);
                EMAIL.setText(null);
                MOBILE.setText(null);
                FAX.setText(null);
                REPRESENT.setText(null);
                REVIEWDATE.setText(null);
                JOptionPane.showMessageDialog(rootPane, "NO RECORD FOUND !!!!");
            } else {
                VNDRNAME.setText(result.getString("NAME"));
                ADRES.setText(result.getString("Address"));
                EMAIL.setText(result.getString("EMAIL"));
                MOBILE.setText(result.getString("MOBILE"));
                FAX.setText(result.getString("FAX"));
                WEBSITE.setText(result.getString("WEBSITE"));
                REPRESENT.setText(result.getString("REPRESENTATIVE"));
                REVIEWDATE.setText(result.getString("REVIEW"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VENDOR_REPORT.class.getName()).log(Level.SEVERE, null, ex);
        }

    }// GEN-LAST:event_VNDRIDActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                } else {
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VENDOR_REPORT.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new VENDOR_REPORT().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ADRES;
    private javax.swing.JButton BACK_PAGE;
    private javax.swing.JButton DATABASE_SHOW;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JButton EXIT_SYSTEM;
    private javax.swing.JTextField FAX;
    private javax.swing.JButton GENERATE;
    private javax.swing.JTextField MOBILE;
    private javax.swing.JButton PRINT_RECORD;
    private javax.swing.JTextArea RECIEPT;
    private javax.swing.JButton REFRESH;
    private javax.swing.JTextArea REPRESENT;
    private javax.swing.JTextField REVIEWDATE;
    private javax.swing.JTextField VNDRID;
    private javax.swing.JTextField VNDRNAME;
    private javax.swing.JTextField WEBSITE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}