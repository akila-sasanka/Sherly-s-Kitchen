
package views;

import controller.PlaceOrderController;
import dto.CustomerDTO;
import dto.ItemDTO;
import dto.OrderDTO;
import dto.OrderDetailDTO;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DateFormatter;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


public class PlaceOrder extends javax.swing.JFrame {

    DefaultTableModel dl;

    /**
     * Creates new form PlaceOrder
     */
    public PlaceOrder() {
        initComponents();
        dl = (DefaultTableModel) tblItem.getModel();
        loadItemNames();
        loadCustomerMobileNumbers();
        ClearAndLoadFields();
        AutoCompleteDecorator.decorate(cmboMobile);
        AutoCompleteDecorator.decorate(cmbItemName);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTotalAmount = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmboMobile = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        txtCustomerAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblCustomerId = new javax.swing.JLabel();
        lblOrderId = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbItemName = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtItemPrice = new javax.swing.JTextField();
        txtQtyRequired = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblItemId = new javax.swing.JLabel();
        lblCustomerId2 = new javax.swing.JLabel();
        lblItemQtyOnHand = new javax.swing.JLabel();
        lblCustomerId5 = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        lblCustomerId6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        btnPlaceOrder = new javax.swing.JButton();
        lblOrderId1 = new javax.swing.JLabel();
        lblCustomerId4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dtePickerReuiredDate = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotalAmount.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        getContentPane().add(lblTotalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 160, 30));

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Customer Mobile :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 17, -1, -1));

        cmboMobile.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmboMobileItemStateChanged(evt);
            }
        });
        jPanel1.add(cmboMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 12, 192, -1));

        jLabel3.setText("Customer Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 59, -1, 11));

        jLabel4.setText("Customer Adress :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 92, -1, 11));

        txtCustomerName.setEditable(false);
        jPanel1.add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 51, 158, -1));

        txtCustomerAddress.setEditable(false);
        jPanel1.add(txtCustomerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 84, 158, -1));

        jLabel5.setText("Customer ID :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 11));
        jPanel1.add(lblCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 82, 33));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        getContentPane().add(lblOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 110, 33));

        jPanel2.setBackground(new java.awt.Color(253, 251, 251));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Item Name :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        cmbItemName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbItemNameItemStateChanged(evt);
            }
        });
        jPanel2.add(cmbItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 12, 192, -1));

        jLabel7.setText("Item Price :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, 11));

        txtItemPrice.setEditable(false);
        jPanel2.add(txtItemPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 51, 170, -1));
        jPanel2.add(txtQtyRequired, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 158, -1));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, 11));

        lblItemId.setText("0");
        jPanel2.add(lblItemId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 50, 33));

        lblCustomerId2.setText("Item Id :");
        jPanel2.add(lblCustomerId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 60, 33));
        jPanel2.add(lblItemQtyOnHand, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 50, 33));

        lblCustomerId5.setText("Qty on hand :");
        jPanel2.add(lblCustomerId5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 82, 33));

        btnAddItem.setText("Add Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 170, 100, -1));

        lblCustomerId6.setText("Qty required :");
        jPanel2.add(lblCustomerId6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 82, 33));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, 206));

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Qty", "Price", "total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblItem);
        if (tblItem.getColumnModel().getColumnCount() > 0) {
            tblItem.getColumnModel().getColumn(0).setResizable(false);
            tblItem.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblItem.getColumnModel().getColumn(1).setResizable(false);
            tblItem.getColumnModel().getColumn(2).setResizable(false);
            tblItem.getColumnModel().getColumn(2).setPreferredWidth(20);
            tblItem.getColumnModel().getColumn(3).setResizable(false);
            tblItem.getColumnModel().getColumn(3).setPreferredWidth(25);
            tblItem.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 680, 120));

        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 411, 150, 40));

        lblOrderId1.setText("Order ID :");
        getContentPane().add(lblOrderId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 82, 33));

        lblCustomerId4.setText("Required Date :");
        getContentPane().add(lblCustomerId4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 100, 33));

        jLabel8.setFont(new java.awt.Font("Bitstream Charter", 1, 36)); // NOI18N
        jLabel8.setText("Place Order");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        jLabel10.setText("Total :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jButton1.setText("Back to Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 140, 40));
        getContentPane().add(dtePickerReuiredDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 170, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        String oid = lblOrderId.getText();
        String curDate = LocalDate.now().format(DateTimeFormatter.ISO_DATE);
        String cid = lblCustomerId.getText();
        double total = Double.parseDouble(lblTotalAmount.getText());

        Date date = dtePickerReuiredDate.getDate();
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");

        OrderDTO orderDTO = new OrderDTO(oid, curDate, cid, false, true, total, dt.format(date));

        for (int i = 0; i < dl.getRowCount(); i++) {
            orderDTO.getList().add(new OrderDetailDTO(oid, dl.getValueAt(i, 0).toString(), Integer.parseInt(dl.getValueAt(i, 2).toString()), Double.parseDouble(dl.getValueAt(i, 3).toString())));
        }

        try {
            boolean placeOrder = new PlaceOrderController().placeOrder(orderDTO);
            if (placeOrder) {
                JOptionPane.showMessageDialog(this, "Order Placed Successfully");
                ClearAndLoadFields();
            } else {
                JOptionPane.showMessageDialog(this, "Error Try again");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        String iid = lblItemId.getText();
        String itemName = cmbItemName.getSelectedItem().toString();
        double itemprice = Double.parseDouble(txtItemPrice.getText());
        System.out.println(" before");
        int qty = Integer.parseInt(txtQtyRequired.getText());
        System.out.println(qty);

        int rowCount = itemAlreadyExist(iid);

        if (rowCount == -1) {
            Object[] data = {iid, itemName, qty, itemprice, (qty * itemprice)};
            dl.addRow(data);
        } else {
            int finalQty = (int) dl.getValueAt(rowCount, 2) + qty;
            dl.setValueAt(finalQty, rowCount, 2);
            dl.setValueAt((finalQty * itemprice), rowCount, 4);
        }
        setTotalAmount();
        txtQtyRequired.setText("");
        txtQtyRequired.requestFocus();
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void cmboMobileItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmboMobileItemStateChanged
        try {
            CustomerDTO searchCustomer = new PlaceOrderController().searchCustomer(cmboMobile.getSelectedItem().toString());
            if (searchCustomer != null) {
                txtCustomerAddress.setText(searchCustomer.getAddress());
                txtCustomerName.setText(searchCustomer.getName());
                lblCustomerId.setText(searchCustomer.getCid());
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmboMobileItemStateChanged

    private void cmbItemNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbItemNameItemStateChanged
        try {
            ItemDTO searchItem = new PlaceOrderController().searchItem(cmbItemName.getSelectedItem().toString());
            if (searchItem != null) {
                txtItemPrice.setText(Double.toString(searchItem.getItemPrice()));
                lblItemId.setText(searchItem.getIid());
                lblItemQtyOnHand.setText(Integer.toString(searchItem.getItemQty()));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbItemNameItemStateChanged

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
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JComboBox<String> cmbItemName;
    private javax.swing.JComboBox<String> cmboMobile;
    private org.jdesktop.swingx.JXDatePicker dtePickerReuiredDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCustomerId;
    private javax.swing.JLabel lblCustomerId2;
    private javax.swing.JLabel lblCustomerId4;
    private javax.swing.JLabel lblCustomerId5;
    private javax.swing.JLabel lblCustomerId6;
    private javax.swing.JLabel lblItemId;
    private javax.swing.JLabel lblItemQtyOnHand;
    private javax.swing.JLabel lblOrderId;
    private javax.swing.JLabel lblOrderId1;
    private javax.swing.JLabel lblTotalAmount;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField txtCustomerAddress;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtItemPrice;
    private javax.swing.JTextField txtQtyRequired;
    // End of variables declaration//GEN-END:variables

    private void loadCustomerMobileNumbers() {
        try {
            for (CustomerDTO cust : new PlaceOrderController().getCustomers()) {
                cmboMobile.addItem(cust.getMobile());
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadItemNames() {
        try {
            for (ItemDTO item : new PlaceOrderController().getItems()) {
                cmbItemName.addItem(item.getItemName());
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void ClearAndLoadFields() {
        for (int i = 0; i < dl.getRowCount(); i++) {
            dl.removeRow(i);

        }
        txtCustomerAddress.setText("");
        txtCustomerName.setText("");
        txtItemPrice.setText("");
        txtQtyRequired.setText("");
        lblCustomerId.setText("");
        lblItemId.setText("");
        lblOrderId.setText("");
        lblItemQtyOnHand.setText("");
        dtePickerReuiredDate.setDate(java.sql.Date.valueOf(LocalDate.now()));
        try {
            lblOrderId.setText(new PlaceOrderController().getOrderId());
        } catch (ClassNotFoundException | SQLException e) {

        }

    }

    private int itemAlreadyExist(String iid) {
        for (int i = 0; i < dl.getRowCount(); i++) {
            if (iid.equals(dl.getValueAt(i, 0))) {
                return i;
            }
        }
        return -1;
    }

    private void setTotalAmount() {
        double total = 0;
        for (int i = 0; i < dl.getRowCount(); i++) {
            total += (double) dl.getValueAt(i, 4);
        }
        lblTotalAmount.setText(Double.toString(total));
    }
}
