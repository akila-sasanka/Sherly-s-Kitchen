
package views;

import controller.ItemController;
import dto.ItemDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ItemView extends javax.swing.JFrame {

    private DefaultTableModel dl;

    public ItemView() {
        initComponents();
        dl = (DefaultTableModel) tblItem.getModel();
        loadItemData();
        clearFields();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtItemPrice = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        txtItemQty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        btnAddItem = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblItemId = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDelete1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bitstream Charter", 1, 36)); // NOI18N
        jLabel1.setText("Manage Food");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("Item Price  :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Item Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel4.setText("Item Qty :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        getContentPane().add(txtItemPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 270, -1));
        getContentPane().add(txtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 270, -1));
        getContentPane().add(txtItemQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 270, -1));

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemID", "Item Name", "Qty on hand", "Item Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblItem);
        if (tblItem.getColumnModel().getColumnCount() > 0) {
            tblItem.getColumnModel().getColumn(0).setResizable(false);
            tblItem.getColumnModel().getColumn(1).setResizable(false);
            tblItem.getColumnModel().getColumn(2).setResizable(false);
            tblItem.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 480, 170));

        btnClear.setText("Clear Fields");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        btnAddItem.setText("Add Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 190, 100, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));
        getContentPane().add(lblItemId, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 50, 20));

        jLabel6.setText("Item ID :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        btnDelete1.setText("Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        jButton1.setText("Back to Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 130, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        String iid = lblItemId.getText();
        String name = txtItemName.getText();
        double price = Double.parseDouble(txtItemPrice.getText());
        int qty = Integer.parseInt(txtItemQty.getText());

        try {
            boolean isSave = new ItemController().addItem(new ItemDTO(iid, name, qty, price));
            if (isSave) {
                JOptionPane.showMessageDialog(this, name + " Added Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Error.Try again");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
        }
        clearFields();
        loadItemData();

    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String iid = lblItemId.getText();
        String name = txtItemName.getText();
        double price = Double.parseDouble(txtItemPrice.getText());
        int qty = Integer.parseInt(txtItemQty.getText());

        try {
            boolean isUpdate = new ItemController().updateItem(new ItemDTO(iid, name, qty, price));
            if (isUpdate) {
                JOptionPane.showMessageDialog(this, iid+" Updated Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Error.Try again");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
        }
        clearFields();
        loadItemData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMouseClicked
        int selectedRow = tblItem.getSelectedRow();
        if (selectedRow != -1) {
            lblItemId.setText(dl.getValueAt(selectedRow, 0).toString());
            txtItemName.setText(dl.getValueAt(selectedRow, 1).toString());
            txtItemQty.setText(dl.getValueAt(selectedRow, 2).toString());
            txtItemPrice.setText(dl.getValueAt(selectedRow, 3).toString());
        }
    }//GEN-LAST:event_tblItemMouseClicked

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        try {
            boolean deleteItem = new ItemController().deleteItem(lblItemId.getText());
            if(deleteItem){
                JOptionPane.showMessageDialog(this, "Deleted Successfully");
            }else{
                JOptionPane.showMessageDialog(this, "Error Try again");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
        }
        clearFields();
        loadItemData();
    }//GEN-LAST:event_btnDelete1ActionPerformed

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
            java.util.logging.Logger.getLogger(ItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblItemId;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemPrice;
    private javax.swing.JTextField txtItemQty;
    // End of variables declaration//GEN-END:variables

    private void loadItemData() {
        dl.setRowCount(0);
        try {
            ArrayList<ItemDTO> listofItems = new ItemController().getAllItem();
            for (ItemDTO item : listofItems) {
                Object[] dataset = {item.getIid(), item.getItemName(), item.getItemQty(), item.getItemPrice()};
                dl.addRow(dataset);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearFields() {
        txtItemPrice.setText("");
        txtItemQty.setText("");
        txtItemName.setText("");
        try {
            lblItemId.setText(new ItemController().getItemId());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
