
package views;

import controller.ReportController;
import dto.OrderDTO;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Report extends javax.swing.JFrame {

    private DefaultTableModel dl;

    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
        dl = (DefaultTableModel) tblReportData.getModel();
        dtePickerFrom.setDate(java.sql.Date.valueOf(LocalDate.now()));
        dtePickerTo.setDate(java.sql.Date.valueOf(LocalDate.now()));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEntryCount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmboReport = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblReportName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReportData = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        dtePickerTo = new org.jdesktop.swingx.JXDatePicker();
        dtePickerFrom = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEntryCount.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        getContentPane().add(lblEntryCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jLabel2.setText("Report Type :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 72, -1, -1));

        cmboReport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cancelled Orders", "Placed Orders" }));
        getContentPane().add(cmboReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 67, 340, -1));

        jLabel3.setText("Date From :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 117, -1, -1));

        jLabel4.setText("Date to  :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 120, -1));

        jLabel5.setFont(new java.awt.Font("Bitstream Charter", 1, 36)); // NOI18N
        jLabel5.setText("Generate Order Report");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        lblReportName.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        lblReportName.setText("No of Orders ");
        getContentPane().add(lblReportName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        tblReportData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderId", "Order Date", "CustomerId", "OrderAmount", "Pay Status", "Open Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReportData);
        if (tblReportData.getColumnModel().getColumnCount() > 0) {
            tblReportData.getColumnModel().getColumn(0).setResizable(false);
            tblReportData.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblReportData.getColumnModel().getColumn(2).setResizable(false);
            tblReportData.getColumnModel().getColumn(2).setPreferredWidth(15);
            tblReportData.getColumnModel().getColumn(3).setResizable(false);
            tblReportData.getColumnModel().getColumn(4).setResizable(false);
            tblReportData.getColumnModel().getColumn(4).setPreferredWidth(10);
            tblReportData.getColumnModel().getColumn(5).setResizable(false);
            tblReportData.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 600, 290));

        jButton2.setText("Back to Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, 130, 50));
        getContentPane().add(dtePickerTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));
        getContentPane().add(dtePickerFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dtePickerToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtePickerToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dtePickerToActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String fromDate = converDate(dtePickerFrom.getDate());
        String toDate = converDate(dtePickerTo.getDate());

        try {
            if (cmboReport.getSelectedIndex() == 0) {
                ArrayList<OrderDTO> cancelledOrder = new ReportController().getCancelledOrder(fromDate, toDate);
                loadDatatoTheWindow(cancelledOrder);
                lblReportName.setText("No of Cancalled Orders");
            } else if(cmboReport.getSelectedIndex() == 1){
                ArrayList<OrderDTO> placedOrder = new ReportController().getPlacedOrder(fromDate, toDate);
                loadDatatoTheWindow(placedOrder);
                lblReportName.setText("No of Placed Orders");
            }
        }catch(ClassNotFoundException | SQLException e){
        
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmboReport;
    private org.jdesktop.swingx.JXDatePicker dtePickerFrom;
    private org.jdesktop.swingx.JXDatePicker dtePickerTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEntryCount;
    private javax.swing.JLabel lblReportName;
    private javax.swing.JTable tblReportData;
    // End of variables declaration//GEN-END:variables

    private String converDate(Date date) {
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        return dt.format(date);
    }

    private void loadDatatoTheWindow(ArrayList<OrderDTO> list) {
        int counter = 0;
        dl.setRowCount(0);
        for (OrderDTO order : list) {
            counter++;
            Object[] dataSet = {order.getOid(),order.getDate(),order.getCid(), order.getAmount(), order.isPaymentState() == true ? "Paid" : "Due", order.isOpeanCloseState() == true ? "Open" : "Cancelled"};
            dl.addRow(dataSet);
        }

        lblEntryCount.setText(": " + counter);
    }
}
