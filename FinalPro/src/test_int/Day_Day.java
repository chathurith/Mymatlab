/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_int;

import Interfaces.Mainbase;
import com.mysql.cj.protocol.Resultset;
import static java.lang.Integer.sum;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pct
 */
public class Day_Day extends javax.swing.JFrame {
Connection con = null;
     Statement st=null;
    ResultSet rs= null;

    //String dada;
    //ValToSearch=jDateChooser_searchdate.getDate().toString();
    /**
     * Creates new form Day_Day
     */
    public Day_Day() throws SQLException {
        //this.dada = ((JTextField)jDateChooser_searchdate.getDateEditor().getUiComponent()).getText();
        initComponents();
         //show_user2();
     //etsum();
    
 // jDateChooser_searchdate.setDateFormatString("yyyy-MM-dd");
 
    }
public ArrayList<dayday> userlist2(String dada)
{
    ArrayList<dayday> usersList2 = new ArrayList<>();

    try{
        
        Class.forName("com.mysql.jdbc.Driver");
        con = Mainbase.getConnection();
        st = con.createStatement();
        String query2="SELECT `Order_ID`,`Description`,`Quantity`,`Amount`,`Order_Time` FROM `order_de` WHERE  `Order_Date` LIKE '%"+dada+"%'";
        rs = st.executeQuery(query2);
     
    dayday day1;
    while (rs.next()){
    day1 = new dayday (rs.getString("Order_ID"), rs.getString("Description"), rs.getInt("Quantity"), rs.getDouble("Amount"),rs.getString("Order_Time"));
    usersList2.add(day1);
    
    }
    }
    catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
       }
    return usersList2;
}

public void finduser(){
ArrayList<dayday> list = userlist2(((JTextField)jDateChooser_searchdate.getDateEditor().getUiComponent()).getText());
DefaultTableModel model = new DefaultTableModel();
model.setColumnIdentifiers(new Object[]{"Order_ID","Description","Quantity`","Amount","Order_Time"});
Object [] row= new Object[5];
for(int i=0;i<list.size();i++){

row[0]=list.get(i).getOrder_ID();
row[1]=list.get(i).getDescription();
row[2]=list.get(i).getQuantity();
row[3]=list.get(i).getAmount();
row[4]=list.get(i).getOrder_Time();
model.addRow(row);
}
jTable_dayday.setModel(model);


}
/*public void show_user2() throws SQLException{
ArrayList<dayday> list = userlist2( jDateChooser_searchdate.getDate().toString());
DefaultTableModel model = (DefaultTableModel)jTable_dayday.getModel();
Object [] row= new Object[5];
for(int i=0;i<list.size();i++){

row[0]=list.get(i).getOrder_ID();
row[1]=list.get(i).getDescription();
row[2]=list.get(i).getQuantity();
row[3]=list.get(i).getAmount();
row[4]=list.get(i).getOrder_Time();
model.addRow(row);
}
jTable_dayday.setModel(model);
}*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDateChooser_searchdate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_dayday = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_profit = new javax.swing.JLabel();
        jLabel_cost = new javax.swing.JLabel();
        jLabel_total = new javax.swing.JLabel();
        jButton_search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDateChooser_searchdate.setDateFormatString("yyyy-MM-dd");
        jDateChooser_searchdate.setDateFormatString("yyyy-MM-dd");
        jDateChooser_searchdate.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jDateChooser_searchdateAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jDateChooser_searchdate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser_searchdatePropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser_searchdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 160, -1));

        jTable_dayday.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order_ID", "Description", "Quantity", "Amount", "Order_Time"
            }
        ));
        jScrollPane1.setViewportView(jTable_dayday);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, 180));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Total Income of the day     -");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Total Cost for the day        -");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Profit of the day                 -");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        jLabel_profit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_profit.setText("profit");
        jPanel1.add(jLabel_profit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        jLabel_cost.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_cost.setText("Cost");
        jPanel1.add(jLabel_cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, -1));

        jLabel_total.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jLabel_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 90, 30));

        jButton_search.setText("Search");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
           
  finduser();
    getsum();

    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jDateChooser_searchdatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser_searchdatePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser_searchdatePropertyChange

    private void jDateChooser_searchdateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jDateChooser_searchdateAncestorAdded

    }//GEN-LAST:event_jDateChooser_searchdateAncestorAdded

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
            java.util.logging.Logger.getLogger(Day_Day.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Day_Day.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Day_Day.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Day_Day.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Day_Day().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Day_Day.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
public void getsum(){
    double sum = 0;
    for (int i = 0; i<jTable_dayday.getRowCount(); i++)
    {
    sum = sum + Double.parseDouble(jTable_dayday.getValueAt(i, 3).toString());
   //double make
    }
jLabel_total.setText(Integer.toString((int) (sum)));
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_search;
    private com.toedter.calendar.JDateChooser jDateChooser_searchdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_cost;
    private javax.swing.JLabel jLabel_profit;
    private javax.swing.JLabel jLabel_total;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_dayday;
    // End of variables declaration//GEN-END:variables
}
