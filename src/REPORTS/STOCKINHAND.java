package REPORTS;

import grocery_management.Admin_OPTION;
import java.awt.print.PrinterException;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Roshan
 */
public class STOCKINHAND extends javax.swing.JFrame {
    String link = "jdbc:mysql://localhost:3306/grocery";
    String username = "";
    String pass = "";
    double Retotal = 0;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public STOCKINHAND() {
        initComponents();
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("E dd-MMM-yyyy");
        DATE.setText(format.format(date));
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        ORDERDATE.setText(dateformat.format(date));
        Calendar Cal = Calendar.getInstance();
        Cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        TIME.setText(sdf.format(Cal.getTime()));
        BillID();
    }

    private void BillID() {
        try {
            Connection conn = DriverManager.getConnection(link, username, pass);
            PreparedStatement pst = conn.prepareStatement("SELECT ID FROM STOCK ORDER BY ID DESC LIMIT 1 ");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String num = rs.getString("ID");
                int numlen = num.length();
                String txt = num.substring(0, 2);
                String txt2 = num.substring(2, numlen);
                int val = Integer.parseInt(txt2);
                val++;
                String snum = Integer.toString(val);
                String ftxt = txt + snum;
                BILLNO.setText(ftxt);
            } else {
                BILLNO.setText("ID-001");
            }
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, sql);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RECIEPT = new javax.swing.JTextArea();
        CUSTNAME = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ADRES = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        Generate_BILL = new javax.swing.JButton();
        REFRESH = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        MOBILE = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        EMAIL = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        ORDERDATE = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        NOORDER = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        TAX = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        TOTAL = new javax.swing.JTextField();
        EXIT = new javax.swing.JButton();
        PRINT_BILL = new javax.swing.JButton();
        RESET_BTN = new javax.swing.JButton();
        TOTAL_BTN = new javax.swing.JButton();
        SUBTOTAL = new javax.swing.JTextField();
        SAVE = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        PNAME = new javax.swing.JLabel();
        DESC = new javax.swing.JLabel();
        STOCKLVL = new javax.swing.JLabel();
        OUTSTOCK = new javax.swing.JLabel();
        COST = new javax.swing.JLabel();
        RECDATE = new javax.swing.JLabel();
        PID = new javax.swing.JTextField();
        VALID = new javax.swing.JLabel();
        EXPIRY = new javax.swing.JLabel();
        REMAIN = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        TIME = new javax.swing.JLabel();
        DATE = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BILLNO = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRODUCT Name");

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("REMAINDER");

