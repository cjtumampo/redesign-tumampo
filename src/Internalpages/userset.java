/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Internalpages;

import com.mysql.jdbc.PreparedStatement;
import config.dpconnector;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author SCC-COMLAB
 */
public class userset extends javax.swing.JInternalFrame {

    /**
     * Creates new form userset
     */
    String gender;
    
    File F = null;
    String path = null;
    private ImageIcon Format = null;
    String fname = null;
    int s = 0;
    byte [] pimage = null;
    public byte[] imageBytes;
    Connection conn = null;
    String filename=null;
    String imgPath = null;
   byte[] person_image = null; 
    
    public userset() {
        initComponents();
        connect();
        someMethod();
        pathimage.setVisible(false);
        idlabel.setVisible(false);
    this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
    BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
    bi.setNorthPane(null);
    
    }

    userset(int sharedVariable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    userset(String sharedVariable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(image_display.getWidth(), image_display.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
    
    public void connect(){
    
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/house_rent","root", "");
        }catch(ClassNotFoundException ex){
        Logger.getLogger(userset.class.getName()).log(Level.SEVERE, null,ex);
        }catch(SQLException ex){
        Logger.getLogger(userset.class.getName()).log(Level.SEVERE, null,ex);
        }
        
    }
        private static ImageIcon createResizedIcon(String imagePath, int width, int height) {
        try {
            // Load the original image
            BufferedImage originalImage = ImageIO.read(new File(imagePath));
            
            // Resize the image
            Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            
            // Create a new ImageIcon with the resized image
            return new ImageIcon(resizedImage);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
        }
         

    public void someMethod() {
        // Access the global variable
       try{
          conn = DriverManager.getConnection("jdbc:mysql://localhost/house_rent", "root", "");
          String Querry = "SELECT * FROM `tbl_customer` WHERE `t_email` = '" +email.getText()+"'";        
          Statement st = conn.createStatement();
          pst = (PreparedStatement) conn.prepareStatement(Querry);
          rs = st.executeQuery(Querry);

          int iconWidth = 100;
          int iconHeight = 100;
          
          
        if(rs.next()){
        String pathhh = rs.getString("imagepath");
        jTextField2.setText(rs.getString("t_lname"));
        jTextField4.setText(rs.getString("t_contact"));
        jTextField5.setText(rs.getString("t_address"));
        idlabel.setText(rs.getString("t_id"));
        String imagePath = rs.getString("imagepath");
//        ImageIcon icon = createResizedIcon(imagePath, iconWidth, iconHeight);
//        image_display.setIcon(icon);
        image_display.setIcon(new javax.swing.ImageIcon(getClass().getResource(""+imagePath)));
                    
        }
       }catch(Exception e){       
       }
    }
    
    

    Color navcolor = new Color(0,102,102);
    Color navbar = new Color (240,240,240);
    Color Hdcolor = new Color (0,102,102);  
    Color buttons = new Color(0,153,153);

     dpconnector dbc = new dpconnector();
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        image_display = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        imagelabel = new javax.swing.JLabel();
        pathimage = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        combobox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idlabel = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image_display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_display.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-male-user-100 (1).png"))); // NOI18N
        jPanel3.add(image_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 140));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Upload Image");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 110, 30));
        jPanel3.add(imagelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 190, 30));

        pathimage.setText("jLabel5");
        jPanel3.add(pathimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 420));

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 230, 30));

        jLabel6.setText("First Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 34, 130, 20));

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 230, 30));

        jLabel7.setText("Last Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 130, 20));

        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 230, 30));

        jLabel10.setText("Email");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 130, 20));

        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 230, 30));

        jLabel11.setText("Mobile Number");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 130, 20));

        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 230, 30));

        jLabel12.setText("Address");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 130, 20));

        jLabel13.setText("Password");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 130, 20));

        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 230, 30));

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 90, 30));

        male.setText(" Male ");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel2.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 60, 30));

        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel2.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 80, 30));

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced", "Widow" }));
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });
        jPanel2.add(combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 160, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 720, -1));

        jPanel1.setBackground(new java.awt.Color(224, 152, 67));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(178, 63, 48));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jLabel1.setText("ACCOUNT SETTINGS");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 250, 40));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Name: ");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 70, 20));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setText("Address: ");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 90, 20));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("Email:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 90, 20));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Position:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 90, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ACCOUNT SETTINGS ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 390, 80));

        idlabel.setText("jLabel5");
        jPanel4.add(idlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        chooser.addChoosableFileFilter(filter);
        int result = chooser.showSaveDialog(null);
        
        if (result == JFileChooser.APPROVE_OPTION){
            File selectedFile = chooser.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            image_display.setIcon(ResizeImage(path,null));
            imgPath = path;
            File f = chooser.getSelectedFile();
            filename = selectedFile.getAbsolutePath();
        }else{
        JOptionPane.showMessageDialog(null, "Canceled !");
        }
        
      
        try {
                File image = new File(filename);
                FileInputStream fis = new FileInputStream(image);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                
                for (int readNum; (readNum=fis.read(buf)) !=-1;){
                 bos.write(buf,0,readNum);
                }
                person_image=bos.toByteArray();
                pathimage.setText(path);
                
        }catch(Exception e){
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                dpconnector dbc = new dpconnector();
        int num = dbc.updateData("UPDATE `tbl_customer` SET `r_number`='"+jTextField4.getText()+"',`t_name`='"+jTextField1.getText()+"',`t_lname`='"+jTextField2.getText()+"',`t_address`='"+combobox.getSelectedItem()+"',`t_gender`='"+gender+"',`t_contact`='"+jTextField4.getText()+"',`t_email`='"+email.getText()+"',`imagepath`='"+pathimage.getText()+"' WHERE t_id = '"+idlabel.getText()+"'");

        if(num == 0){

        }else{
            JOptionPane.showMessageDialog(null, "Updated Successfully!");
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        if(male.isSelected()){
            female.setSelected(false);
            gender = "Male";
        }else{
            gender = null;
        }
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        male.setSelected(false);
        if(female.isSelected()){
            male.setSelected(false);
            gender = "Female";

        }else{
            gender = null;
        }
    }//GEN-LAST:event_femaleActionPerformed

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> combobox;
    public javax.swing.JTextField email;
    public javax.swing.JRadioButton female;
    private javax.swing.JLabel idlabel;
    public javax.swing.JLabel image_display;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    public javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    public javax.swing.JRadioButton male;
    private javax.swing.JLabel pathimage;
    // End of variables declaration//GEN-END:variables
}
