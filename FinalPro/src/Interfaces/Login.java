/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import startup.startt;

/**
 *
 * @author pct
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size =toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        log1 = new javax.swing.JLabel();
        uname = new javax.swing.JLabel();
        pw = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1_picture = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        log1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        log1.setForeground(new java.awt.Color(102, 102, 102));
        log1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        log1.setText("LOGIN");
        jPanel1.add(log1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 152, 50));

        uname.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        uname.setForeground(new java.awt.Color(51, 51, 51));
        uname.setText("User Name");
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        pw.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        pw.setForeground(new java.awt.Color(51, 51, 51));
        pw.setText("Password");
        jPanel1.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        username.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(51, 51, 51));
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 230, 31));

        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 230, 33));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 30, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 70, 30));

        jLabel1_picture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/N_04.jpg"))); // NOI18N
        jPanel1.add(jLabel1_picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 660, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
PreparedStatement ps;
        ResultSet rs;
         String Username = username.getText();
      String Password =String.valueOf(password.getPassword());
      
      String query;
        query = "SELECT * FROM `login` WHERE `username`=? AND `password`=?";
      
        try {
            ps = Mainbase.getConnection().prepareStatement(query);
            ps.setString(1, Username);
            ps.setString(2, Password);
            
            
            rs= ps.executeQuery();
            if (rs.next()){
               //  JOptionPane.showMessageDialog(null, "Username & Password Matched");
                 new Home().setVisible(true);
        setVisible(false);
            }
            else {
            JOptionPane.showMessageDialog(null, "Wrong Username or Password");
           username.setText(null);
           password.setText(null);
            
           
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
         new startt().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        int key=evt.getKeyCode();
        if(key==10){
        password.requestFocus();
        }
    }//GEN-LAST:event_usernameKeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
      int key=evt.getKeyCode();
        if(key==10){
       PreparedStatement ps;
        ResultSet rs;
         String Username = username.getText();
      String Password =String.valueOf(password.getPassword());
      
      String query;
        query = "SELECT * FROM `login` WHERE `username`=? AND `password`=?";
      
        try {
            ps = Mainbase.getConnection().prepareStatement(query);
            ps.setString(1, Username);
            ps.setString(2, Password);
            
            
            rs= ps.executeQuery();
            if (rs.next()){
                
                 new Home().setVisible(true);
        setVisible(false);
            }
            else {
            JOptionPane.showMessageDialog(null, "Wrong Username or Password");
           username.setText(null);
           password.setText(null);
            
           
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }    
        }
    }//GEN-LAST:event_passwordKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1_picture;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel log1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel pw;
    private javax.swing.JLabel uname;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
