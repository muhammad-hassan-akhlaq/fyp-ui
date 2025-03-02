
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.SQLException;
import java.text.ParseException;
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
public class FileManipulationForm extends javax.swing.JFrame {

    /**
     * Creates new form FileManipulationForm
     */
    public FileManipulationForm() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        usernameL.setText(Helper.username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        discardImagesB = new javax.swing.JButton();
        processImagesB = new javax.swing.JButton();
        previewImagesB = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        searchDate = new com.toedter.calendar.JDateChooser();
        searchB = new javax.swing.JLabel();
        usernameL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        closeB1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(32, 47, 90));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(106, 116, 145));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Image Manipulation");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel11)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 690, 40));

        discardImagesB.setBackground(new java.awt.Color(0, 18, 50));
        discardImagesB.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        discardImagesB.setForeground(new java.awt.Color(255, 255, 255));
        discardImagesB.setText("Discard");
        discardImagesB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        discardImagesB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                discardImagesBMouseClicked(evt);
            }
        });
        jPanel2.add(discardImagesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 190, 80));

        processImagesB.setBackground(new java.awt.Color(0, 18, 50));
        processImagesB.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        processImagesB.setForeground(new java.awt.Color(255, 255, 255));
        processImagesB.setText("Process");
        processImagesB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        processImagesB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                processImagesBMouseClicked(evt);
            }
        });
        jPanel2.add(processImagesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 190, 80));

        previewImagesB.setBackground(new java.awt.Color(0, 18, 50));
        previewImagesB.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        previewImagesB.setForeground(new java.awt.Color(255, 255, 255));
        previewImagesB.setText("Preview");
        previewImagesB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        previewImagesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewImagesBActionPerformed(evt);
            }
        });
        jPanel2.add(previewImagesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 190, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 840, 300));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(searchDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 240, 30));

        searchB.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        searchB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Search_25px.png"))); // NOI18N
        searchB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBMouseClicked(evt);
            }
        });
        jPanel4.add(searchB, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        usernameL.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        usernameL.setText("User");
        jPanel4.add(usernameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_User_25px.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        closeB1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        closeB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Cancel_20px.png"))); // NOI18N
        closeB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeB1MouseClicked(evt);
            }
        });
        jPanel4.add(closeB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 8, 30, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 0, 840, 50));

        jPanel1.setBackground(new java.awt.Color(0, 18, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(40, 285));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Back_20px.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 265, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel2.setText("Torn Image Reconstruction");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel3.setText("Feel free to repair your torn images..!!");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 50, 830, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        UploadFileForm fUploadForm = new UploadFileForm();
        fUploadForm.setVisible(true);
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void discardImagesBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discardImagesBMouseClicked
        int option = JOptionPane.showConfirmDialog(rootPane, "Please confirm you want to discard these images");
        if(option==JOptionPane.OK_OPTION)
        {
            File dirToDelete = new File(Helper.imgFolderPath);
            deleteDir(dirToDelete);
            
            UploadFileForm fUploadForm = new UploadFileForm();
            fUploadForm.setVisible(true);
            this.dispose();
            this.setVisible(false);
        }
    }//GEN-LAST:event_discardImagesBMouseClicked

    private void deleteDir(File file) 
    {
        File[] contents = file.listFiles();
        if (contents != null) {
            for (File f : contents) {
                deleteDir(f);
            }
        }
        file.delete();
    }
    
    private void previewImagesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewImagesBActionPerformed
        try {
            Runtime.getRuntime().exec("explorer.exe /select," + Helper.imgFolderPath+"\\sample.jpg");
        } catch (IOException ex) {
            Logger.getLogger(FileManipulationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_previewImagesBActionPerformed

    private void processImagesBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_processImagesBMouseClicked
        File imgFolder = new File(Helper.imgFolderPath);
        File matlabFolder = new File(Helper.docsPath+"MatlabCode\\");
        File [] files = imgFolder.listFiles();
        File destFile=null;
        int piecesCount = 0;
        for (File file : files) {
            try 
            {
                if(file.getName().contains("sample"))
                    destFile = new File(Helper.docsPath+"sample.jpg");
                else
                {
                    destFile = new File(matlabFolder.getAbsolutePath()+"\\"+ file.getName());
                    piecesCount++;
                
                }
                Files.copy(file.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } 
            catch (IOException ex) {
                Logger.getLogger(UploadFileForm.class.getName()).log(Level.SEVERE, null, ex);
            }               
        }

        try {    
            Helper.pieces = piecesCount;
            Runtime.getRuntime().exec("matlab -nodisplay -nosplash -nodesktop -minimize -nojvm -r \"run('"+matlabFolder.getPath()+"\\f_JIGSAW("+ piecesCount+")')\",exit");
        } catch (IOException ex) {
            Logger.getLogger(FileManipulationForm.class.getName()).log(Level.SEVERE, null, ex);
        }

//        String line;
//        String pidInfo ="";
//
//        
//        Process p;
//        try {
//            while(true)
//            {
//                p = Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");
//                BufferedReader input =  new BufferedReader(new InputStreamReader(p.getInputStream()));
//
//                while ((line = input.readLine()) != null) {
//                    pidInfo+=line; 
//                }
//
//                input.close();
//
//                if(pidInfo.contains("MATLAB.exe"))
//                {
//                    break;
//                }
//            }
//            
//            while(true)
//            {
//                p = Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");
//                BufferedReader input =  new BufferedReader(new InputStreamReader(p.getInputStream()));
//
//                while ((line = input.readLine()) != null) {
//                    pidInfo+=line; 
//                }
//
//                input.close();
//            }
//            
//        } catch (IOException ex) {
//            Logger.getLogger(FileManipulationForm.class.getName()).log(Level.SEVERE, null, ex);
//        }

        

//        int time =0;
//        if(piecesCount <10)
//            time = 15000;
//        else if(piecesCount<20)
//            time = 30000;
//        else
//            time = 60000;
//        
//        final int MAX = 100;
//
//        final JProgressBar pb = this.processingPB;
//        pb.setStringPainted(true);
//        pb.setVisible(true);
//        
//         // update progressbar
//        for (int i = 0; i <= MAX; i++) {
//            final int val = i;
//            try {
//                    SwingUtilities.invokeLater(new Runnable() {
//                              public void run() {
//                                pb.setValue(i);
//                              }
//                Thread.sleep(time/100);
//            } catch (InterruptedException e) {
//                JOptionPane.showMessageDialog(this, e.getMessage());
//            }
//        }
        
        ResultForm resultform = new ResultForm();
        resultform.setVisible(true);
        this.setVisible(false);   
        this.dispose();
    }//GEN-LAST:event_processImagesBMouseClicked

    private void searchBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBMouseClicked
        if(this.searchDate.getDate()!=null)
        {
            Helper.searchDate=this.searchDate.getDate();
            Helper.searchFlag = true;
            RecordsForm form;
            try {
                form = new RecordsForm();
                this.setVisible(false);
                form.setVisible(true);
                this.dispose();
            } catch (SQLException | ParseException ex) {
                Logger.getLogger(UserPanelForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_searchBMouseClicked

    private void closeB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeB1MouseClicked
        int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure to quit the Program");
        if(option==JOptionPane.OK_OPTION)
        {
            DBHandler.closeConnection();
            System.exit(0);
        }
    }//GEN-LAST:event_closeB1MouseClicked

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
            java.util.logging.Logger.getLogger(FileManipulationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileManipulationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileManipulationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileManipulationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileManipulationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeB1;
    private javax.swing.JButton discardImagesB;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton previewImagesB;
    private javax.swing.JButton processImagesB;
    private javax.swing.JLabel searchB;
    private com.toedter.calendar.JDateChooser searchDate;
    private javax.swing.JLabel usernameL;
    // End of variables declaration//GEN-END:variables
}
