
import com.sun.glass.events.KeyEvent;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hassan Akhlaq
 */
public class SignInForm extends javax.swing.JFrame {

    /**
     * Creates new form SignInForm
     */
    public SignInForm() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
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
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        signInProceedB = new javax.swing.JButton();
        passwordTF = new javax.swing.JPasswordField();
        cnicTF = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        closeB1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 18, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(40, 550));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Back_20px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel19)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel18)
                .addContainerGap(503, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(265, 265, 265)
                    .addComponent(jLabel19)
                    .addContainerGap(245, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 530));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel2.setText("Torn Image Reconstruction");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel3.setText("Feel free to repair your torn images..!!");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 830, 200));

        jPanel2.setBackground(new java.awt.Color(32, 47, 90));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(106, 116, 145));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sign-in Details:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(515, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 690, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CNIC ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 210, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 210, 10));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Password ");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 120, 30));

        signInProceedB.setBackground(new java.awt.Color(0, 18, 50));
        signInProceedB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signInProceedB.setForeground(new java.awt.Color(255, 255, 255));
        signInProceedB.setText("Sign In");
        signInProceedB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signInProceedB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInProceedBMouseClicked(evt);
            }
        });
        jPanel2.add(signInProceedB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 320, 40));

        passwordTF.setBackground(new java.awt.Color(32, 47, 90));
        passwordTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordTF.setForeground(new java.awt.Color(255, 255, 255));
        passwordTF.setBorder(null);
        passwordTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordTFKeyTyped(evt);
            }
        });
        jPanel2.add(passwordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 210, 30));

        cnicTF.setBackground(new java.awt.Color(32, 47, 90));
        cnicTF.setColumns(13);
        cnicTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cnicTF.setForeground(new java.awt.Color(255, 255, 255));
        cnicTF.setBorder(null);
        cnicTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnicTFKeyTyped(evt);
            }
        });
        jPanel2.add(cnicTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 210, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 256, 830, 270));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        closeB1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        closeB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Cancel_20px.png"))); // NOI18N
        closeB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeB1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(793, Short.MAX_VALUE)
                .addComponent(closeB1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeB1)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void passwordTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTFKeyTyped
        if(this.passwordTF.getText().length()>29)
        {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_passwordTFKeyTyped

    private void signInProceedBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInProceedBMouseClicked
        String cnic = cnicTF.getText();
        if(cnic==null || cnic.length()==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Please enter CNIC");
            return;
        }
        if(cnic.length()!=13)
        {
            JOptionPane.showMessageDialog(rootPane, "CNIC must be 13 letters","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String password = passwordTF.getText();
        if(password==null || password.length()==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Please enter Password");
            return;
        }
        ArrayList<String> params = new ArrayList<>();
        String loginCheckQuery = "Select * from USERS where CNIC=? AND PASSWORD=?";
        params.add(cnic);
        params.add(password);
        
        ResultSet rs = DBHandler.runQuery(loginCheckQuery, params);
        try {
            if(rs!=null && rs.next())
            {
                Helper.cnic = cnic;
                Helper.username = rs.getString(2);
                UserPanelForm userpanelform = new UserPanelForm();
                userpanelform.setVisible(true);
                this.setVisible(false);   
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Incorrect CNIC or Password","Login Failed",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SignInForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_signInProceedBMouseClicked

    private void cnicTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnicTFKeyTyped
        if(this.cnicTF.getText().length()>12)
        {
            evt.consume();
            getToolkit().beep();
        }
        else
        allowOnlyDigits(evt);
    }//GEN-LAST:event_cnicTFKeyTyped

    private void closeB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeB1MouseClicked
        int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure to quit the Program");
        if(option==JOptionPane.OK_OPTION)
        {
            DBHandler.closeConnection();
            System.exit(0);
        }
    }//GEN-LAST:event_closeB1MouseClicked

    public void allowOnlyDigits(java.awt.event.KeyEvent evt){
        char c=evt.getKeyChar();
        
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
            getToolkit().beep();
        }
    }
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
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignInForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeB1;
    private javax.swing.JTextField cnicTF;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JButton signInProceedB;
    // End of variables declaration//GEN-END:variables
}
