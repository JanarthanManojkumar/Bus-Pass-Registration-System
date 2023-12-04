
package pass;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class RegistrationRequests extends javax.swing.JFrame {
    Connection con =null;
    ResultSet rs=null;
    PreparedStatement ps =null;


    public RegistrationRequests() throws SQLException {
        initComponents();
       
        try{
         con=dbconnection.mycon();
         
         Statement s=dbconnection.mycon().createStatement();
         String q="SELECT * FROM `request`";
        
         ResultSet rs= s.executeQuery(q);
         ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
         DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
          
         int cols=rsmd.getColumnCount();
         String[] colName=new String[cols];
         for(int i=0;i<cols;i++)
         {
             colName[i]=rsmd.getColumnName(i+1);
         }
         model.setColumnIdentifiers(colName);
         String NIC,Fname,Lname,Type,Gamil,Gender,SchoolName,Address,AreaFrom,AreaTo,Letter,mobileNo,zipCode,StudentID,SchoolID;
         
         while(rs.next())
         {
             NIC=rs.getString(1);
             Fname=rs.getString(2);
             Lname=rs.getString(3);
             Type=rs.getString(4);
             mobileNo=rs.getString(5);
             Gamil=rs.getString(6);
             Gender=rs.getString(7);
             StudentID=rs.getString(8);
             SchoolID=rs.getString(9);
             SchoolName=rs.getString(10);
             zipCode=rs.getString(11);
             Address=rs.getString(12);
             AreaFrom=rs.getString(13);
             AreaTo=rs.getString(14);
             Letter=rs.getString(15);
             String [] row={NIC,Fname,Lname,Type,mobileNo,Gamil,Gender,StudentID,SchoolName,zipCode,Address,AreaFrom,AreaTo,Letter};
             model.addRow(row);
             
         }
         s.close();
         con.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }

    }


    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        jClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jClose.setBackground(new java.awt.Color(204, 204, 204));
        jClose.setBorderPainted(false);
        jClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jClose))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jClose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseActionPerformed
        // TODO add your handling code here:
        new Home().show();
        this.hide();
    }//GEN-LAST:event_jCloseActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RegistrationRequests().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(RegistrationRequests.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jClose;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
