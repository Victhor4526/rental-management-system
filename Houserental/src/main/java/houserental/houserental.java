
package houserental;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.text.*;
import java.awt.print.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.print.Printer;
import javax.print.PrintException;
import javax.swing.JTextArea;


public class houserental extends javax.swing.JFrame {

    private Object jtxtCost;
    private Object jrtReceipt;

  
    public houserental() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jReceipt = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jRental = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        txtNumberOfRoom = new javax.swing.JLabel();
        jcmbNumberOfRoom = new javax.swing.JComboBox<>();
        txtLocation = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        textCost = new javax.swing.JLabel();
        jtextCost = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JLabel();
        jtxtCustomerID = new javax.swing.JTextField();
        txtFirstname = new javax.swing.JLabel();
        jtxtFirstname = new javax.swing.JTextField();
        txtSurname = new javax.swing.JLabel();
        jtxtSurname = new javax.swing.JTextField();
        txtAddress = new javax.swing.JLabel();
        txtPostCode = new javax.swing.JLabel();
        txtTown = new javax.swing.JLabel();
        jtxtAdress = new javax.swing.JTextField();
        jtxtPostalCode = new javax.swing.JTextField();
        jtxtTown = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jcmbProveofID = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtDownPayment = new javax.swing.JLabel();
        jtxtDownPayment = new javax.swing.JTextField();
        jtxtDeposit = new javax.swing.JTextField();
        txtDeposit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtElectricityBill = new javax.swing.JLabel();
        txtWaterBill = new javax.swing.JLabel();
        txtTotalPayment = new javax.swing.JLabel();
        jtxtElectricity = new javax.swing.JTextField();
        jtxtWaterBill = new javax.swing.JTextField();
        jtxtTotalPayment = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jReceipt.setColumns(20);
        jReceipt.setRows(5);
        jScrollPane1.setViewportView(jReceipt);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 370, 360));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 410, 400));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRental.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRental.setText("Rental");
        jRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRentalActionPerformed(evt);
            }
        });
        jPanel4.add(jRental, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 80, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnExitActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 80, -1));

        jbtnPrint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnPrint.setText("Print");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrintActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 90, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 520, 410, 80));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Rental Detail");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 21, 86, 24));

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox2.setText("House");
        jPanel5.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        txtNumberOfRoom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNumberOfRoom.setText("Number of Room");
        jPanel5.add(txtNumberOfRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 180, 30));

        jcmbNumberOfRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel5.add(jcmbNumberOfRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 160, 30));

        txtLocation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtLocation.setText("Location");
        jPanel5.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 160, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colon", "Talamban", "Banilad", "Labangon", "Guadalupe" }));
        jPanel5.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 160, 30));

        textCost.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textCost.setText("Cost");
        jPanel5.add(textCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 150, -1));
        jPanel5.add(jtextCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 160, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 420, 270));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Customer Info");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 24));

        txtCustomerId.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtCustomerId.setText("Customer ID");
        jPanel6.add(txtCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel6.add(jtxtCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 120, 30));

        txtFirstname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtFirstname.setText("Firstname");
        jPanel6.add(txtFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, -1));
        jPanel6.add(jtxtFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 120, 30));

        txtSurname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtSurname.setText("Surname");
        jPanel6.add(txtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 130, -1));
        jPanel6.add(jtxtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 120, 30));

        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtAddress.setText("Address");
        jPanel6.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 100, -1));

        txtPostCode.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtPostCode.setText("Post Code ");
        jPanel6.add(txtPostCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        txtTown.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTown.setText("Town");
        jPanel6.add(txtTown, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));
        jPanel6.add(jtxtAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 150, 30));
        jPanel6.add(jtxtPostalCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 150, 30));
        jPanel6.add(jtxtTown, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 150, 30));
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, 40));

        jcmbProveofID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "StudentID", "Passport", "Licence" }));
        jcmbProveofID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbProveofIDActionPerformed(evt);
            }
        });
        jPanel6.add(jcmbProveofID, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 140, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Prove of ID");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 25, 110, 20));

        txtDownPayment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDownPayment.setText("Down Payment");
        jPanel6.add(txtDownPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 120, 30));
        jPanel6.add(jtxtDownPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 110, 30));
        jPanel6.add(jtxtDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 110, 30));

        txtDeposit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDeposit.setText("Deposit");
        jPanel6.add(txtDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 70, 20));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 850, 220));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 60)); // NOI18N
        jLabel1.setText("Rental Management System");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 928, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, -2, 1290, 110));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Utility Detail");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 21, 120, -1));

        txtElectricityBill.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtElectricityBill.setText("Electricity Bill");
        jPanel7.add(txtElectricityBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 190, 30));

        txtWaterBill.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtWaterBill.setText("Water Bill");
        jPanel7.add(txtWaterBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 160, 30));

        txtTotalPayment.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTotalPayment.setText("Total Payment");
        jPanel7.add(txtTotalPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 180, 30));
        jPanel7.add(jtxtElectricity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 160, 30));
        jPanel7.add(jtxtWaterBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 160, 30));
        jPanel7.add(jtxtTotalPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 160, 30));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 420, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  private JFrame frame; 
    private void jcmbProveofIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbProveofIDActionPerformed
      
    }//GEN-LAST:event_jcmbProveofIDActionPerformed

    private void jbtnRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRentalActionPerformed
    
        cCustomer iCustomer = new cCustomer ();
        cRent iRental = new Rental();
        cUtilities iUtilities = new cUtilities();
        
        double iCustomerDeposit, iCustomerPayment, icost, iNumberOfRoom, iWaterBill, iElectricity;
        String strCost;
        
        iCustomerDeposit = Double.parseDouble(jtxtDeposit.getText()); 
        iCustomerPayment = Double.parseDouble(jtxtDownPayment.getText()); 
        icost =Double.parseDouble(jtextCost.getText());
       
        
        iElectricity =Double.parseDouble(jtxtElectricity.getText());
        iWaterBill =Double.parseDouble(jtxtWaterBill.getText());
       
        iCustomer.setDeposit(iCustomerDeposit);
        iCustomer.setDownPayment(iCustomerPayment);
        iRental.setCost(icost);
        iUtilities.setElectricity(iElectricity);
        iUtilities.setWaterBill(iWaterBill);
        strCost= String.format("P%.2f",iCustomer.getDeposit() + iCustomer.getDownPayment() + iRental.getCost() + iUtilities.getElectricity() + 
                iUtilities.getWaterBill());
        jtxtTotalPayment.setText(strCost);
            
            jReceipt.append("\tRENTAL MANAGEMENT SYSTEM" + "\n" +
            "-------------------------------------------------------------------------------------" + "\n");
            jReceipt.append("Customer ID" + "\t\t\t" + jtxtCustomerID.getText() + "\n");
            jReceipt.append("FirstName" + "\t\t\t" + jtxtFirstname.getText() + "\n");
            jReceipt.append("Surname" + "\t\t\t" + jtxtSurname.getText() + "\n");
            jReceipt.append("Adress" + "\t\t\t" + jtxtAdress.getText() + "\n");
            jReceipt.append("Post Code" + "\t\t\t" + jtxtSurname.getText() + "\n");
            jReceipt.append("Prove of ID" + "\t\t\t" + jcmbProveofID.getSelectedItem()+ "\n");
            jReceipt.append("Town" + "\t\t\t" + jtxtTown.getText() + "\n");
            jReceipt.append("-------------------------------------------------------------------------------------" + "\n");
            jReceipt.append("Deposit" + "\t\t\t" + jtxtDeposit.getText() + "\n");
            jReceipt.append("Down Payment" + "\t\t\t" + jtxtDownPayment.getText() + "\n");
            jReceipt.append("Number of Room" + "\t\t" + jcmbNumberOfRoom.getSelectedItem()+ "\n");
        
            jReceipt.append("Electricity" + "\t\t\t" + jtxtElectricity.getText() + "\n");
            jReceipt.append("Water Bill" + "\t\t\t" + jtxtWaterBill.getText() + "\n");
            jReceipt.append("-------------------------------------------------------------------------------------" + "\n");
            jReceipt.append("Total Payment" + "\t\t\t" + jtxtTotalPayment.getText() + "\n");
                 
    }//GEN-LAST:event_jbtnRentalActionPerformed

    

    
 
    private void jbnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnExitActionPerformed
        frame = new JFrame ("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit", "Rental Management System",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
         System.exit(0);
        }
    }//GEN-LAST:event_jbnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        JTextField cleartext = null;
       
      for(Component c:jPanel6.getComponents()){
         if(c.getClass().toString().contains("javax.swing.JTextField")){
             cleartext =(JTextField)c;
             cleartext.setText("");
              jtextCost.setText("");
              jReceipt.setText("");
         }
      }
      
      
      //==========================//
             
       
      for(Component c:jPanel7.getComponents()){
         if(c.getClass().toString().contains("javax.swing.JTextField")){
             cleartext =(JTextField)c;
             cleartext.setText("");
         }
      }
      //===================//
      
      
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrintActionPerformed
      try{
          jReceipt.print();
      }catch(PrinterException ex){
          Logger.getLogger(houserental.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_jPrintActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new houserental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextArea jReceipt;
    private javax.swing.JButton jRental;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JComboBox<String> jcmbNumberOfRoom;
    private javax.swing.JComboBox<String> jcmbProveofID;
    private javax.swing.JTextField jtextCost;
    private javax.swing.JTextField jtxtAdress;
    private javax.swing.JTextField jtxtCustomerID;
    private javax.swing.JTextField jtxtDeposit;
    private javax.swing.JTextField jtxtDownPayment;
    private javax.swing.JTextField jtxtElectricity;
    private javax.swing.JTextField jtxtFirstname;
    private javax.swing.JTextField jtxtPostalCode;
    private javax.swing.JTextField jtxtSurname;
    private javax.swing.JTextField jtxtTotalPayment;
    private javax.swing.JTextField jtxtTown;
    private javax.swing.JTextField jtxtWaterBill;
    private javax.swing.JLabel textCost;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JLabel txtCustomerId;
    private javax.swing.JLabel txtDeposit;
    private javax.swing.JLabel txtDownPayment;
    private javax.swing.JLabel txtElectricityBill;
    private javax.swing.JLabel txtFirstname;
    private javax.swing.JLabel txtLocation;
    private javax.swing.JLabel txtNumberOfRoom;
    private javax.swing.JLabel txtPostCode;
    private javax.swing.JLabel txtSurname;
    private javax.swing.JLabel txtTotalPayment;
    private javax.swing.JLabel txtTown;
    private javax.swing.JLabel txtWaterBill;
    // End of variables declaration//GEN-END:variables

    private static class Rental extends cRent {

        public Rental() {
        }
    }
}
