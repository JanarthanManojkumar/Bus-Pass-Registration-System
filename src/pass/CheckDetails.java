
package pass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class CheckDetails extends javax.swing.JFrame {

        Connection con =null;
        ResultSet rs=null;
        PreparedStatement ps =null;
        public int passdep;

    public CheckDetails() 
    {
        initComponents();
        con=dbconnection.mycon();
    }
    CheckDetails(int dep)
    {
        passdep=dep;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jNIC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPublic = new javax.swing.JRadioButton();
        jStudent = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jFName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMobileNo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jGmail = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jGender = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jClose = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jAddress = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jAreaFrom = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jAreaTo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jStudentID = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSchoolID = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSchoolName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel1.setText("NIC/PostalCode");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setText("Type");

        jPublic.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jPublic);
        jPublic.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jPublic.setText("Public");

        jStudent.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jStudent);
        jStudent.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jStudent.setText("Student");

        jButton1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("First Name");

        jFName.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jFName.setText("#####");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("Last Name");

        jLName.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLName.setText("#####");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setText("Mobile No");

        jMobileNo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jMobileNo.setText("#####");

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel9.setText("Gmail");

        jGmail.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jGmail.setText("#####");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel11.setText("Gender");

        jGender.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jGender.setText("#####");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jMobileNo))
                    .addComponent(jLName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jGmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jGender, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFName))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLName))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jMobileNo))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jGmail))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jGender))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        jClose.setBackground(new java.awt.Color(255, 255, 255));
        jClose.setIcon(new javax.swing.ImageIcon("E:\\Edge downloads\\multiply.png")); // NOI18N
        jClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Details Check");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 1066, Short.MAX_VALUE)
                .addComponent(jClose))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jClose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 102, 51));

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel19.setText("Address");

        jAddress.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jAddress.setText("#####");

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel21.setText("Area From");

        jAreaFrom.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jAreaFrom.setText("#####");

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel23.setText("Area To");

        jAreaTo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jAreaTo.setText("#####");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel19)
                    .addComponent(jLabel23))
                .addGap(60, 60, 60)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jAreaTo)
                    .addComponent(jAddress)
                    .addComponent(jAreaFrom))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jAreaFrom))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jAreaTo)
                    .addComponent(jLabel23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel13.setText("StudentID");

        jStudentID.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jStudentID.setText("#####");

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel14.setText("SchoolID");

        jSchoolID.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jSchoolID.setText("#####");

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel15.setText("School Name");

        jSchoolName.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jSchoolName.setText("#####");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSchoolName))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(51, 51, 51)
                        .addComponent(jStudentID))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSchoolID)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jStudentID))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jSchoolID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jSchoolName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jNIC)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(35, 35, 35)
                                    .addComponent(jStudent)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPublic))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPublic)
                    .addComponent(jStudent)
                    .addComponent(jNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String NIC=jNIC.getText();
        String Name;
        double price;
        String From;
        String To;
        String Student;
       if(jStudent.isSelected()==false && jPublic.isSelected()==false)
        {
            JOptionPane.showMessageDialog(rootPane, "Type show be selected");
        }
       else if (NIC.equals(""))
       {
           JOptionPane.showMessageDialog(rootPane, "NIC is empty");
       }
       
        try {
        Statement s=dbconnection.mycon().createStatement();
        
        
        
        // when nothing is selected
 
        //When Student is Selected
        
      if(jStudent.isSelected()==true)
        {
          String Query="Select * from student WHERE NIC=?";
            
            ps=con.prepareCall(Query);
            ps.setString(1,NIC);
            
            rs=ps.executeQuery();
            if(rs.next())
            {
                jFName.setText(rs.getString("FirstName"));
                jLName.setText(rs.getString("LastName"));
                jMobileNo.setText(rs.getString("MobileNo"));
                jGender.setText(rs.getString("Gender"));
                jGmail.setText(rs.getString("Gmail"));
                
                jStudentID.setText(rs.getString("StudentID"));
                jSchoolID.setText(rs.getString("SchoolID"));
                jSchoolName.setText(rs.getString("SchoolName"));
                
               
                jAddress.setText(rs.getString("Address"));
                jAreaFrom.setText(rs.getString("Area_From"));
                jAreaTo.setText(rs.getString("Area_To"));
    
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Not Registed yet");
                jNIC.setText("");
                
            }
        }
      //When public is Selected
        else if(jPublic.isSelected()==true)
        {
            
            String Query="Select * from public WHERE NIC=?";
            ps=con.prepareCall(Query); 
            ps.setString(1,NIC);
            rs=ps.executeQuery();
            
            if(rs.next())
            {
                //fetch data
                jFName.setText(rs.getString("First Name"));
                jLName.setText(rs.getString("Last Name"));
                jMobileNo.setText(rs.getString("MoblieNo"));
                jGender.setText(rs.getString("Gender"));
                jGmail.setText(rs.getString("Gmail"));
                
                jSchoolID.setText("#####");
                jStudentID.setText("#####");
                jSchoolName.setText("#####");
            
                jAreaFrom.setText(rs.getString("AreaFrom"));
                jAreaTo.setText(rs.getString("AreaTo"));
             
                
            }
            else 
            {
                JOptionPane.showMessageDialog(rootPane, "No Records found ");
                jNIC.setText("");
         
            }
        }
          
            
        } catch (Exception e)
        {
            System.out.println(e);
        }
    
                

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseActionPerformed
this.hide();
new Home(passdep).show();
        // TODO add your handling code here:
    }//GEN-LAST:event_jCloseActionPerformed
    
public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jAddress;
    private javax.swing.JLabel jAreaFrom;
    private javax.swing.JLabel jAreaTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jClose;
    private javax.swing.JLabel jFName;
    private javax.swing.JLabel jGender;
    private javax.swing.JLabel jGmail;
    private javax.swing.JLabel jLName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jMobileNo;
    private javax.swing.JTextField jNIC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jPublic;
    private javax.swing.JLabel jSchoolID;
    private javax.swing.JLabel jSchoolName;
    private javax.swing.JRadioButton jStudent;
    private javax.swing.JLabel jStudentID;
    // End of variables declaration//GEN-END:variables
}
