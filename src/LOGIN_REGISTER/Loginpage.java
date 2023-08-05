package LOGIN_REGISTER;

import grocery_management.Admin_OPTION;
import grocery_management.FRGT_PASS;
import javax.swing.*;
import java.sql.*;

/**
 * @author Roshan
 */
public class Loginpage extends javax.swing.JFrame {

    public Loginpage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PASSF = new javax.swing.JPasswordField();
        USER = new javax.swing.JTextField();
        LOGB = new javax.swing.JButton();
        FRGTBTN = new javax.swing.JButton();
        newaccount = new javax.swing.JButton();
        showp = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));
        setForeground(java.awt.Color.white);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "WELCOME TO GROCERY STORE MANAGEMENT ",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 51))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGIN",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/LOGIN_REGISTER/iconfinder_icons_password_1564520 (1).png"))); // NOI18N
        jLabel2.setText("PASSWORD");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGIN_REGISTER/user.png"))); // NOI18N
        jLabel3.setText("USERNAME");

        PASSF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PASSF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        USER.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        USER.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LOGB.setBackground(new java.awt.Color(255, 204, 0));
        LOGB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LOGB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGIN_REGISTER/login.png"))); // NOI18N
        LOGB.setText("LOGIN");
        LOGB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGBActionPerformed(evt);
            }
        });

        FRGTBTN.setBackground(new java.awt.Color(255, 255, 255));
        FRGTBTN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        FRGTBTN.setForeground(new java.awt.Color(255, 51, 0));
        FRGTBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGIN_REGISTER/forgot.png"))); // NOI18N
        FRGTBTN.setText("FORGOT YOUR PASSWORD ?");
        FRGTBTN.setBorder(null);
        FRGTBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FRGTBTNActionPerformed(evt);
            }
        });

        newaccount.setBackground(new java.awt.Color(153, 255, 0));
        newaccount.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        newaccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGIN_REGISTER/new_user.png"))); // NOI18N
        newaccount.setText("NEW ACCOUNT !");
        newaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newaccountActionPerformed(evt);
            }
        });

        showp.setBackground(new java.awt.Color(255, 255, 255));
        showp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        showp.setText("SHOW PASSWORD");
        showp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGIN_REGISTER/show.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2))
                                                .addGap(36, 36, 36)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(USER, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(PASSF,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                152,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(23, 23, 23)
                                                                                .addComponent(LOGB)))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(showp)))
                                                .addGap(0, 84, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(FRGTBTN)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(newaccount)))
                                .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(USER, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(PASSF, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2))
                                        .addComponent(showp)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LOGB)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(FRGTBTN)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addComponent(newaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)))));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, Short.MAX_VALUE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FRGTBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FRGTBTNActionPerformed
        FRGT_PASS frgt = new FRGT_PASS();
        frgt.setVisible(true);
        dispose();
    }// GEN-LAST:event_FRGTBTNActionPerformed

    private void showpActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_showpActionPerformed
        if (showp.isSelected()) {
            PASSF.setEchoChar((char) 0);
        } else {
            PASSF.setEchoChar('*');
        }
    }// GEN-LAST:event_showpActionPerformed

    private void LOGBActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_LOGBActionPerformed
        String User = USER.getText();
        String PASS = PASSF.getText();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery", "", "");
            PreparedStatement pst = conn
                    .prepareStatement("SELECT * FROM NewUsers where Customuser = ? and Password = ?");
            pst.setString(1, USER.getText());
            pst.setString(2, PASSF.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(rootPane, "WELCOME " + USER.getText() + " TO GROCERY SHOP");
                Admin_OPTION admin = new Admin_OPTION();
                admin.setVisible(true);
                dispose();
            } else if (User.equals("Admin") && PASS.equals("admin@123#")) {
                JOptionPane.showMessageDialog(null, "WELCOME ADMIN!!");
                Admin_OPTION adminframe = new Admin_OPTION();
                adminframe.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "WRONG USERNAME/ PASSWORD");
            }
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, "INVALID USERNAME/ PASSWORD .....");
        }
    }// GEN-LAST:event_LOGBActionPerformed

    private void newaccountActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_newaccountActionPerformed
        NEW_USER User = new NEW_USER();
        User.setVisible(true);
        dispose();
    }// GEN-LAST:event_newaccountActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Loginpage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FRGTBTN;
    private javax.swing.JButton LOGB;
    private javax.swing.JPasswordField PASSF;
    private javax.swing.JTextField USER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton newaccount;
    private javax.swing.JCheckBox showp;
    // End of variables declaration//GEN-END:variables
}
