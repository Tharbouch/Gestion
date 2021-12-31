/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import Forms.Dashbord_Admin;
import emp.EmployeAcceuil;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author TAHA
 */
public class Login extends javax.swing.JFrame {
    

    public int getUsernameId() {
        return usernameId;
    }

    public void setUsernameId(int usernameId) {
        this.usernameId = usernameId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public static int usernameId;
    public static String nom;
    public static String prenom;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        loginUsername = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1105, 685));

        jPanel1.setBackground(new java.awt.Color(0, 27, 72));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/iconsWarehouse.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 90, 100));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(224, 235, 248));
        jLabel5.setText("Gestion Stock Application");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 420, 50));

        jPanel2.setBackground(new java.awt.Color(225, 245, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginUsername.setBackground(new java.awt.Color(225, 245, 255));
        loginUsername.setForeground(new java.awt.Color(2, 69, 122));
        loginUsername.setText("Username");
        loginUsername.setToolTipText("");
        loginUsername.setActionCommand("<Not Set>");
        loginUsername.setBorder(null);
        loginUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        loginUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginUsernameMouseClicked(evt);
            }
        });
        jPanel2.add(loginUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 297, 40));

        PasswordField.setBackground(new java.awt.Color(225, 245, 255));
        PasswordField.setForeground(new java.awt.Color(2, 69, 122));
        PasswordField.setText("Password");
        PasswordField.setBorder(null);
        PasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordFieldMouseClicked(evt);
            }
        });
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        jPanel2.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 297, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/iconUser.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 50, 60));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 240, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/iconSign-in.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 40, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/iconPassword.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 60, 60));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 240, 10));

        jButton1.setBackground(new java.awt.Color(3, 61, 111));
        jButton1.setForeground(new java.awt.Color(224, 235, 248));
        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 110, 30));

        jPanel3.setBackground(new java.awt.Color(225, 245, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        getToolkit().getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String username = loginUsername.getText();
            String password = PasswordField.getText();
            Connection connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","taha123");
            String rocket = "select * from users where USERNAME='"+username+"'and PASSWORD='"+password+"'";
            PreparedStatement sqlquery =  connect.prepareStatement(rocket);
            ResultSet results = sqlquery.executeQuery();
            if (results.next()){
                if (username.equals("admin") && password.equals("admin")) {
                    close();
                    Dashbord_Admin adminInterface = new Dashbord_Admin();
                    adminInterface.setVisible(true);
                }
                else{
                    setUsernameId(results.getInt("UserId"));
                    setNom(results.getString("NOM"));
                    setPrenom(results.getString("PRENOM"));
                    
                    close();
                    EmployeAcceuil employeeInterface = new EmployeAcceuil();
                    employeeInterface.setVisible(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Inavlid Username/Password");
            }
          }
          catch(Exception e){
              System.out.println(e);
          }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loginUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginUsernameMouseClicked
        // TODO add your handling code here:
       loginUsername.setText("");
    }//GEN-LAST:event_loginUsernameMouseClicked

    private void PasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordFieldMouseClicked
        // TODO add your handling code here:
        PasswordField.setText("");
    }//GEN-LAST:event_PasswordFieldMouseClicked

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_jLabel6MouseClicked

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
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField loginUsername;
    // End of variables declaration//GEN-END:variables
}
