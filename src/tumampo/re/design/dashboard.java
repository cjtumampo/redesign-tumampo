/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tumampo.re.design;

import Internalpages.dbp;
import Internalpages.LoginForm;
import Internalpages.Userpage;
import Internalpages.settings;
import Internalpages.userset;
import java.awt.Color;
import internalpages.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author SCC-COMLAB
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
   
    }
    Color navcolor = new Color(204,102,0);
    Color navbar = new Color (188,71,58);
    Color Hdcolor = new Color (0,102,102);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    


   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        head = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();
        jLabel24 = new javax.swing.JLabel();
        navigator = new javax.swing.JPanel();
        userpane = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        accounts = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        settings = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dashpane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        body.setBackground(new java.awt.Color(204, 102, 0));
        body.setLayout(null);

        head.setBackground(new java.awt.Color(224, 152, 67));
        head.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("x");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        head.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, -10, 40, 60));

        min.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        min.setText("_");
        min.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });
        head.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, -20, 40, 70));

        body.add(head);
        head.setBounds(160, 0, 790, 70);

        maindesktop.setBackground(new java.awt.Color(0, 51, 51));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tumampo/re/design/san-francisco-street-city-usa.jpg"))); // NOI18N

        maindesktop.setLayer(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout maindesktopLayout = new javax.swing.GroupLayout(maindesktop);
        maindesktop.setLayout(maindesktopLayout);
        maindesktopLayout.setHorizontalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        maindesktopLayout.setVerticalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 550, Short.MAX_VALUE)
        );

        body.add(maindesktop);
        maindesktop.setBounds(160, 70, 790, 550);

        navigator.setBackground(new java.awt.Color(188, 71, 58));
        navigator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userpane.setBackground(new java.awt.Color(188, 71, 58));
        userpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userpaneMouseExited(evt);
            }
        });
        userpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("MANAGER");
        userpane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 40));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-manager-30.png"))); // NOI18N
        userpane.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        navigator.add(userpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 160, 60));

        accounts.setBackground(new java.awt.Color(188, 71, 58));
        accounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountsMouseExited(evt);
            }
        });
        accounts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("ACCOUNTS");
        accounts.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 40));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-edit-account-30.png"))); // NOI18N
        accounts.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        navigator.add(accounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 160, 60));

        settings.setBackground(new java.awt.Color(188, 71, 58));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("REPORTS");
        settings.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 40));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-reports-30.png"))); // NOI18N
        settings.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        navigator.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 160, 60));

        dashpane.setBackground(new java.awt.Color(188, 71, 58));
        dashpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpaneMouseExited(evt);
            }
        });
        dashpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("DASHBOARD");
        dashpane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 40));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-dashboard-20.png"))); // NOI18N
        dashpane.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        navigator.add(dashpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 60));

        logout.setBackground(new java.awt.Color(188, 71, 58));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LOGOUT");
        logout.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 40));

        navigator.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 160, 60));

        body.add(navigator);
        navigator.setBounds(0, 70, 160, 550);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/rsz_1rsz_capture-removebg-preview.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        body.add(jLabel3);
        jLabel3.setBounds(20, 10, 130, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseEntered
        // TODO add your handling code here:
        dashpane.setBackground(navcolor);
    }//GEN-LAST:event_dashpaneMouseEntered

    private void dashpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseExited
        // TODO add your handling code here:
        dashpane.setBackground(navbar);
    }//GEN-LAST:event_dashpaneMouseExited

    private void userpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseEntered
        // TODO add your handling code here:
        userpane.setBackground(navcolor);
    }//GEN-LAST:event_userpaneMouseEntered

    private void userpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseExited
        // TODO add your handling code here:
        userpane.setBackground(navbar);
    }//GEN-LAST:event_userpaneMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        // TODO add your handling code here:
        settings.setBackground(navcolor);
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        // TODO add your handling code here:
        settings.setBackground(navbar);
    }//GEN-LAST:event_settingsMouseExited

    private void userpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseClicked
        // TODO add your handling code here:
        Userpage up = new Userpage();
        maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_userpaneMouseClicked

    private void dashpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseClicked
        // TODO add your handling code here:
        dbp d = new dbp();
        maindesktop.add(d).setVisible(true);
    }//GEN-LAST:event_dashpaneMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        // TODO add your handling code here:
        settings udp = new settings();
        maindesktop.add(udp).setVisible(true);
    }//GEN-LAST:event_settingsMouseClicked

    private void accountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsMouseClicked
        // TODO add your handling code here:
        userset us = new userset();
        maindesktop.add(us).setVisible(true);
    }//GEN-LAST:event_accountsMouseClicked

    private void accountsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsMouseEntered
        // TODO add your handling code here:
        accounts.setBackground(navcolor);
    }//GEN-LAST:event_accountsMouseEntered

    private void accountsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsMouseExited
        // TODO add your handling code here:
        accounts.setBackground(navbar);
    }//GEN-LAST:event_accountsMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        // TODO add your handling code here:
        setState(ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        dashboard dash = new dashboard();
        dash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
      
      this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        // TODO add your handling code here:
        logout.setBackground(navcolor);
        
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        // TODO add your handling code here:
        logout.setBackground(navbar);
    }//GEN-LAST:event_logoutMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accounts;
    private javax.swing.JPanel body;
    private javax.swing.JLabel close;
    private javax.swing.JPanel dashpane;
    private javax.swing.JPanel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel logout;
    public javax.swing.JDesktopPane maindesktop;
    private javax.swing.JLabel min;
    private javax.swing.JPanel navigator;
    private javax.swing.JPanel settings;
    private javax.swing.JPanel userpane;
    // End of variables declaration//GEN-END:variables
}