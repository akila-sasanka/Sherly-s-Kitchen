
package views;

import controller.ItemController;
import controller.ManageOrderController;
import dto.ItemDTO;
import dto.OrderDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ManageOrder extends javax.swing.JFrame {

    private DefaultTableModel dl;

    public ManageOrder() {
        initComponents();
        dl = (DefaultTableModel) tblOrderDetails.getModel();
        loadItemData();
        clearFields();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetails = new javax.swing.JTable();
        lblItemId = new javax.swing.JLabel();
        btnPayment = new javax.swing.JButton();
        btnCancelOrder = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bitstream Charter", 1, 36)); // NOI18N
        jLabel1.setText("Manage Order");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderId", "Date", "Priority Date", "Cid", "Payment", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrderDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrderDetails);
        if (tblOrderDetails.getColumnModel().getColumnCount() > 0) {
            tblOrderDetails.getColumnModel().getColumn(0).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(1).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(3).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 540, 270));
        getContentPane().add(lblItemId, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 50, 20));

        btnPayment.setText("Make Payment");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });
        getContentPane().add(btnPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 130, 40));

        btnCancelOrder.setText("Cancel Order");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 130, 40));

        jButton1.setText("Back to Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 130, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblOrderDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderDetailsMouseClicked

    }//GEN-LAST:event_tblOrderDetailsMouseClicked

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        int selectedRow = tblOrderDetails.getSelectedRow();
        String orderId = dl.getValueAt(selectedRow, 0).toString();
        
        try {
            boolean makePayment = new ManageOrderController().makePayment(orderId);
            if(makePayment){
                JOptionPane.showMessageDialog(this, "Success.Payment is Complete for order :"+orderId);
            }else{
                JOptionPane.showMessageDialog(this, "Error Try again");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageOrder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadItemData();
        
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        int selectedRow = tblOrderDetails.getSelectedRow();
        String orderId = dl.getValueAt(selectedRow, 0).toString();
        
        try {
            boolean cancel = new ManageOrderController().cancelOrder(orderId);
            if(cancel){
                JOptionPane.showMessageDialog(this, "Success.order :"+orderId+" has been cancelled.This will no longer displayed");
            }else{
                JOptionPane.showMessageDialog(this, "Error Try again");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadItemData();
    }//GEN-LAST:event_btnCancelOrderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not avaitblOrderDetailsstay with the dtblOrderDetailslook and feel.
         * For details see http://downltblOrderDetailscle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         tblOrderDetails    try {
            for (javax.swing.UIManager.LookAndFeelInfotblOrderDetails javax.swing.UIManager.getInstalledLookAndFeels()) {
           tblOrderDetails ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblItemId;
    private javax.swing.JTable tblOrderDetails;
    // End of variables declaration//GEN-END:variables

    private void loadItemData() {
        dl.setRowCount(0);
        try {
            ArrayList<OrderDTO> listofOrders = new ManageOrderController().getOrdersPriorityWise();
            for (OrderDTO order : listofOrders) {
                Object[] dataset = {order.getOid(),order.getDate(),order.getRequiredDate(),order.getCid(),order.isPaymentState()==true ? "Paid" : "Due",order.getAmount()};
                dl.addRow(dataset);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearFields() {
        
    }
}