        jTextField2.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "STOCK iN - HAND REPORT",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 255, 153))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setForeground(java.awt.Color.white);

        RECIEPT.setColumns(20);
        RECIEPT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RECIEPT.setForeground(new java.awt.Color(255, 0, 0));
        RECIEPT.setLineWrap(true);
        RECIEPT.setRows(5);
        RECIEPT.setWrapStyleWord(true);
        jScrollPane2.setViewportView(RECIEPT);

        CUSTNAME.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        CUSTNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUSTNAMEActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel17.setForeground(java.awt.Color.white);
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("CUSTOMER NAME");

        jLabel18.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ADDRESS");

        jScrollPane3.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ADRES.setColumns(20);
        ADRES.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ADRES.setLineWrap(true);
        ADRES.setRows(5);
        ADRES.setTabSize(4);
        ADRES.setWrapStyleWord(true);
        jScrollPane3.setViewportView(ADRES);

        jLabel19.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ORDERD DATE");

        Generate_BILL.setBackground(new java.awt.Color(153, 255, 153));
        Generate_BILL.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        Generate_BILL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/bill.png"))); // NOI18N
        Generate_BILL.setText("GENERATE BILL");
        Generate_BILL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Generate_BILLActionPerformed(evt);
            }
        });

        REFRESH.setBackground(new java.awt.Color(204, 153, 0));
        REFRESH.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        REFRESH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/reset.png"))); // NOI18N
        REFRESH.setText("REFRESH");
        REFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESHActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("MOBILE NAME");

        MOBILE.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        MOBILE.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel27.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("EMAIL ADDRESS");

        EMAIL.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        EMAIL.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel28.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("+ 91");

        ORDERDATE.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        ORDERDATE.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel18)
                                                                        .addComponent(jLabel17)
                                                                        .addComponent(jLabel19))
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addGap(27, 27, 27)
                                                                                .addGroup(jPanel3Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                false)
                                                                                        .addComponent(jScrollPane3,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0, Short.MAX_VALUE)
                                                                                        .addComponent(CUSTNAME,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                165, Short.MAX_VALUE)))
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addGap(29, 29, 29)
                                                                                .addComponent(ORDERDATE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE))))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel27)
                                                                        .addComponent(jLabel26))
                                                                .addGap(27, 27, 27)
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addComponent(jLabel28)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(MOBILE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        131,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(EMAIL))))
                                                .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout
                                                .createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel3Layout.createSequentialGroup()
                                                                        .addComponent(Generate_BILL)
                                                                        .addGap(91, 91, 91))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel3Layout.createSequentialGroup()
                                                                        .addComponent(REFRESH)
                                                                        .addGap(111, 111, 111)))))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 424,
                                        Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(CUSTNAME, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel26)
                                        .addComponent(MOBILE, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27)
                                        .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel19)
                                        .addComponent(ORDERDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(Generate_BILL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(REFRESH)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUCT - ID");

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRODUCT NAME");

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DESCRIPTION");

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("STOCK LEVEL");

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("OUT OF STOCK");

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NO. OF ORDERS");

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("COST");

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RECORDED DATE");

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("VALID FROM");

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ITEM REMAINED");

        NOORDER.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NOORDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOORDERActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("EXPIRY DATE");

        jLabel16.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID -");

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));

        jLabel21.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("TAX");

        TAX.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        TAX.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel22.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel22.setText("SUB TOTAL");

        jLabel23.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel23.setText("TOTAL AMOUNT");

        TOTAL.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        TOTAL.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        EXIT.setBackground(new java.awt.Color(204, 0, 0));
        EXIT.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        EXIT.setForeground(new java.awt.Color(255, 255, 255));
        EXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/exit.png"))); // NOI18N
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        PRINT_BILL.setBackground(new java.awt.Color(255, 153, 0));
        PRINT_BILL.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        PRINT_BILL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/print.png"))); // NOI18N
        PRINT_BILL.setText("PRINT BILL");
        PRINT_BILL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRINT_BILLActionPerformed(evt);
            }
        });

        RESET_BTN.setBackground(new java.awt.Color(153, 153, 153));
        RESET_BTN.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        RESET_BTN.setForeground(new java.awt.Color(255, 255, 255));
        RESET_BTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/reset.png"))); // NOI18N
        RESET_BTN.setText("RESET");
        RESET_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESET_BTNActionPerformed(evt);
            }
        });

        TOTAL_BTN.setBackground(new java.awt.Color(255, 255, 255));
        TOTAL_BTN.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        TOTAL_BTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BILL_GENERATION/pay.png"))); // NOI18N
        TOTAL_BTN.setText("TOTAL");
        TOTAL_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTAL_BTNActionPerformed(evt);
            }
        });

        SUBTOTAL.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        SUBTOTAL.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        SAVE.setBackground(new java.awt.Color(51, 51, 51));
        SAVE.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        SAVE.setForeground(new java.awt.Color(255, 255, 255));
        SAVE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/database (1).png"))); // NOI18N
        SAVE.setText("SAVE");
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 0, 51));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/home.png"))); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TAX, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(50, 50, 50)
                                                .addComponent(jLabel22)
                                                .addGap(18, 18, 18)
                                                .addComponent(SUBTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(64, 64, 64))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(TOTAL_BTN)
                                                .addGap(31, 31, 31)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addGap(18, 18, 18)
                                                .addComponent(TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(SAVE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(PRINT_BILL, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(RESET_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 252,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap()));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(RESET_BTN)
                                                        .addGroup(jPanel2Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(TAX,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel21)
                                                                .addComponent(jLabel22)
                                                                .addComponent(jLabel23)
                                                                .addComponent(TOTAL,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(SUBTOTAL,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(PRINT_BILL,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(EXIT)
                                                        .addComponent(SAVE)
                                                        .addComponent(TOTAL_BTN)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(jButton1)))
                                .addGap(0, 11, Short.MAX_VALUE)));

        PNAME.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        PNAME.setForeground(new java.awt.Color(255, 255, 255));

        DESC.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        DESC.setForeground(new java.awt.Color(255, 255, 255));

        STOCKLVL.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        STOCKLVL.setForeground(new java.awt.Color(255, 255, 255));

        OUTSTOCK.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        OUTSTOCK.setForeground(new java.awt.Color(255, 255, 255));

        COST.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        COST.setForeground(new java.awt.Color(255, 255, 255));

        RECDATE.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        RECDATE.setForeground(new java.awt.Color(255, 255, 255));

        PID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PIDActionPerformed(evt);
            }
        });

        VALID.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        VALID.setForeground(new java.awt.Color(255, 255, 255));

        EXPIRY.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        EXPIRY.setForeground(new java.awt.Color(255, 255, 255));

        REMAIN.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        REMAIN.setForeground(new java.awt.Color(255, 255, 255));
        REMAIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        REMAIN.setText("00");

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel24.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("DATE :");

        jLabel25.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("TIME :");

        TIME.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        TIME.setForeground(new java.awt.Color(255, 255, 255));

        DATE.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        DATE.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69,
                                        Short.MAX_VALUE)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TIME, javax.swing.GroupLayout.PREFERRED_SIZE, 112,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel24)
                                                        .addComponent(jLabel25))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(TIME, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("INVOICE NO.");

        BILLNO.setBackground(new java.awt.Color(255, 255, 255));
        BILLNO.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        BILLNO.setForeground(new java.awt.Color(255, 255, 255));
        BILLNO.setText("NUMBER");

        jLabel20.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REPORTS/iconfinder_bill_416404.png"))); // NOI18N
        jLabel20.setText("GROCERY MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(jLabel8)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel10))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel4)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel11)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel9))
                                                                        .addComponent(jLabel6))))
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                .addComponent(RECDATE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(PNAME,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(DESC,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(STOCKLVL,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(OUTSTOCK,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(COST,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(NOORDER)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel16)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(PID,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                111, Short.MAX_VALUE)))
                                                        .addComponent(BILLNO)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel20)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22,
                                        Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel12)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(VALID,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 88,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(64, 64, 64)
                                                                .addComponent(jLabel15)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(EXPIRY,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 88,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(36, 36, 36)
                                                                .addComponent(jLabel13)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(REMAIN,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 88,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(142, 142, 142))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(41, 41, 41))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addGap(21, 21, 21)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(BILLNO))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel16)
                                                        .addComponent(PID, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(PNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(DESC,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(STOCKLVL,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                20,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(OUTSTOCK,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                20,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jLabel8)
                                                                                        .addComponent(NOORDER,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(jPanel1Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(jLabel9)
                                                                                        .addComponent(COST,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                20,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel10))
                                                                        .addComponent(RECDATE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                20,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel11))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(VALID,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 21,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel12,
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel13)
                                                                        .addComponent(jLabel15)))
                                                        .addComponent(EXPIRY, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(REMAIN, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(6, 6, 6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PIDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PIDActionPerformed
        try {
            Connection conn = DriverManager.getConnection(link, username, pass);
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM item");
            ResultSet rs = pst.executeQuery();
            if (rs.next() == false) {
                PID.setText(null);
                PNAME.setText(null);
                DESC.setText(null);
                STOCKLVL.setText(null);
                OUTSTOCK.setText(null);
                NOORDER.setText(null);
                COST.setText(null);
                RECDATE.setText(null);
                TAX.setText(null);
                SUBTOTAL.setText(null);
                TOTAL.setText(null);
                JOptionPane.showMessageDialog(rootPane, "INVALID DETAILS");
            } else {
                PID.setText(rs.getString("ID"));
                PNAME.setText(rs.getString("NAME"));
                DESC.setText(rs.getString("MNF_DETAILS"));
                STOCKLVL.setText(rs.getString("STOCK"));
                OUTSTOCK.setText(rs.getString("STOCK"));
                COST.setText(rs.getString("PRICE"));
                RECDATE.setText(rs.getString("MNF"));
                VALID.setText(rs.getString("MNF"));
                EXPIRY.setText(rs.getString("EXP"));
            }
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, sql);
        }
    }// GEN-LAST:event_PIDActionPerformed

    private void RESET_BTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_RESET_BTNActionPerformed
        PID.setText(null);
        PNAME.setText(null);
        DESC.setText(null);
        STOCKLVL.setText(null);
        OUTSTOCK.setText(null);
        NOORDER.setText(null);
        COST.setText(null);
        RECDATE.setText(null);
        TAX.setText(null);
        SUBTOTAL.setText(null);
        TOTAL.setText(null);
        VALID.setText(null);
        EXPIRY.setText(null);
        REMAIN.setText(null);
    }// GEN-LAST:event_RESET_BTNActionPerformed

    private void REFRESHActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_REFRESHActionPerformed
        CUSTNAME.setText(null);
        ADRES.setText(null);
        MOBILE.setText(null);
        EMAIL.setText(null);
        RECIEPT.setText(null);
    }// GEN-LAST:event_REFRESHActionPerformed

    private void PRINT_BILLActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PRINT_BILLActionPerformed
        try {
            RECIEPT.print();
        } catch (PrinterException ex) {
            Logger.getLogger(STOCKINHAND.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_PRINT_BILLActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EXITActionPerformed
        System.exit(0);
    }// GEN-LAST:event_EXITActionPerformed

    private void TOTAL_BTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TOTAL_BTNActionPerformed
        double Taxamt = Double.parseDouble(TAX.getText());
        double Subamt = Double.parseDouble(SUBTOTAL.getText());
        double Net;
        Taxamt = (Subamt * Taxamt / 100);
        Net = Subamt + Taxamt;
        TOTAL.setText(String.valueOf(Net));
    }// GEN-LAST:event_TOTAL_BTNActionPerformed

    private void NOORDERActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_NOORDERActionPerformed
        try {
            Connection conn = DriverManager.getConnection(link, username, pass);
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM ITEM ");
            int lvl = Integer.parseInt(STOCKLVL.getText());
            int order = Integer.parseInt(NOORDER.getText());
            int Cal = lvl - order;
            Retotal = Retotal + Cal;
            String finalRemainTotal = String.valueOf(Retotal);
            REMAIN.setText(finalRemainTotal);
            double cost = Integer.parseInt(COST.getText());
            int orderitem = Integer.parseInt(NOORDER.getText());
            double Total = cost * orderitem;
            String finalSubTotal = String.valueOf(Total);
            SUBTOTAL.setText(finalSubTotal);
            pst.executeQuery();
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, sql);
        }
    }// GEN-LAST:event_NOORDERActionPerformed

    private void Generate_BILLActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Generate_BILLActionPerformed
        RECIEPT.append("============= STOCK IN HAND ============="
                + "\n" + "=========GROCERY MANAGEMENT SYSTEM ========" +
                "\n" + "BILL NO   : " + BILLNO.getText() +
                "\n" + "DATE :" + DATE.getText() + "\tTIME :" + TIME.getText() +
                "\n" + "========================================" +
                "\n" + "CUSTOMER NAME  :   " + CUSTNAME.getText() +
                "\n" + "ADDRESS        :   " + ADRES.getText() +
                "\n" + "MOBILE NUMBER  :   +91 " + MOBILE.getText() +
                "\n" + "EMAIL ADDRESS  :   " + EMAIL.getText() +
                "\n" + "ORDER NAME     :   " + PNAME.getText() +
                "\n" + "QUANTITY       :   " + NOORDER.getText() +
                "\n" + "========================================" +
                "\n" + "\tSUBTOTAL  : " + SUBTOTAL.getText() +
                "\n" + "---------------------------------------" +
                "\n" + "\tTOTAL     : " + TOTAL.getText() +
                "\n" + "========================================" +
                "\n" + " \tPLEASE VISIT AGAIN");
    }// GEN-LAST:event_Generate_BILLActionPerformed

    private void CUSTNAMEActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CUSTNAMEActionPerformed
        try {
            Connection conn = DriverManager.getConnection(link, username, pass);
            PreparedStatement pst = conn
                    .prepareStatement("SELECT * FROM customerenroll where NAME like '" + CUSTNAME.getText() + "%'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                CUSTNAME.setText(rs.getString("NAME"));
                ADRES.setText(rs.getString("ADDRESS"));
                MOBILE.setText(rs.getString("MOBILE"));
                EMAIL.setText(rs.getString("EMAIL"));
            } else {
                CUSTNAME.setText(null);
                ADRES.setText(null);
                MOBILE.setText(null);
                EMAIL.setText(null);
            }
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, sql);
        }
    }// GEN-LAST:event_CUSTNAMEActionPerformed

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SAVEActionPerformed
        try {
            Connection conn = DriverManager.getConnection(link, username, pass);
            PreparedStatement pst = conn.prepareStatement(
                    "insert into Stock(ID,BILL_DATE,NAME,ADDRESS,MOBILE,EMAIL,QTY,TAX,SUBTOTAL,TOTAL) values(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, BILLNO.getText());
            pst.setString(2, ORDERDATE.getText());
            pst.setString(3, CUSTNAME.getText());
            pst.setString(4, ADRES.getText());
            pst.setString(5, MOBILE.getText());
            pst.setString(6, EMAIL.getText());
            pst.setString(7, NOORDER.getText());
            pst.setString(8, TAX.getText());
            pst.setString(9, SUBTOTAL.getText());
            pst.setString(10, TOTAL.getText());
            pst.executeUpdate();
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, sql);
        }
        BillID();
    }// GEN-LAST:event_SAVEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        Admin_OPTION option = new Admin_OPTION();
        option.setVisible(true);
        dispose();
    }// GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(STOCKINHAND.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new STOCKINHAND().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ADRES;
    private javax.swing.JLabel BILLNO;
    private javax.swing.JLabel COST;
    private javax.swing.JTextField CUSTNAME;
    private javax.swing.JLabel DATE;
    private javax.swing.JLabel DESC;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JButton EXIT;
    private javax.swing.JLabel EXPIRY;
    private javax.swing.JButton Generate_BILL;
    private javax.swing.JTextField MOBILE;
    private javax.swing.JTextField NOORDER;
    private javax.swing.JLabel ORDERDATE;
    private javax.swing.JLabel OUTSTOCK;
    private javax.swing.JTextField PID;
    private javax.swing.JLabel PNAME;
    private javax.swing.JButton PRINT_BILL;
    private javax.swing.JLabel RECDATE;
    private javax.swing.JTextArea RECIEPT;
    private javax.swing.JButton REFRESH;
    private javax.swing.JLabel REMAIN;
    private javax.swing.JButton RESET_BTN;
    private javax.swing.JButton SAVE;
    private javax.swing.JLabel STOCKLVL;
    private javax.swing.JTextField SUBTOTAL;
    private javax.swing.JTextField TAX;
    private javax.swing.JLabel TIME;
    private javax.swing.JTextField TOTAL;
    private javax.swing.JButton TOTAL_BTN;
    private javax.swing.JLabel VALID;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
