package pass;

import java.sql.Statement;
import javax.swing.*;
import java.awt.*;

public class BasicRegistration extends javax.swing.JFrame {

 public int passDep;
    public BasicRegistration() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderGroup = new javax.swing.ButtonGroup();
        Type = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLastName = new javax.swing.JTextField();
        jFirstName = new javax.swing.JTextField();
        jNIC = new javax.swing.JTextField();
        jFemale = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Student = new javax.swing.JRadioButton();
        Public = new javax.swing.JRadioButton();
        jmale = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jGmail = new javax.swing.JTextField();
        jMobileNo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setText("NIC/PostalID");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("First Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("Last Name");

        jLastName.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jFirstName.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jNIC.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNICActionPerformed(evt);
            }
        });

        jFemale.setBackground(new java.awt.Color(255, 255, 255));
        GenderGroup.add(jFemale);
        jFemale.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jFemale.setText("Female");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setText("Type");

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel13.setText("Gender");

        Student.setBackground(new java.awt.Color(255, 255, 255));
        Type.add(Student);
        Student.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        Student.setText("Student");
        Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentActionPerformed(evt);
            }
        });

        Public.setBackground(new java.awt.Color(255, 255, 255));
        Type.add(Public);
        Public.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        Public.setText("Public");

        jmale.setBackground(new java.awt.Color(255, 255, 255));
        GenderGroup.add(jmale);
        jmale.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jmale.setText("Male");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel10.setText("Gmail");

        btnNext.setBackground(new java.awt.Color(255, 255, 255));
        btnNext.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel9.setText("MobileNo");

        jGmail.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jGmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGmailActionPerformed(evt);
            }
        });

        jMobileNo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jMobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMobileNoActionPerformed(evt);
            }
        });
        jMobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jMobileNoKeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Personal");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("E:\\Edge downloads\\multiply.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel13)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFemale)
                                    .addComponent(jmale))))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Public)
                                    .addComponent(Student)))
                            .addComponent(jLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmale)
                    .addComponent(Student))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFemale)
                    .addComponent(Public))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jGmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNICActionPerformed

    private void jGmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGmailActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
   //     try {
         String ID=jNIC.getText().toString();
         int StudentID=0;
         String Address="####";
         int zipcode=0;
         int schooliD=0;
         String SchoolName="#####";
        String FName=jFirstName.getText();
        String LName=jLastName.getText();
         /*Validation String*/  String strMobile=jMobileNo.getText();
        String Mail=jGmail.getText();
        String Gender="";
        String type="";
        String areaFrom="###";
        String areaTo="####";
        int registeredby=0;
        double km=0;
        double price=0;
        String gmail=jGmail.getText();
        
        //Valdation check
 
      if(ID.equals(""))
       {
            JOptionPane.showMessageDialog(rootPane, "NIC Cannot be Empty");
           
        }
      else if(FName.equals(""))
      {
          JOptionPane.showMessageDialog(rootPane, "First Name Cannt be empty");
      }
      else if(LName.equals(""))
      {
          JOptionPane.showMessageDialog(rootPane, "Last name Cannot be empty");
      }
      else if(gmail.equals(""))
      {
          JOptionPane.showMessageDialog(rootPane, "Gmail Cannot be empty");
          
      }
      else if(strMobile.equals(""))
      {
          JOptionPane.showMessageDialog(rootPane, "Mobile Number Cannt be empty");
      }
      else if(jMobileNo.getBackground()==Color.red)
      {
          JOptionPane.showMessageDialog(rootPane, "mobile No should be Integer");
      }

       else  if(Student.isSelected()==false && Public.isSelected()==false)
        {
            JOptionPane.showMessageDialog(rootPane,"One type should be selected");
        }
       else  if(jmale.isSelected()==false && jFemale.isSelected()==false)
        {
            JOptionPane.showMessageDialog(rootPane, "Gender cannot be unselected");
            
        }
       

        else
        {
        //Gender selection
        int mobileNo=Integer.parseInt(jMobileNo.getText());
        if(jmale.isSelected()==true)  { Gender="Male";  }
        else if(jFemale.isSelected()==true) {  Gender="Female";   }

        //Type selection
     
       if(Student.isSelected()==true)
        {
            try {
             type="Student";
            Statement s=dbconnection.mycon().createStatement();
           String query="INSERT INTO `student`(NIC,StudentID,FirstName,Address,ZipCode,LastName,Gender,SchoolID,SchoolName,Area_From,Area_To,KM, Price,RegisteredBy,MobileNo,Gmail) VALUES "+
                                "('"+ID+"',"+StudentID+",'"+FName+"','"+Address+"',"+zipcode+",'"+LName+"','"+Gender+"',"+StudentID+",'"+SchoolName+"','"+areaFrom+"','"+areaTo+"',"+km+","+price+","+registeredby+","+mobileNo+",'"+gmail+"')";
            s.executeUpdate(query);
         //   JOptionPane.showMessageDialog(rootPane, "Inserted sucessfully");
            this.hide();
            new StudentRegistion(ID,type,gmail).show();
          
                
            } catch (Exception e) {
               JOptionPane.showMessageDialog(rootPane, "Account Already registered");
            }
            //inserting data to the type Student

        }
        else if(Public.isSelected()==true)
        {
            try {
                 type="Public";
             Statement s=dbconnection.mycon().createStatement();
             String query="INSERT INTO `public`(`NIC`, `First Name`, `Last Name`, `MoblieNo`, `Gmail`, `Address`, `ZipCode`, `AreaFrom`, `AreaTo`, `KM`, `Price`, `RegisteredBy`, `Gender`) VALUES "+
                                  "('"+ID+"','"+FName+"','"+LName+"',"+mobileNo+",'"+gmail+"','"+Address+"',"+zipcode+",'"+areaFrom+"','"+areaTo+"',"+km+","+price+",'"+registeredby+"','"+Gender+"')";
             s.executeUpdate(query);
           //  JOptionPane.showMessageDialog(rootPane, "inserted sucessfull");
             
            new Residence(ID,type,gmail).show();
            this.hide();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Account Already registered");
            }
            //Inserting data to the type Public
        }
     
        }
            
   
 // TODO add your handling code here:
       
        
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        new Home().show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMobileNoActionPerformed

    private void jMobileNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMobileNoKeyReleased
        // TODO add your handling code here:
       String mobile=jMobileNo.getText();
       
       if(mobile.matches("^[0-9]*$")&& mobile.length()==10)
       {
           jMobileNo.setBackground(Color.green);
       }
       else
       {
           jMobileNo.setBackground(Color.red);
       }
        

        
    }//GEN-LAST:event_jMobileNoKeyReleased

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
            java.util.logging.Logger.getLogger(BasicRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasicRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasicRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasicRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasicRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GenderGroup;
    private javax.swing.JRadioButton Public;
    private javax.swing.JRadioButton Student;
    private javax.swing.ButtonGroup Type;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jFemale;
    private javax.swing.JTextField jFirstName;
    private javax.swing.JTextField jGmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLastName;
    private javax.swing.JTextField jMobileNo;
    private javax.swing.JTextField jNIC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jmale;
    // End of variables declaration//GEN-END:variables
}
