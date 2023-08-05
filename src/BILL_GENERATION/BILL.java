package BILL_GENERATION;
import grocery_management.Admin_OPTION;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
/**
 * @author Roshan
 */
public class BILL extends javax.swing.JFrame {

    String link = "jdbc:mysql://localhost:3306/grocery";
    String username = "";
    String pass = "";
    public int FinalTotal = 0;
    public int finaltaxamt = 0;
 
    public BILL() {
        initComponents();
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        DATE17.setText(format.format(date));
        Calendar Cal = Calendar.getInstance();
        Cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        TIME17.setText(sdf.format(Cal.getTime()));
        TAMT.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Mobile = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        EMAIL = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ADRES = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PRNAME = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        RATE = new javax.swing.JTextField();
        PRID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        QTY = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DESC = new javax.swing.JTextArea();
        TOTAL_BILL_AMOUNT = new javax.swing.JButton();
        REFRESH = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        SAVE_BILL = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TAMT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        PAMT = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        RETURN = new javax.swing.JTextField();
        GENERATE_REPORT = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        CLOSE = new javax.swing.JButton();
        BACK = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        TAX = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        DATE17 = new javax.swing.JLabel();
        TIME17 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BILL GENERATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 51, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUYER DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setText("NAME");

        Name.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setText("MOBILE NO.");

        Mobile.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        Mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel7.setText("EMAIL ADDRESS");

        EMAIL.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        EMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMAILActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel8.setText("ADDRESS");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ADRES.setColumns(20);
        ADRES.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        ADRES.setLineWrap(true);
        ADRES.setRows(5);
        ADRES.setTabSize(4);
        ADRES.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ADRES);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setText("+ 91");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUCT DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(102, 0, 102))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setText("PRODUCT ID");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setText("PRODUCT NAME");

        PRNAME.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel9.setText("RATE");

        RATE.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        PRID.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel11.setText("QUANTITY");

        QTY.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel12.setText("DESCRIPTION");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        DESC.setColumns(20);
        DESC.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        DESC.setLineWrap(true);
        DESC.setRows(5);
        DESC.setTabSize(4);
        DESC.setWrapStyleWord(true);
        jScrollPane2.setViewportView(DESC);

        TOTAL_BILL_AMOUNT.setBackground(new java.awt.Color(255, 153, 0));
        TOTAL_BILL_AMOUNT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TOTAL_BILL_AMOUNT.setForeground(new java.awt.Color(255, 255, 255));
        TOTAL_BILL_AMOUNT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BILL_GENERATION/pay2.png"))); // NOI18N
        TOTAL_BILL_AMOUNT.setText("TOTAL AMOUNT");
        TOTAL_BILL_AMOUNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTAL_BILL_AMOUNTActionPerformed(evt);
            }
        });

        REFRESH.setBackground(new java.awt.Color(153, 51, 0));
        REFRESH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        REFRESH.setForeground(new java.awt.Color(255, 255, 255));
        REFRESH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/reset.png"))); // NOI18N
        REFRESH.setText("REFRESH");
        REFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESHActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel18.setText("ID -");

        SAVE_BILL.setBackground(new java.awt.Color(102, 0, 153));
        SAVE_BILL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SAVE_BILL.setForeground(new java.awt.Color(255, 255, 255));
        SAVE_BILL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/edit.png"))); // NOI18N
        SAVE_BILL.setText("SAVE");
        SAVE_BILL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVE_BILLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PRID, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(RATE, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(PRNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(QTY, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(REFRESH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SAVE_BILL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(TOTAL_BILL_AMOUNT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(TOTAL_BILL_AMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(REFRESH)
                            .addComponent(SAVE_BILL)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(PRID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(PRNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(RATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(QTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CALCULATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(204, 102, 0))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("TOTAL AMOUNT");

        TAMT.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        TAMT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("PAID AMOUNT");

        PAMT.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        PAMT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PAMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAMTActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("TO BE RETURNED");

        RETURN.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        RETURN.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        GENERATE_REPORT.setBackground(new java.awt.Color(153, 0, 255));
        GENERATE_REPORT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GENERATE_REPORT.setForeground(new java.awt.Color(255, 255, 255));
        GENERATE_REPORT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BILL_GENERATION/bill.png"))); // NOI18N
        GENERATE_REPORT.setText("BILL GENERATE");
        GENERATE_REPORT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GENERATE_REPORTActionPerformed(evt);
            }
        });

        RESET.setBackground(new java.awt.Color(0, 102, 51));
        RESET.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RESET.setForeground(new java.awt.Color(255, 255, 255));
        RESET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/reset.png"))); // NOI18N
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        CLOSE.setBackground(new java.awt.Color(255, 0, 0));
        CLOSE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CLOSE.setForeground(new java.awt.Color(255, 255, 255));
        CLOSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/exit.png"))); // NOI18N
        CLOSE.setText("CLOSE");
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });

        BACK.setBackground(new java.awt.Color(0, 204, 204));
        BACK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BACK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grocery_management/home.png"))); // NOI18N
        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("TAXABLE AMOUNT");

        TAX.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        TAX.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TAX.setText("18 %");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel4)
                    .addComponent(jLabel22))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TAMT, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PAMT, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RETURN, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TAX, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(RESET, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GENERATE_REPORT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CLOSE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BACK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(TAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GENERATE_REPORT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RESET)
                    .addComponent(TAMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(BACK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CLOSE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(PAMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(RETURN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(0, 255, 0));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 2, true));
        jTable1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "DESCRIPTION", "QUANTTY", "RATE", "TOTAL"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(51, 0, 102));
        jScrollPane3.setViewportView(jTable1);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel15.setText("DATE :");

        jLabel16.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel16.setText("TIME :");

        DATE17.setBackground(new java.awt.Color(204, 204, 204));
        DATE17.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        DATE17.setForeground(new java.awt.Color(255, 153, 0));
        DATE17.setText("DATETIME");

        TIME17.setBackground(new java.awt.Color(204, 204, 204));
        TIME17.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        TIME17.setForeground(new java.awt.Color(255, 153, 0));
        TIME17.setText("DATETIME");

        jLabel17.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel17.setText("BILLING GENERATION");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BILL_GENERATION/iconfinder_rupay_payment_card_bank_701549 (1).png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BILL_GENERATION/iconfinder_payment_method_master_card_206680.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BILL_GENERATION/iconfinder_payment_method_paypal_206675.png"))); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BILL_GENERATION/iconfinder_bill_payment_4104739.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel20)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(TIME17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(DATE17, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel20)))
                                    .addComponent(jLabel23))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(DATE17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(TIME17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GENERATE_REPORTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GENERATE_REPORTActionPerformed
            BILL_REPORT Bill = new BILL_REPORT();
            Bill.setVisible(true);
            dispose();
    }//GEN-LAST:event_GENERATE_REPORTActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        TAMT.setText(null);
        PAMT.setText(null);
        RETURN.setText(null);
    }//GEN-LAST:event_RESETActionPerformed

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CLOSEActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        try {
            Connection con = DriverManager.getConnection(link, username, pass);
            PreparedStatement pst = con.prepareStatement("SELECT * from customerenroll where Name like '" + Name.getText() + "%'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Name.setText(rs.getString("NAME"));
                EMAIL.setText(rs.getString("EMAIL"));
                Mobile.setText(rs.getString("MOBILE"));
                ADRES.setText(rs.getString("ADDRESS"));
            } else {
                Name.setText(null);
                Mobile.setText(null);
                EMAIL.setText(null);
                ADRES.setText(null);
            }
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, sql);
        }
    }//GEN-LAST:event_NameActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        Admin_OPTION admin = new Admin_OPTION();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_BACKActionPerformed

    private void REFRESHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REFRESHActionPerformed
        PRID.setText(null);
        PRNAME.setText(null);
        DESC.setText(null);
        RATE.setText(null);
        QTY.setText(null);
    }//GEN-LAST:event_REFRESHActionPerformed

    private void EMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMAILActionPerformed
        try {
            Connection con = DriverManager.getConnection(link, username, pass);
            PreparedStatement pst = con.prepareStatement("SELECT * from customerenroll where EMAIL like '" + EMAIL.getText() + "%'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Name.setText(rs.getString("NAME"));
                EMAIL.setText(rs.getString("EMAIL"));
                Mobile.setText(rs.getString("MOBILE"));
                ADRES.setText(rs.getString("ADDRESS"));
            } else {
                Name.setText(null);
                Mobile.setText(null);
                EMAIL.setText(null);
                ADRES.setText(null);
            }
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, sql);
        }
    }//GEN-LAST:event_EMAILActionPerformed

    private void MobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobileActionPerformed
        try {
            Connection con = DriverManager.getConnection(link, username, pass);
            PreparedStatement pst = con.prepareStatement("SELECT * from customerenroll where Mobileno like '" + Mobile.getText() + "%'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Name.setText(rs.getString("NAME"));
                EMAIL.setText(rs.getString("EMAIL"));
                Mobile.setText(rs.getString("MOBILE"));
                ADRES.setText(rs.getString("ADDRESS"));
            } else {
                Name.setText(null);
                Mobile.setText(null);
                EMAIL.setText(null);
                ADRES.setText(null);
            }
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, sql);
        }
    }//GEN-LAST:event_MobileActionPerformed

    private void TOTAL_BILL_AMOUNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTAL_BILL_AMOUNTActionPerformed
        int price = Integer.parseInt(RATE.getText());
        int qty = Integer.parseInt(QTY.getText());
        int Total = price * qty;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{PRNAME.getText(), DESC.getText(), price, qty, Total});
        FinalTotal = FinalTotal + Total;
        int Taxamt = (FinalTotal * 18 / 100);
        finaltaxamt = FinalTotal + Taxamt;
        String finalTotal = String.valueOf(finaltaxamt);
        TAMT.setText(finalTotal);
    }//GEN-LAST:event_TOTAL_BILL_AMOUNTActionPerformed

    private void PAMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAMTActionPerformed
        String Paid = PAMT.getText();
        int amt = Integer.parseInt(Paid);
        finaltaxamt = amt - finaltaxamt;
        String finaltotl = String.valueOf(finaltaxamt);
        RETURN.setText(finaltotl);
        RETURN.setEditable(false);
    }//GEN-LAST:event_PAMTActionPerformed

    private void SAVE_BILLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVE_BILLActionPerformed
        try {
            Connection conn = DriverManager.getConnection(link, username, pass);
            PreparedStatement pst = conn.prepareStatement("INSERT INTO BILLRECORD(NAME,EMAIL,MOBILE,PRODUCT_ID,PRNAME,DESCRIPTION,RATE,QTY,TOTAL,_DATE_) values(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, Name.getText());
            pst.setString(2, EMAIL.getText());
            pst.setString(3, Mobile.getText());
            pst.setString(4, PRID.getText());
            pst.setString(5, PRNAME.getText());
            pst.setString(6, DESC.getText());
            pst.setString(7, RATE.getText());
            pst.setString(8, QTY.getText());
            pst.setString(9, PAMT.getText());
            pst.setString(10, DATE17.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "SAVED SUCESSFULLY!!");
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, sql);
        }
    }//GEN-LAST:event_SAVE_BILLActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BILL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new BILL().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ADRES;
    private javax.swing.JButton BACK;
    private javax.swing.JButton CLOSE;
    private javax.swing.JLabel DATE17;
    private javax.swing.JTextArea DESC;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JButton GENERATE_REPORT;
    private javax.swing.JTextField Mobile;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField PAMT;
    private javax.swing.JTextField PRID;
    private javax.swing.JTextField PRNAME;
    private javax.swing.JTextField QTY;
    private javax.swing.JTextField RATE;
    private javax.swing.JButton REFRESH;
    private javax.swing.JButton RESET;
    private javax.swing.JTextField RETURN;
    private javax.swing.JButton SAVE_BILL;
    private javax.swing.JTextField TAMT;
    private javax.swing.JTextField TAX;
    private javax.swing.JLabel TIME17;
    private javax.swing.JButton TOTAL_BILL_AMOUNT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
