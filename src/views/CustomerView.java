
package views;

import controller.CustomerController;
import dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomerView extends javax.swing.JFrame {

    private DefaultTableModel dl;

    public CustomerView() {
        initComponents();
        dl = (DefaultTableModel) tblCustomer.getModel();
        loadCustomerData();
        clearFields();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtMobileNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblcustId = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDelete1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bitstream Charter", 1, 36)); // NOI18N
        jLabel1.setText("Manage Customer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("Adress :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel4.setText("Mobile Number :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        getContentPane().add(txtAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 270, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 270, -1));
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 270, -1));

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustID", "Name", "Mobile Number", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);
        if (tblCustomer.getColumnModel().getColumnCount() > 0) {
            tblCustomer.getColumnModel().getColumn(0).setResizable(false);
            tblCustomer.getColumnModel().getColumn(1).setResizable(false);
            tblCustomer.getColumnModel().getColumn(2).setResizable(false);
            tblCustomer.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 170));

        btnClear.setText("Clear Fields");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 190, 100, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));
        getContentPane().add(lblcustId, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 50, 20));

        jLabel6.setText("Customer ID :");
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

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String cid = lblcustId.getText();
        String name = txtName.getText();
        String address = txtAdress.getText();
        String mobileNumbr = txtMobileNumber.getText();

        try {
            boolean isSave = new CustomerController().addCustomer(new CustomerDTO(cid, name, mobileNumbr, address));
            if (isSave) {
                JOptionPane.showMessageDialog(this, "Customer Added Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Error.Try again");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        }
        clearFields();
        loadCustomerData();

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String cid = lblcustId.getText();
        String name = txtName.getText();
        String address = txtAdress.getText();
        String mobileNumbr = txtMobileNumber.getText();

        try {
            boolean isSave = new CustomerController().updateCustomer(new CustomerDTO(cid, name, mobileNumbr, address));
            if (isSave) {
                JOptionPane.showMessageDialog(this, "Customer Updated Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Error.Try again");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        }
        clearFields();
        loadCustomerData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        int selectedRow = tblCustomer.getSelectedRow();
        if (selectedRow != -1) {
            lblcustId.setText(dl.getValueAt(selectedRow, 0).toString());
            txtName.setText(dl.getValueAt(selectedRow, 1).toString());
            txtMobileNumber.setText(dl.getValueAt(selectedRow, 2).toString());
            txtAdress.setText(dl.getValueAt(selectedRow, 3).toString());
        }
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        try {
            boolean deleteItem = new CustomerController().deleteCustomer(lblcustId.getText());
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
        loadCustomerData();
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
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcustId;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void loadCustomerData() {
        dl.setRowCount(0);
        try {
            ArrayList<CustomerDTO> listofCustomers = new CustomerController().getAllCustomer();
            for (CustomerDTO customer : listofCustomers) {
                Object[] dataset = {customer.getCid(), customer.getName(), customer.getMobile(), customer.getAddress()};
                dl.addRow(dataset);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearFields() {
        txtAdress.setText("");
        txtMobileNumber.setText("");
        txtName.setText("");
        try {
            lblcustId.setText(new CustomerController().getCustId());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
