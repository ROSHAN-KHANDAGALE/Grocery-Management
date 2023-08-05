package LOGIN_REGISTER;

import java.awt.Color;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Roshan
 */
public class NEW_USER extends javax.swing.JFrame {
    public NEW_USER() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        USRNAME = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        MAILID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MOBILE = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        USERID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PASS = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        CPASS = new javax.swing.JPasswordField();
        Register = new javax.swing.JButton();
        BACK = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ADRES = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NEW USER REGISTRATION !!",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(255, 255, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("USER FULL NAME");

        USRNAME.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        USRNAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("USER EMAIL - ID");

        MAILID.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        MAILID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("MOBILE NO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("+ 91");

        MOBILE.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        MOBILE.setForeground(new java.awt.Color(0, 51, 255));
        MOBILE.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("USER - ID");

        USERID.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        USERID.setForeground(new java.awt.Color(0, 51, 255));
        USERID.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("PASSWORD");

        PASS.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        PASS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("CONFIRM PASSWORD");

        CPASS.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        CPASS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Register.setBackground(new java.awt.Color(255, 153, 0));
        Register.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Register.setForeground(new java.awt.Color(255, 255, 255));
        Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGIN_REGISTER/new_user.png"))); // NOI18N
        Register.setText("REGISTER");
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegisterMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegisterMouseExited(evt);
            }
        });
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        BACK.setBackground(new java.awt.Color(255, 204, 0));
        BACK.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        BACK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/home.png"))); // NOI18N
        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 0));
        jLabel9.setText("ADDRESS");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ADRES.setColumns(20);
        ADRES.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        ADRES.setLineWrap(true);
        ADRES.setRows(5);
        ADRES.setTabSize(4);
        ADRES.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ADRES);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel2))
                                                .addGap(14, 14, 14)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(USRNAME)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(MOBILE))
                                                        .addComponent(MAILID)
                                                        .addComponent(USERID)
                                                        .addComponent(CPASS)
                                                        .addComponent(PASS)
                                                        .addComponent(jScrollPane1))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(145, 145, 145)
                                                .addComponent(Register)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81,
                                                        Short.MAX_VALUE)
                                                .addComponent(BACK)))
                                .addContainerGap()));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(USRNAME, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(MAILID, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(MOBILE, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(USERID, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(PASS, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(CPASS, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(Register)
                                                .addContainerGap(38, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                .createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BACK)
                                                .addGap(21, 21, 21)))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BACKActionPerformed
        Loginpage Login = new Loginpage();
        Login.setVisible(true);
        dispose();
    }// GEN-LAST:event_BACKActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_RegisterActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery", "", "");
            PreparedStatement stmt = con.prepareStatement(
                    "insert into NewUsers(Fullname,Email,Mobileno,ADDRESS,Customuser,Password,ConfirmPass) values(?,?,?,?,?,?,?)");
            stmt.setString(1, USRNAME.getText());
            stmt.setString(2, MAILID.getText());
            stmt.setString(3, MOBILE.getText());
            stmt.setString(4, ADRES.getText());
            stmt.setString(5, USERID.getText());
            stmt.setString(6, PASS.getText());
            stmt.setString(7, CPASS.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "SUCCESSFULLY REGISTERED !!!!");
            Loginpage Login = new Loginpage();
            Login.setVisible(true);
            dispose();
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, sql);
        }
    }// GEN-LAST:event_RegisterActionPerformed

    private void RegisterMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_RegisterMouseEntered
        Register.setBackground(new Color(0, 255, 102));
    }// GEN-LAST:event_RegisterMouseEntered

    private void RegisterMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_RegisterMouseExited
        Register.setBackground(new Color(255, 153, 0));
    }// GEN-LAST:event_RegisterMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new NEW_USER().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ADRES;
    private javax.swing.JButton BACK;
    private javax.swing.JPasswordField CPASS;
    private javax.swing.JTextField MAILID;
    private javax.swing.JTextField MOBILE;
    private javax.swing.JPasswordField PASS;
    private javax.swing.JButton Register;
    private javax.swing.JTextField USERID;
    private javax.swing.JTextField USRNAME;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
