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
import com.mysql.jdbc.Statement;
import config.connection;
import config.dpconnector;
import java.awt.Color;
import static java.awt.Color.BLACK;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import tumampo.re.design.dashboard;
public class Userpage extends javax.swing.JInternalFrame {

    /**
     * Creates new form Userpage
     */
    public Userpage() {
        initComponents();
    displaydata();
    this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
    BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
    bi.setNorthPane(null);
    }
    Color navcolor = new Color(0,102,102);

    public void displaydata()
    {
        try{
    dpconnector dbc = new dpconnector();
    ResultSet rs = dbc.getData("SELECT t_id , t_name, t_lname, t_address, t_contact, r_number  FROM tbl_customer");
    Customer_table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException ex){
        System.out.println("Error Message");
        }
    DefaultTableModel model = (DefaultTableModel) Customer_table.getModel();
    String[] columnIdentifiers = {"ID", "First Name","Last Name", "Address", "Contact no.", "Rent Status"};
    model.setColumnIdentifiers(columnIdentifiers);
    
    TableColumnModel columnModel = Customer_table.getColumnModel();
    columnModel.getColumn(0).setPreferredWidth(1);
    columnModel.getColumn(1).setPreferredWidth(50);
    columnModel.getColumn(4).setPreferredWidth(100);
    Customer_table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
    Customer_table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
    Customer_table.getTableHeader().setOpaque(false);
    Customer_table.getTableHeader().setBackground(navcolor);
    Customer_table.getTableHeader().setForeground(BLACK);
    Customer_table.setRowHeight(25);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Customer_table = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(790, 550));

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(178, 63, 48));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TENANTS MANAGER");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 320, 70));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search Bar");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 90, -1));

        Search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });
        jPanel3.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 350, 30));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 790, 90);

        jButton2.setBackground(new java.awt.Color(161, 197, 53));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 110, 80, 30);

        jButton5.setBackground(new java.awt.Color(161, 197, 53));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("ADD");
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(120, 110, 80, 30);

        jButton1.setBackground(new java.awt.Color(236, 24, 1));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(670, 110, 80, 30);

        jButton4.setBackground(new java.awt.Color(161, 197, 53));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("BOOK");
        jButton4.setActionCommand("Dislay");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(220, 110, 80, 30);

        Customer_table.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Customer_table.setOpaque(false);
        Customer_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Customer_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Customer_table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 170, 730, 300);

        jButton6.setBackground(new java.awt.Color(161, 197, 53));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("PRINT");
        jButton6.setActionCommand("Dislay");
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(320, 110, 80, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Customer_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Customer_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Customer_tableMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
        signin sf = new signin();
        sf.setVisible(true);
        sf.action = "Add";
        sf.jButton2.setText("Add");

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int RowIndex  = Customer_table.getSelectedRow();
        if(RowIndex < 0){
            JOptionPane.showMessageDialog(null,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);
        }else{
            TableModel model = Customer_table.getModel();
            signin sf = new signin();
            sf.setVisible(true);
            sf.c_id.setText(""+model.getValueAt(RowIndex, 0));
            sf.C_name.setText(""+model.getValueAt(RowIndex, 1));
            sf.l_name.setText(""+model.getValueAt(RowIndex, 2));
            sf.gender = model.getValueAt(RowIndex, 4).toString();

            String gend = model.getValueAt(RowIndex, 4).toString();
            if(gend.equals("Male")){
                sf.male.setSelected(true);
            }
            if(gend.equals("Female")){
                sf.female.setSelected(true);
            }
            sf.combobox.setSelectedItem(model.getValueAt(RowIndex, 5).toString());
            sf.C_address.setText(model.getValueAt(RowIndex, 3).toString());
            sf.C_contact.setText(model.getValueAt(RowIndex, 6).toString());
            sf.Email.setText(model.getValueAt(RowIndex, 7).toString());
            sf.action = "Edit";
            sf.jButton2.setText("Update");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int rowIndex = Customer_table.getSelectedRow();

        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select a data first");
        }else{
            TableModel model = Customer_table.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
            int a=JOptionPane.showConfirmDialog(null,"Are you sure?");
            if(a==JOptionPane.YES_OPTION){
                dpconnector dbc = new dpconnector();
                dbc.deleteData(Integer.parseInt(id), ""
                    + "tbl_customer", "t_id");
                displaydata();

            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SearchActionPerformed

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) Customer_table.getModel();
        TableRowSorter<DefaultTableModel> tbl = new TableRowSorter<>(model);
        Customer_table.setRowSorter(tbl);
        
        String searchText = Search.getText().trim();
        tbl.setRowFilter(RowFilter.regexFilter("(?i)" + searchText));
        
        int selectedRow = Customer_table.getSelectedRow();
        if(selectedRow != -1 ){
        int modelRow = Customer_table.convertColumnIndexToModel(selectedRow);
        model.setValueAt("New Value", modelRow, 1);
        }
    }//GEN-LAST:event_SearchKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        int RowIndex  = Customer_table.getSelectedRow();
        if(Customer_table.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null,"Select a tenant to book.","Alert",JOptionPane.WARNING_MESSAGE);
        }else{
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
        Booking b = new Booking();
        b.setVisible(true);
            TableModel model = Customer_table.getModel();
            b.jTextField2.setText(""+model.getValueAt(RowIndex, 1));
            b.jTextField1.setText(""+model.getValueAt(RowIndex, 2));
            b.jTextField3.setText(model.getValueAt(RowIndex, 4).toString());
            b.ID.setText(""+model.getValueAt(RowIndex, 0));
            b.jTextField2.setEditable(false);
            b.jTextField1.setEditable(false);
            b.jTextField3.setEditable(false);
            b.ID.setEditable(false);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
                int RowIndex  = Customer_table.getSelectedRow();
        if(Customer_table.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null,"Select a tenant to book.","Alert",JOptionPane.WARNING_MESSAGE);
        }else{
        prints p = new prints();
        p.setVisible(true);    
        p.jTextArea1.setVisible(true);
        TableModel model = Customer_table.getModel();
        p.ID.setText(""+model.getValueAt(RowIndex, 0));
        p.FNAMES.setText(""+model.getValueAt(RowIndex, 1));
        p.LNAME.setText(""+model.getValueAt(RowIndex, 2));
        p.ADDRESS.setText(""+model.getValueAt(RowIndex, 3));
        p.GENDER.setText(""+model.getValueAt(RowIndex, 4));
        p.CIVIL.setText(""+model.getValueAt(RowIndex, 5));
        p.CON.setText(""+model.getValueAt(RowIndex, 6));
        p.EMAIL.setText(""+model.getValueAt(RowIndex, 7));
        
                }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Customer_table;
    private javax.swing.JTextField Search;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
