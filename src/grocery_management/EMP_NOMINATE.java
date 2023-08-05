package grocery_management;

import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

/**
 * @author Roshan
 */
public class EMP_NOMINATE extends javax.swing.JFrame {
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public EMP_NOMINATE() {
        initComponents();
        Fetch();
    }

    public void Fetch() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery", "", "");
            PreparedStatement pst = con.prepareStatement("SELECT * FROM EMPLOYEE");
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        NAME = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ADDRESS = new javax.swing.JTextArea();
        MOBILE1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        MOBILE2 = new javax.swing.JTextField();
        DOB = new javax.swing.JTextField();
        AGE = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        QUALIFICATION = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        EXPIRENCE = new javax.swing.JTextArea();
        MALE = new javax.swing.JRadioButton();
        FEMALE = new javax.swing.JRadioButton();
        OTHER = new javax.swing.JRadioButton();
        EMAIL = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        REGISTER = new javax.swing.JButton();
        DELETE_UPDATE = new javax.swing.JButton();
        REFRESH = new javax.swing.JButton();
        BACK = new javax.swing.JButton();
        EXIT_BTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMPLOYEE REGISTRATION/ NOMINATION",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 255, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 4, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMPLOYEE-ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID -");

        ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EMPLOYEE NAME");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADDRESS");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MOBILE NO.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MOBILE NO.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("(ADDITIONAL IF ANY)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("E-MAIL");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DATE OF BIRTH");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("AGE");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("GENDER");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("QUALIFICATION DETAILS");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("EXPIRENCE");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("(IF ANY)");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("NOTE - MENTION COMPANY NAME");

        NAME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ADDRESS.setColumns(20);
        ADDRESS.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ADDRESS.setLineWrap(true);
        ADDRESS.setRows(5);
        jScrollPane1.setViewportView(ADDRESS);

        MOBILE1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("+ 91");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("+ 91");

        MOBILE2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        DOB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        AGE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        QUALIFICATION.setColumns(20);
        QUALIFICATION.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        QUALIFICATION.setLineWrap(true);
        QUALIFICATION.setRows(5);
        jScrollPane2.setViewportView(QUALIFICATION);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        EXPIRENCE.setColumns(20);
        EXPIRENCE.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        EXPIRENCE.setLineWrap(true);
        EXPIRENCE.setRows(5);
        jScrollPane3.setViewportView(EXPIRENCE);

        MALE.setBackground(new java.awt.Color(51, 51, 51));
        MALE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MALE.setForeground(new java.awt.Color(255, 255, 255));
        MALE.setText("MALE");
        MALE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MALEActionPerformed(evt);
            }
        });

        FEMALE.setBackground(new java.awt.Color(51, 51, 51));
        FEMALE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FEMALE.setForeground(new java.awt.Color(255, 255, 255));
        FEMALE.setText("FEMALE");
        FEMALE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEMALEActionPerformed(evt);
            }
        });

        OTHER.setBackground(new java.awt.Color(51, 51, 51));
        OTHER.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        OTHER.setForeground(new java.awt.Color(255, 255, 255));
        OTHER.setText("OTHER");
        OTHER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OTHERActionPerformed(evt);
            }
        });

        EMAIL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jLabel14)
                                                        .addComponent(jLabel15))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel16)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(MOBILE1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 130,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(ID,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 73,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(MALE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(FEMALE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(OTHER))
                                                        .addGroup(jPanel2Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                .addComponent(jScrollPane2,
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 186,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jScrollPane3,
                                                                        javax.swing.GroupLayout.Alignment.LEADING))
                                                        .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 188,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 188,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel2Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                .addComponent(EMAIL,
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addComponent(jLabel17)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(MOBILE2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                130,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(jLabel7)))
                                .addContainerGap(9, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(47, 47, 47))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                        Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(MOBILE1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel16)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(MOBILE2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(MALE)
                                        .addComponent(FEMALE)
                                        .addComponent(OTHER))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel15))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                Short.MAX_VALUE))
                                .addContainerGap()));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AVAILABLE RECORDS",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 255, 0))); // NOI18N

        jTable1.setBackground(new java.awt.Color(0, 255, 153));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null }
                },
                new String[] {
                        "ID", "NAME", "ADDRESS", "MOBILE", "PHONE", "EMAIL", "DOB", "AGE", "GENDER", "QUALIFICATION",
                        "EXPERIENCE"
                }));
        jScrollPane4.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(25);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(25);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 3, true));

        REGISTER.setBackground(new java.awt.Color(0, 204, 51));
        REGISTER.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        REGISTER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/sendadd.png"))); // NOI18N
        REGISTER.setText("REGISTER");
        REGISTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTERActionPerformed(evt);
            }
        });

        DELETE_UPDATE.setBackground(new java.awt.Color(255, 51, 51));
        DELETE_UPDATE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DELETE_UPDATE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/setting.png"))); // NOI18N
        DELETE_UPDATE.setText("DELETE/UPDATE");
        DELETE_UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETE_UPDATEActionPerformed(evt);
            }
        });

        REFRESH.setBackground(new java.awt.Color(0, 255, 204));
        REFRESH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        REFRESH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/reset.png"))); // NOI18N
        REFRESH.setText("REFRESH");
        REFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESHActionPerformed(evt);
            }
        });

        BACK.setBackground(new java.awt.Color(255, 153, 0));
        BACK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BACK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/home.png"))); // NOI18N
        BACK.setText("BACK TO MENU");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        EXIT_BTN.setBackground(new java.awt.Color(204, 153, 0));
        EXIT_BTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EXIT_BTN.setForeground(new java.awt.Color(255, 255, 255));
        EXIT_BTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/exit.png"))); // NOI18N
        EXIT_BTN.setText("EXIT");
        EXIT_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXIT_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(REGISTER, javax.swing.GroupLayout.PREFERRED_SIZE, 174,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(DELETE_UPDATE)
                                .addGap(104, 104, 104)
                                .addComponent(REFRESH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BACK)
                                .addGap(78, 78, 78)
                                .addComponent(EXIT_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(REGISTER)
                                        .addComponent(DELETE_UPDATE)
                                        .addComponent(REFRESH)
                                        .addComponent(BACK)
                                        .addComponent(EXIT_BTN))
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
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void REGISTERActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_REGISTERActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery", "", "");
            PreparedStatement pst = con.prepareStatement(
                    "insert into EMPLOYEE(ID,NAME,ADDRESS,MOBILE1,MOBILE2,EMAIL,DOB,AGE,GENDER,QUALIFICATION,EXPERIENCE) values(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, ID.getText());
            pst.setString(2, NAME.getText());
            pst.setString(3, ADDRESS.getText());
            pst.setString(4, MOBILE1.getText());
            pst.setString(5, MOBILE2.getText());
            pst.setString(6, EMAIL.getText());
            pst.setString(7, DOB.getText());
            pst.setString(8, AGE.getText());
            if (MALE.isSelected()) {
                pst.setString(9, MALE.getText());
            }
            if (FEMALE.isSelected()) {
                pst.setString(9, FEMALE.getText());
            }
            if (OTHER.isSelected()) {
                pst.setString(9, OTHER.getText());
            }
            pst.setString(10, QUALIFICATION.getText());
            pst.setString(11, EXPIRENCE.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "DATA SUCCESSFULLY REGISTERED");
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, "INVALID INSERTION!!");
        }
        Fetch();
    }// GEN-LAST:event_REGISTERActionPerformed

    private void MALEActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_MALEActionPerformed
        if (MALE.isSelected()) {
            FEMALE.setSelected(false);
            OTHER.setSelected(false);
        }
    }// GEN-LAST:event_MALEActionPerformed

    private void FEMALEActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FEMALEActionPerformed
        if (FEMALE.isSelected()) {
            MALE.setSelected(false);
            OTHER.setSelected(false);
        }
    }// GEN-LAST:event_FEMALEActionPerformed

    private void OTHERActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_OTHERActionPerformed
        if (OTHER.isSelected()) {
            MALE.setSelected(false);
            FEMALE.setSelected(false);
        }
    }// GEN-LAST:event_OTHERActionPerformed

    private void DELETE_UPDATEActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DELETE_UPDATEActionPerformed
        EmployeeEdit EMP_EDIT = new EmployeeEdit();
        EMP_EDIT.setVisible(true);
        dispose();
    }// GEN-LAST:event_DELETE_UPDATEActionPerformed

    private void REFRESHActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_REFRESHActionPerformed
        ID.setText(null);
        NAME.setText(null);
        ADDRESS.setText(null);
        MOBILE1.setText(null);
        MOBILE2.setText(null);
        EMAIL.setText(null);
        DOB.setText(null);
        AGE.setText(null);
        MALE.setSelected(false);
        FEMALE.setSelected(false);
        OTHER.setSelected(false);
        QUALIFICATION.setText(null);
        EXPIRENCE.setText(null);
    }// GEN-LAST:event_REFRESHActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BACKActionPerformed
        Admin_OPTION option = new Admin_OPTION();
        option.setVisible(true);
        dispose();
    }// GEN-LAST:event_BACKActionPerformed

    private void EXIT_BTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EXIT_BTNActionPerformed
        System.exit(0);
    }// GEN-LAST:event_EXIT_BTNActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new EMP_NOMINATE().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ADDRESS;
    private javax.swing.JTextField AGE;
    private javax.swing.JButton BACK;
    private javax.swing.JButton DELETE_UPDATE;
    private javax.swing.JTextField DOB;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JButton EXIT_BTN;
    private javax.swing.JTextArea EXPIRENCE;
    private javax.swing.JRadioButton FEMALE;
    private javax.swing.JTextField ID;
    private javax.swing.JRadioButton MALE;
    private javax.swing.JTextField MOBILE1;
    private javax.swing.JTextField MOBILE2;
    private javax.swing.JTextField NAME;
    private javax.swing.JRadioButton OTHER;
    private javax.swing.JTextArea QUALIFICATION;
    private javax.swing.JButton REFRESH;
    private javax.swing.JButton REGISTER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
