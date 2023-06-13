/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Internalpages;

/**
 *
 * @author SCC-COMLAB
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import Internalpages.LoginForm;
import com.mysql.jdbc.PreparedStatement;
import config.dpconnector;
import static java.awt.Color.BLACK;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class settings extends javax.swing.JInternalFrame {

    /**
     * Creates new form settings
     */
    public settings() {
        initComponents();
        displaydata();
        
    this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
    BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
    bi.setNorthPane(null);

    }
    Color navcolor = new Color(0,102,102);
    Color navbar = new Color (240,240,240);
    Color Hdcolor = new Color (0,102,102);
    Color buttons = new Color(0,153,153);
    
    
    String sDB = "jdbc:mysql://localhost:3306/house_rent";
    String sUSER = "root";
    String userid = null;
    
//    public void joke(){
//            try{
//    dpconnector dbc = new dpconnector();
//    ResultSet rs = dbc.getData("SELECT prod_transaction.trans_id as 'Transaction ID',  prod_buyer.buyer_name 'Buyer Name',prod_table.prod_name as 'Product Name',prod_transaction.trans_quant as 'Quantity', prod_transaction.trans_totalPay "
//                    + "as 'Total Payment' , trans_date as 'Date' FROM prod_table Inner Join prod_transaction ON prod_table.prod_id = prod_transaction.prod_id  "
//                    + "Inner Join prod_buyer ON prod_buyer.buyer_id = prod_transaction.buyer_id");
//    
//    tenant_tracker.setModel(DbUtils.resultSetToTableModel(rs));
//        }catch(SQLException ex){
//        System.out.println("Error Message");
//        }
//    }
 public void displaydata()
    {
        try{
    dpconnector dbc = new dpconnector();
    ResultSet rs = dbc.getData("SELECT trans_table.tr_id as 'Transaction ID', trans_table.t_id as 'Tenant ID', tbl_customer.t_name as 'Tenant First Name', tbl_customer.t_lname as 'Tenant Last Name', tbl_customer.t_contact as 'Contact Number', tbl_rooms.r_id as 'Room ID', trans_table.date as 'Date Rented'  FROM trans_table INNER JOIN tbl_customer ON trans_table.t_id = tbl_customer.t_id INNER JOIN tbl_rooms ON trans_table.r_id = tbl_rooms.r_id");
//      ResultSet rs = dbc.getData("SELECT *  FROM trans_table");

        tenant_tracker.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException ex){
        System.out.println("Error Message");
        }
    DefaultTableModel model = (DefaultTableModel) tenant_tracker.getModel();
    
    TableColumnModel columnModel = tenant_tracker.getColumnModel();
    columnModel.getColumn(2).setPreferredWidth(100);
    columnModel.getColumn(3).setPreferredWidth(100);
    columnModel.getColumn(4).setPreferredWidth(50);
    
    tenant_tracker.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
    tenant_tracker.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
    tenant_tracker.getTableHeader().setOpaque(false);
    tenant_tracker.getTableHeader().setBackground(navcolor);
    tenant_tracker.getTableHeader().setForeground(BLACK);
    tenant_tracker.setRowHeight(25);
    }
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
     public void display(){
        String item = (String)IDS.getText();
        String sql = "SELECT * FROM trans_table INNER JOIN tbl_customer ON trans_table.t_id = tbl_customer.t_id INNER JOIN tbl_rooms ON trans_table.r_id = tbl_rooms.r_id where tr_id = ?";
        try{
        pst = (PreparedStatement) conn.prepareStatement(sql);
        pst.setString(1, item);
        rs = pst.executeQuery();
        
        if(rs.next()){ 
        String fname = rs.getString("tbl_customer.t_name");
        name.setText(fname);
        
        
        String lname = rs.getString("tbl_customer.t_lname");
        lastname.setText(lname);
       
        
//        String st = rs.getString("r_status");
//        jTextField10.setText(st);        
//       
//        
//        String typ = rs.getString("r_type");
//        jTextField11.setText(typ);  
//        
//        
//        String add = rs.getString("r_address");
//        jTextField5.setText(add); 
        
        
        }
        }catch(Exception e){
        
        
        }
        
    }         
            
    
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tenant_tracker = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lastname = new javax.swing.JLabel();
        IDS = new javax.swing.JLabel();
        IDS1 = new javax.swing.JLabel();
        cell = new javax.swing.JLabel();
        IDS2 = new javax.swing.JLabel();
        IDS3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        IDS4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        IDS5 = new javax.swing.JLabel();
        IDS6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        IDS7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        IDS8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        IDS9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        IDS10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(224, 152, 67));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBackground(new java.awt.Color(224, 152, 67));
        jPanel2.setPreferredSize(new java.awt.Dimension(790, 1500));
        jPanel2.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jPanel2MouseWheelMoved(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(236, 24, 1));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 430, 80, 30));

        jPanel3.setBackground(new java.awt.Color(178, 63, 48));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROPERTY REPORTS");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 410, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 110));

        tenant_tracker.setBackground(new java.awt.Color(255, 211, 138));
        tenant_tracker.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tenant_tracker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tenant_tracker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tenant_trackerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tenant_tracker);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 750, 250));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("TENANT TRACKER");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 190, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/131018-OS55ZP-612-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 410, 500, 440));

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, 90, 30));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PAYMENT RECEIPT ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 5, 280, 70));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 500, -1));

        lastname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastname.setText("Tumampo");
        jPanel1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 120, 30));

        IDS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDS.setText("1");
        jPanel1.add(IDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 60, 30));

        IDS1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDS1.setText("Cell:");
        jPanel1.add(IDS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 50, 30));

        cell.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cell.setText("09458078359");
        jPanel1.add(cell, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 100, 30));

        IDS2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDS2.setText("ID: ");
        jPanel1.add(IDS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 30, 30));

        IDS3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDS3.setText("Email: ");
        jPanel1.add(IDS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 70, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("JakeTumampo@gmail.com");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 190, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("1001");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 60, 30));

        IDS4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDS4.setText("House Number Rented: ");
        jPanel1.add(IDS4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 180, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("2023-06-06 ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 190, 30));

        IDS5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDS5.setText("Date Rented: ");
        jPanel1.add(IDS5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 110, 30));

        IDS6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDS6.setText("DATE: ");
        jPanel1.add(IDS6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 70, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("2023-06-06 ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 130, 30));

        IDS7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDS7.setText("Payed By:");
        jPanel1.add(IDS7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 80, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("2000");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 100, 30));

        IDS8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDS8.setText("Balance:  $");
        jPanel1.add(IDS8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 90, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("2000");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 100, 30));

        IDS9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDS9.setText("Amount to be Recieved:  $");
        jPanel1.add(IDS9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 200, 30));

        jTextField1.setText("1000");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 250, 30));

        IDS10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDS10.setText("Amount Recieved:  $");
        jPanel1.add(IDS10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 160, 30));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Check", "Bank", "Gcash" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 200, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 520, 750));

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int rowIndex = tenant_tracker.getSelectedRow();

        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select a data first");
        }else{
            TableModel model = tenant_tracker.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
            int a=JOptionPane.showConfirmDialog(null,"Are you sure?");
            if(a==JOptionPane.YES_OPTION){
                dpconnector dbc = new dpconnector();
                dbc.deleteData(Integer.parseInt(id), ""
                    + "trans_table", "tr_id");
                     displaydata();

            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel2MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel2MouseWheelMoved

    }//GEN-LAST:event_jPanel2MouseWheelMoved

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tenant_trackerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tenant_trackerMouseClicked
        // TODO add your handling code here:
        int RowIndex  = tenant_tracker.getSelectedRow();
        if(tenant_tracker.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null,"Select a tenant to book.","Alert",JOptionPane.WARNING_MESSAGE);
        }else{
            TableModel model = tenant_tracker.getModel();
            IDS.setText(""+model.getValueAt(RowIndex, 1));
            name.setText(""+model.getValueAt(RowIndex, 2));
            lastname.setText(""+model.getValueAt(RowIndex, 3));
            cell.setText(""+model.getValueAt(RowIndex, 4));
            
        }

        
    }//GEN-LAST:event_tenant_trackerMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDS;
    private javax.swing.JLabel IDS1;
    private javax.swing.JLabel IDS10;
    private javax.swing.JLabel IDS2;
    private javax.swing.JLabel IDS3;
    private javax.swing.JLabel IDS4;
    private javax.swing.JLabel IDS5;
    private javax.swing.JLabel IDS6;
    private javax.swing.JLabel IDS7;
    private javax.swing.JLabel IDS8;
    private javax.swing.JLabel IDS9;
    private javax.swing.JLabel cell;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lastname;
    private javax.swing.JLabel name;
    private javax.swing.JTable tenant_tracker;
    // End of variables declaration//GEN-END:variables
}
