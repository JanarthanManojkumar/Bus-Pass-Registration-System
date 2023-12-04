
package pass;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Registration2 extends javax.swing.JFrame {
    PreparedStatement ps =null;
     Connection con =null;
        ResultSet rs=null;

public int DepID;
public String type;
    public Registration2()
    {
        
        initComponents();
    }

   Registration2(int DepartmentID)
   {
       this();
       
       DepID=DepartmentID;
   }
    
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fetch = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jClose = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jNpassword = new javax.swing.JPasswordField();
        jValue = new javax.swing.JCheckBox();
        jCPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel1.setText("New Password");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setText("Confirm Password");

        jClose.setBackground(new java.awt.Color(255, 255, 255));
        jClose.setIcon(new javax.swing.ImageIcon("E:\\Edge downloads\\multiply.png")); // NOI18N
        jClose.setBorderPainted(false);
        jClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jNpassword.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jValueActionPerformed(evt);
            }
        });

        jCPassword.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jClose))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCPassword)
                            .addComponent(jNpassword)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jValue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jClose)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jNpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(jValue))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fetch))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fetch)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
      String npassword=jNpassword.getText();
       String cpassword=jCPassword.getText();
       
       if(npassword.equals(""))
       {
           JOptionPane.showMessageDialog(rootPane, "New password cannot be Empty");
       }
       else if (cpassword.equals(""))
       {
           JOptionPane.showMessageDialog(rootPane, "Confirm password cannot be empty");
       }
       
        try {
            
            if(npassword.equals("")||cpassword.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "Empty");
                jCPassword.equals("");
                jNpassword.equals("");
                
            }
          else if(npassword.equals(cpassword))
            {
       Statement s=dbconnection.mycon().createStatement();
       s.executeUpdate("UPDATE details SET Password='"+cpassword+"'WHERE ID='"+DepID+"'");
                
       JOptionPane.showMessageDialog(rootPane,"Password Set");
       this.hide();
       new Login().show();
            }
            else
            {
                
                JOptionPane.showMessageDialog(rootPane,"Passwords doesnt match");
                jNpassword.equals("");
                jCPassword.equals("");
                
                
                
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
      
      
    }//GEN-LAST:event_btnNextActionPerformed

    private void jCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseActionPerformed
        // TODO add your handling code here:
        
        try {
            
      Statement s=dbconnection.mycon().createStatement();
      
       String query="DELETE FROM details WHERE ID="+DepID+"";
       s.executeUpdate(query);
       JOptionPane.showMessageDialog(rootPane,"Deleted sucessfully");
      
    
       this.hide();
       new startuppage().show();
            
        } catch (Exception e) {
            System.out.println(e);
        }
 
        
        
        
    }//GEN-LAST:event_jCloseActionPerformed

    private void jValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jValueActionPerformed
        // TODO add your handling code here:
        if(jValue.isSelected())
        {
           jNpassword.setEchoChar((char)0);
           jCPassword.setEchoChar((char)0);
        }
        else 
        {
            jNpassword.setEchoChar('*');
            jCPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jValueActionPerformed

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
            java.util.logging.Logger.getLogger(Registration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration2().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    public javax.swing.JLabel fetch;
    private javax.swing.JPasswordField jCPassword;
    private javax.swing.JButton jClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jNpassword;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox jValue;
    // End of variables declaration//GEN-END:variables

}
