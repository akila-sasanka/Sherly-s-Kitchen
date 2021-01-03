
package views;

public class MainMenu extends javax.swing.JFrame {

    
    public MainMenu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrder = new javax.swing.JButton();
        btnItem = new javax.swing.JButton();
        btnManage = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCustomer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(184, 108, 108));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOrder.setText("Place Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 141, 68));

        btnItem.setText("Manage Item");
        btnItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemActionPerformed(evt);
            }
        });
        getContentPane().add(btnItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 141, 68));

        btnManage.setText("Manage Order");
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });
        getContentPane().add(btnManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 141, 68));

        btnReport.setText("Generate Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        getContentPane().add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 141, 68));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        jLabel1.setText("Sherly's Kitchen");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 320, 50));

        btnCustomer.setText("Manage Customer");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(btnCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 141, 68));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        new PlaceOrder().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemActionPerformed
        new ItemView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnItemActionPerformed

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        new ManageOrder().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnManageActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        new Report().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        new CustomerView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnItem;
    private javax.swing.JButton btnManage;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnReport;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
