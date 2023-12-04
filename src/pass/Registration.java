
package pass;

import java.awt.Color;
import java.beans.*;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Registration extends javax.swing.JFrame {

    public Registration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gendergroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDepartmentID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFullName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jMobileNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jMale = new javax.swing.JRadioButton();
        jFemale = new javax.swing.JRadioButton();
        BtnNext = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel1.setText("Department ID");

        jDepartmentID.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jDepartmentID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jDepartmentIDKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setText("FullName");

        jFullName.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("MobileNo");

        jMobileNo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jMobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jMobileNoKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setText("Email");

        jEmail.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("Gender");

        Gendergroup.add(jMale);
        jMale.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jMale.setText("Male");

        Gendergroup.add(jFemale);
        jFemale.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jFemale.setText("Female");
        jFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFemaleActionPerformed(evt);
            }
        });

        BtnNext.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        BtnNext.setText("Next");
        BtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registration");

        jClose.setBackground(new java.awt.Color(255, 255, 255));
        jClose.setIcon(new javax.swing.ImageIcon("E:\\Edge downloads\\multiply.png")); // NOI18N
        jClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jClose))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jClose)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1)
                                .addGap(199, 199, 199))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jDepartmentID, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jFullName)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jMale)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jFemale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDepartmentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jMale)
                        .addGap(5, 5, 5)
                        .addComponent(jFemale))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(BtnNext)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextActionPerformed
        
       
      
        String dep=jDepartmentID.getText().toString();
        String FullName=jFullName.getText();
        String strmobile=jMobileNo.getText().toString();
        String Gmail=jEmail.getText();
        String Gender="";
        String password="0";
        
    //Validation Check
     if (dep.equals("")) 
     {
         JOptionPane.showMessageDialog(rootPane, "DepartmentID Cannot be Empty");
          
      }
     else  if(FullName.equals(""))
     {
         JOptionPane.showMessageDialog(rootPane, "First Name cannot be Empty");
     }
     else if(strmobile.equals(""))
     {
         JOptionPane.showMessageDialog(rootPane, "MobileNo Cannot be empty");
     }
     else if (Gmail.equals(""))
     {
         JOptionPane.showMessageDialog(rootPane, "Gmail cannot be empty");
     }
     else if(jMobileNo.getBackground()==Color.red)
     {
         JOptionPane.showMessageDialog(rootPane, "Mobile No should be a numerical value");
         
     }
     else if(jDepartmentID.getBackground()==Color.red)
     {
         JOptionPane.showMessageDialog(rootPane, "DepartmentID should be a numerical value");
         
     }
     else if(jMale.isSelected()==false && jFemale.isSelected()==false)
        {
            JOptionPane.showConfirmDialog(rootPane,"Both cannot be empty");
        }
     else
     {
        int Mobile=Integer.parseInt(jMobileNo.getText());
        int DepartmentID= Integer.parseInt(jDepartmentID.getText());
        try{
         if(jMale.isSelected()==true) {Gender="Male"; }
        else if(jFemale.isSelected()==true) { Gender="Female";  }
 
       Statement s=dbconnection.mycon().createStatement();
       s.executeUpdate("INSERT INTO `details`(ID, FullName, MobileNo, Email,Gender,Password) VALUES"+
                                  "("+DepartmentID+",'"+FullName+"',"+Mobile+",'"+Gmail+"','"+Gender+"','"+password+"')");
      // JOptionPane.showMessageDialog(rootPane,"Inserted sucessfully");

     this.hide();
     new Registration2(DepartmentID).show();

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Account Already registered");
               
        }
      
     }
    }//GEN-LAST:event_BtnNextActionPerformed

    private void jFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFemaleActionPerformed

    private void jCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseActionPerformed
        // TODO add your handling code here:
        this.hide();
        new startuppage().show();
        
    }//GEN-LAST:event_jCloseActionPerformed

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

    private void jDepartmentIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDepartmentIDKeyReleased
        // TODO add your handling code here:
        String departmentID=jDepartmentID.getText();
        
      
         if(departmentID.matches("^[0-9]*$")&& departmentID.length()==10)
       {
           jDepartmentID.setBackground(Color.green);
       }
       else
       {
           jDepartmentID.setBackground(Color.red);
       }
    }//GEN-LAST:event_jDepartmentIDKeyReleased

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNext;
    private javax.swing.ButtonGroup Gendergroup;
    private javax.swing.JButton jClose;
    private javax.swing.JTextField jDepartmentID;
    private javax.swing.JTextField jEmail;
    private javax.swing.JRadioButton jFemale;
    private javax.swing.JTextField jFullName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jMale;
    private javax.swing.JTextField jMobileNo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
