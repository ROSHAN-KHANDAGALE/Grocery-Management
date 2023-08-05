package grocery_management;

import LOGIN_REGISTER.Loginpage;
import javax.swing.*;
import java.sql.*;
import java.awt.Color;

/**
 * @author Roshan
 */
public class FRGT_PASS extends javax.swing.JFrame {
    public FRGT_PASS() {
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
        SUBMIT = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        showp = new javax.swing.JCheckBox();
        NEWPASS = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        MAILID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CONPASS = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ReSeT yOuR ForGotTen PasSwOrd !!!!",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 204, 0))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORGOT PASSWORD ?",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ENTER NEW PASSWORD");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("CONFIRM PASSWORD");

        SUBMIT.setBackground(new java.awt.Color(0, 153, 102));
        SUBMIT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SUBMIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/update.png"))); // NOI18N
        SUBMIT.setText("CONFIRM");
        SUBMIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SUBMITMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                SUBMITMouseExited(evt);
            }
        });
        SUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBMITActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/home.png"))); // NOI18N
        jButton1.setText("BACK TO LOGIN PAGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        showp.setBackground(new java.awt.Color(0, 0, 102));
        showp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        showp.setForeground(new java.awt.Color(255, 255, 0));
        showp.setText("SHOW PASSWORD");
        showp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpActionPerformed(evt);
            }
        });

        NEWPASS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NEWPASS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ENTER PHONE NO.");

        MAILID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MAILID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("+ 91");

        CONPASS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CONPASS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGIN_REGISTER/show.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(showp))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(jLabel4)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(SUBMIT,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addGap(35, 35, 35)
                                                                .addComponent(jButton1))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel5)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(MAILID,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        143,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(NEWPASS,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                172,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(CONPASS,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                172,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(10, 10, 10)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(MAILID, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(NEWPASS, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                        Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(showp)))
                                        .addComponent(CONPASS, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SUBMIT)
                                        .addComponent(jButton1))
                                .addContainerGap(25, Short.MAX_VALUE)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showpActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_showpActionPerformed
        if (showp.isSelected()) {
            NEWPASS.setEchoChar((char) 0);
            CONPASS.setEchoChar((char) 0);
        } else {
            NEWPASS.setEchoChar('*');
            CONPASS.setEchoChar('*');
        }
    }// GEN-LAST:event_showpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        Loginpage log = new Loginpage();
        log.setVisible(true);
        dispose();
    }// GEN-LAST:event_jButton1ActionPerformed

    private void SUBMITActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SUBMITActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery", "", "");
            PreparedStatement stmt = con.prepareStatement(
                    "UPDATE NewUsers set Password = ?, ConfirmPass = ? where Mobileno = " + MAILID.getText());
            stmt.setString(1, NEWPASS.getText());
            stmt.setString(2, CONPASS.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "SUCCESSFULLY UPDATED THE PASSWORD");
            Loginpage Login = new Loginpage();
            Login.setVisible(true);
            dispose();
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, "INVALID USERNAME/ PHONENUMEBR " + sql);
        }
    }// GEN-LAST:event_SUBMITActionPerformed

    private void SUBMITMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_SUBMITMouseEntered
        SUBMIT.setBackground(new Color(0, 153, 102));
    }// GEN-LAST:event_SUBMITMouseEntered

    private void SUBMITMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_SUBMITMouseExited
        SUBMIT.setBackground(new Color(255, 153, 0));
    }// GEN-LAST:event_SUBMITMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new FRGT_PASS().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CONPASS;
    private javax.swing.JTextField MAILID;
    private javax.swing.JPasswordField NEWPASS;
    private javax.swing.JButton SUBMIT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox showp;
    // End of variables declaration//GEN-END:variables
}
