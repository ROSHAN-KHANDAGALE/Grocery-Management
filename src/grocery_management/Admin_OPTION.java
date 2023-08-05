package grocery_management;
import LOGIN_REGISTER.Loginpage;
import BILL_GENERATION.BILL;
import LOGIN_REGISTER.CUSTOMERFRAME;
import REPORTS.*;
/**
 * @author Roshan
 */
public class Admin_OPTION extends javax.swing.JFrame {
    public Admin_OPTION() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        SHP_REG = new javax.swing.JButton();
        CUST_REG = new javax.swing.JButton();
        VENDOR = new javax.swing.JButton();
        ITEMACC = new javax.swing.JButton();
        EMP_NOMINATION = new javax.swing.JButton();
        WAREHOUSE = new javax.swing.JButton();
        RACKLIST = new javax.swing.JButton();
        SIGNOUT = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        About_US = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        CUSTOMER_REPORT = new javax.swing.JButton();
        Vendor_REPORT = new javax.swing.JButton();
        STOCK_INHAND = new javax.swing.JButton();
        BILL_GENERATION = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "WELCOME ADMININSTOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 28), new java.awt.Color(255, 51, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADMINISTRATION OPTIONS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 26))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        SHP_REG.setBackground(new java.awt.Color(153, 153, 153));
        SHP_REG.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SHP_REG.setForeground(new java.awt.Color(255, 255, 255));
        SHP_REG.setText("SHOP REGISTRATION");
        SHP_REG.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SHP_REG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHP_REGActionPerformed(evt);
            }
        });

        CUST_REG.setBackground(new java.awt.Color(0, 204, 204));
        CUST_REG.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CUST_REG.setForeground(new java.awt.Color(255, 255, 255));
        CUST_REG.setText("CUSTOMER ENROLLMENT");
        CUST_REG.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CUST_REG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUST_REGActionPerformed(evt);
            }
        });

        VENDOR.setBackground(new java.awt.Color(255, 153, 0));
        VENDOR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VENDOR.setForeground(new java.awt.Color(255, 255, 255));
        VENDOR.setText("VENDOR MANAGEMENT");
        VENDOR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VENDOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VENDORActionPerformed(evt);
            }
        });

        ITEMACC.setBackground(new java.awt.Color(102, 102, 0));
        ITEMACC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ITEMACC.setForeground(new java.awt.Color(255, 255, 255));
        ITEMACC.setText("ITEM ACCUMULATION");
        ITEMACC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ITEMACC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ITEMACCActionPerformed(evt);
            }
        });

        EMP_NOMINATION.setBackground(new java.awt.Color(0, 0, 102));
        EMP_NOMINATION.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EMP_NOMINATION.setForeground(new java.awt.Color(255, 255, 255));
        EMP_NOMINATION.setText("EMPLOYEE NOMINATION");
        EMP_NOMINATION.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EMP_NOMINATION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMP_NOMINATIONActionPerformed(evt);
            }
        });

        WAREHOUSE.setBackground(new java.awt.Color(125, 0, 0));
        WAREHOUSE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WAREHOUSE.setForeground(new java.awt.Color(255, 255, 255));
        WAREHOUSE.setText("WAREHOUSE REGISTRATION");
        WAREHOUSE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        WAREHOUSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WAREHOUSEActionPerformed(evt);
            }
        });

        RACKLIST.setBackground(new java.awt.Color(0, 153, 51));
        RACKLIST.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RACKLIST.setForeground(new java.awt.Color(255, 255, 255));
        RACKLIST.setText("RACK LISTING");
        RACKLIST.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RACKLIST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RACKLISTActionPerformed(evt);
            }
        });

        SIGNOUT.setBackground(new java.awt.Color(204, 204, 204));
        SIGNOUT.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        SIGNOUT.setForeground(new java.awt.Color(255, 255, 255));
        SIGNOUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGIN_REGISTER/login.png"))); // NOI18N
        SIGNOUT.setText("SIGNOUT");
        SIGNOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGNOUTActionPerformed(evt);
            }
        });

        EXIT.setBackground(new java.awt.Color(255, 51, 51));
        EXIT.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        EXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/exit.png"))); // NOI18N
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        About_US.setBackground(new java.awt.Color(102, 0, 102));
        About_US.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        About_US.setForeground(new java.awt.Color(255, 255, 255));
        About_US.setText("ABOUT US");
        About_US.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                About_USActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CUST_REG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SHP_REG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VENDOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ITEMACC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EMP_NOMINATION, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(WAREHOUSE, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(RACKLIST, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(About_US, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SIGNOUT))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SHP_REG, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CUST_REG, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(VENDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ITEMACC, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EMP_NOMINATION, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(WAREHOUSE, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RACKLIST, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(About_US, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SIGNOUT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EXIT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        CUSTOMER_REPORT.setBackground(new java.awt.Color(255, 0, 0));
        CUSTOMER_REPORT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CUSTOMER_REPORT.setForeground(new java.awt.Color(255, 255, 255));
        CUSTOMER_REPORT.setText("CUSTOMER REPORT GENERATOR");
        CUSTOMER_REPORT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUSTOMER_REPORTActionPerformed(evt);
            }
        });

        Vendor_REPORT.setBackground(new java.awt.Color(255, 204, 0));
        Vendor_REPORT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Vendor_REPORT.setForeground(new java.awt.Color(255, 255, 255));
        Vendor_REPORT.setText("VENDOR REPORT GENERATOR");
        Vendor_REPORT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vendor_REPORTActionPerformed(evt);
            }
        });

        STOCK_INHAND.setBackground(new java.awt.Color(0, 0, 102));
        STOCK_INHAND.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        STOCK_INHAND.setForeground(new java.awt.Color(255, 255, 255));
        STOCK_INHAND.setText("STOCK IN HAND REPORT");
        STOCK_INHAND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STOCK_INHANDActionPerformed(evt);
            }
        });

        BILL_GENERATION.setBackground(new java.awt.Color(0, 0, 204));
        BILL_GENERATION.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BILL_GENERATION.setForeground(new java.awt.Color(255, 255, 255));
        BILL_GENERATION.setText("BILL GENERATION");
        BILL_GENERATION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BILL_GENERATIONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CUSTOMER_REPORT)
                .addGap(18, 18, 18)
                .addComponent(Vendor_REPORT)
                .addGap(18, 18, 18)
                .addComponent(BILL_GENERATION)
                .addGap(18, 18, 18)
                .addComponent(STOCK_INHAND)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CUSTOMER_REPORT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vendor_REPORT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BILL_GENERATION, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(STOCK_INHAND, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/aLG4BE.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void About_USActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_About_USActionPerformed
        CUSTOMERFRAME frame = new CUSTOMERFRAME();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_About_USActionPerformed

    private void BILL_GENERATIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BILL_GENERATIONActionPerformed
        BILL bill_report = new BILL();
        bill_report.setVisible(true);
        dispose();
    }//GEN-LAST:event_BILL_GENERATIONActionPerformed

    private void STOCK_INHANDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STOCK_INHANDActionPerformed
        STOCKINHAND stock = new STOCKINHAND();
        stock.setVisible(true);
        dispose();
    }//GEN-LAST:event_STOCK_INHANDActionPerformed

    private void Vendor_REPORTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vendor_REPORTActionPerformed
        VENDOR_REPORT vendor = new VENDOR_REPORT();
        vendor.setVisible(true);
        dispose();
    }//GEN-LAST:event_Vendor_REPORTActionPerformed

    private void CUSTOMER_REPORTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUSTOMER_REPORTActionPerformed
        CUSTOMER_REPORT CUSTOMER = new CUSTOMER_REPORT();
        CUSTOMER.setVisible(true);
        dispose();
    }//GEN-LAST:event_CUSTOMER_REPORTActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

    private void SIGNOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGNOUTActionPerformed
        Loginpage log = new Loginpage();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_SIGNOUTActionPerformed

    private void RACKLISTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RACKLISTActionPerformed
        Rack_Register rack = new Rack_Register();
        rack.setVisible(true);
        dispose();
    }//GEN-LAST:event_RACKLISTActionPerformed

    private void WAREHOUSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WAREHOUSEActionPerformed
        Warehouse_Register warehouse = new Warehouse_Register();
        warehouse.setVisible(true);
        dispose();
    }//GEN-LAST:event_WAREHOUSEActionPerformed

    private void EMP_NOMINATIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMP_NOMINATIONActionPerformed
        EMP_NOMINATE EMP = new EMP_NOMINATE();
        EMP.setVisible(true);
        dispose();
    }//GEN-LAST:event_EMP_NOMINATIONActionPerformed

    private void ITEMACCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ITEMACCActionPerformed
        ITEM_ACCUMULATION ITEM = new ITEM_ACCUMULATION();
        ITEM.setVisible(true);
        dispose();
    }//GEN-LAST:event_ITEMACCActionPerformed

    private void VENDORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VENDORActionPerformed
        VENDOR_MANAGEMENT Vendor = new VENDOR_MANAGEMENT();
        Vendor.setVisible(true);
        dispose();
    }//GEN-LAST:event_VENDORActionPerformed

    private void CUST_REGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUST_REGActionPerformed
        CUSTOMER_ENROLL customer = new CUSTOMER_ENROLL();
        customer.setVisible(true);
        dispose();
    }//GEN-LAST:event_CUST_REGActionPerformed

    private void SHP_REGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHP_REGActionPerformed
        SHOP_REGISTER shop_reg = new SHOP_REGISTER();
        shop_reg.setVisible(true);
        dispose();
    }//GEN-LAST:event_SHP_REGActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Admin_OPTION().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About_US;
    private javax.swing.JButton BILL_GENERATION;
    private javax.swing.JButton CUSTOMER_REPORT;
    private javax.swing.JButton CUST_REG;
    private javax.swing.JButton EMP_NOMINATION;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton ITEMACC;
    private javax.swing.JButton RACKLIST;
    private javax.swing.JButton SHP_REG;
    private javax.swing.JButton SIGNOUT;
    private javax.swing.JButton STOCK_INHAND;
    private javax.swing.JButton VENDOR;
    private javax.swing.JButton Vendor_REPORT;
    private javax.swing.JButton WAREHOUSE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

}
