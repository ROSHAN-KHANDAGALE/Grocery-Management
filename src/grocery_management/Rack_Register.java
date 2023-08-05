package grocery_management;

import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

/**
 * @author Roshan
 */
public class Rack_Register extends javax.swing.JFrame {
    String link = "jdbc:mysql://localhost:3306/grocery";
    String username = "";
    String pass = "";

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Rack_Register() {
        initComponents();
        Fetch();
    }

    public void Fetch() {
        try {
            Connection con = DriverManager.getConnection(link, username, pass);
            PreparedStatement pst = con.prepareStatement("SELECT * FROM RACK");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        RACKNAME = new javax.swing.JTextField();
        SUBRACK = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ITM1 = new javax.swing.JTextField();
        ITM2 = new javax.swing.JTextField();
        ITM3 = new javax.swing.JTextField();
        ITM4 = new javax.swing.JTextField();
        ITM5 = new javax.swing.JTextField();
        ITM6 = new javax.swing.JTextField();
        ITM7 = new javax.swing.JTextField();
        ITM8 = new javax.swing.JTextField();
        ITM9 = new javax.swing.JTextField();
        ITM10 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        ADD_RECORD = new javax.swing.JButton();
        UPDATE_DELETE = new javax.swing.JButton();
        BACK_TOMENU = new javax.swing.JButton();
        REFRESH_BTN = new javax.swing.JButton();
        exit_page = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RACK ORGANIZING",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("RACK - ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("RACK NAME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("SUBSECTION RACK NAME");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ID -");

        ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        RACKNAME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        SUBRACK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SUBRACK)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel14)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 103,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(RACKNAME)))
                                .addGap(60, 60, 60)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(RACKNAME, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(SUBRACK, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ITEM 1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ITEM 2");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ITEM 3");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ITEM 4");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ITEM 5");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ITEM 7");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ITEM 6");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ITEM 8");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ITEM 9");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ITEM 10");

        ITM1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ITM2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ITM3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ITM4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ITM5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ITM6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ITM7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ITM8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ITM9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ITM10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ITM1, javax.swing.GroupLayout.PREFERRED_SIZE, 108,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ITM2, javax.swing.GroupLayout.PREFERRED_SIZE, 108,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ITM3, javax.swing.GroupLayout.PREFERRED_SIZE, 108,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ITM4, javax.swing.GroupLayout.PREFERRED_SIZE, 108,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ITM5, javax.swing.GroupLayout.PREFERRED_SIZE, 108,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel12,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel9,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel10,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel11,
                                                                javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(18, 18, 18))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ITM10, javax.swing.GroupLayout.PREFERRED_SIZE, 108,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ITM9, javax.swing.GroupLayout.PREFERRED_SIZE, 108,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ITM6, javax.swing.GroupLayout.PREFERRED_SIZE, 108,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ITM7, javax.swing.GroupLayout.PREFERRED_SIZE, 108,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ITM8, javax.swing.GroupLayout.PREFERRED_SIZE, 108,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(ITM1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ITM6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(ITM2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ITM7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(ITM3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ITM8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(ITM4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12)
                                        .addComponent(ITM9, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(ITM5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13)
                                        .addComponent(ITM10, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(23, Short.MAX_VALUE)));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));

        ADD_RECORD.setBackground(new java.awt.Color(0, 204, 0));
        ADD_RECORD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ADD_RECORD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/sendadd.png"))); // NOI18N
        ADD_RECORD.setText("ADD ITEMS");
        ADD_RECORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_RECORDActionPerformed(evt);
            }
        });

        UPDATE_DELETE.setBackground(new java.awt.Color(255, 0, 0));
        UPDATE_DELETE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UPDATE_DELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/setting.png"))); // NOI18N
        UPDATE_DELETE.setText("UPDATE/ DELETE");
        UPDATE_DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATE_DELETEActionPerformed(evt);
            }
        });

        BACK_TOMENU.setBackground(new java.awt.Color(204, 255, 204));
        BACK_TOMENU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BACK_TOMENU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/home.png"))); // NOI18N
        BACK_TOMENU.setText("BACK TO MENU");
        BACK_TOMENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK_TOMENUActionPerformed(evt);
            }
        });

        REFRESH_BTN.setBackground(new java.awt.Color(0, 204, 204));
        REFRESH_BTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        REFRESH_BTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/reset.png"))); // NOI18N
        REFRESH_BTN.setText("REFRESH");
        REFRESH_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESH_BTNActionPerformed(evt);
            }
        });

        exit_page.setBackground(new java.awt.Color(153, 0, 153));
        exit_page.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit_page.setForeground(new java.awt.Color(255, 255, 255));
        exit_page.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/exit.png"))); // NOI18N
        exit_page.setText("EXIT");
        exit_page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_pageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(ADD_RECORD, javax.swing.GroupLayout.PREFERRED_SIZE, 156,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(UPDATE_DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 189,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(REFRESH_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 156,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(BACK_TOMENU, javax.swing.GroupLayout.PREFERRED_SIZE, 189,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79,
                                        Short.MAX_VALUE)
                                .addComponent(exit_page, javax.swing.GroupLayout.PREFERRED_SIZE, 153,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ADD_RECORD)
                                        .addComponent(UPDATE_DELETE)
                                        .addComponent(REFRESH_BTN)
                                        .addComponent(BACK_TOMENU)
                                        .addComponent(exit_page))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RACK RECORDS",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jTable1.setBackground(new java.awt.Color(255, 153, 0));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null, null, null, null, null }
                },
                new String[] {
                        "ID", "RACK", "SUBRACK", "ITM1", "ITM2", "ITM3", "ITM4", "ITM5", "ITM6", "ITM7", "ITM8", "ITM9",
                        "ITM10"
                }));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(jPanel3,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel2,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, 0)));
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
                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ADD_RECORDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ADD_RECORDActionPerformed
        try {
            Connection con = DriverManager.getConnection(link, username, pass);
            PreparedStatement pst = con.prepareStatement(
                    "INSERT INTO RACK(ID,RACK_NAME,SUBRACK,ITEM1,ITEM2,ITEM3,ITEM4,ITEM5,ITEM6,ITEM7,ITEM8,ITEM9,ITEM10) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, ID.getText());
            pst.setString(2, RACKNAME.getText());
            pst.setString(3, SUBRACK.getText());
            pst.setString(4, ITM1.getText());
            pst.setString(5, ITM2.getText());
            pst.setString(6, ITM3.getText());
            pst.setString(7, ITM4.getText());
            pst.setString(8, ITM5.getText());
            pst.setString(9, ITM6.getText());
            pst.setString(10, ITM7.getText());
            pst.setString(11, ITM8.getText());
            pst.setString(12, ITM9.getText());
            pst.setString(13, ITM10.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "SUCCESSFULLY INSERTED RECORD!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "INVALID ENTRY OF DATA");
        }
        Fetch();
    }// GEN-LAST:event_ADD_RECORDActionPerformed

    private void UPDATE_DELETEActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_UPDATE_DELETEActionPerformed
        RACK_EDIT EDIT = new RACK_EDIT();
        EDIT.setVisible(true);
        dispose();
    }// GEN-LAST:event_UPDATE_DELETEActionPerformed

    private void REFRESH_BTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_REFRESH_BTNActionPerformed
        ID.setText(null);
        RACKNAME.setText(null);
        SUBRACK.setText(null);
        ITM1.setText(null);
        ITM2.setText(null);
        ITM3.setText(null);
        ITM4.setText(null);
        ITM5.setText(null);
        ITM6.setText(null);
        ITM7.setText(null);
        ITM8.setText(null);
        ITM9.setText(null);
        ITM10.setText(null);
    }// GEN-LAST:event_REFRESH_BTNActionPerformed

    private void BACK_TOMENUActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BACK_TOMENUActionPerformed
        Admin_OPTION option = new Admin_OPTION();
        option.setVisible(true);
        dispose();
    }// GEN-LAST:event_BACK_TOMENUActionPerformed

    private void exit_pageActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exit_pageActionPerformed
        System.exit(0);
    }// GEN-LAST:event_exit_pageActionPerformed

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
            java.util.logging.Logger.getLogger(Rack_Register.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Rack_Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD_RECORD;
    private javax.swing.JButton BACK_TOMENU;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField ITM1;
    private javax.swing.JTextField ITM10;
    private javax.swing.JTextField ITM2;
    private javax.swing.JTextField ITM3;
    private javax.swing.JTextField ITM4;
    private javax.swing.JTextField ITM5;
    private javax.swing.JTextField ITM6;
    private javax.swing.JTextField ITM7;
    private javax.swing.JTextField ITM8;
    private javax.swing.JTextField ITM9;
    private javax.swing.JTextField RACKNAME;
    private javax.swing.JButton REFRESH_BTN;
    private javax.swing.JTextField SUBRACK;
    private javax.swing.JButton UPDATE_DELETE;
    private javax.swing.JButton exit_page;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
