package PkAdmin;


import PkSign.AccessMenu;
import PkOrders.DisplayOrderRecords;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AdminPanel extends javax.swing.JFrame {

    public AdminPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backb = new javax.swing.JButton();
        managecustomer = new javax.swing.JButton();
        managestaff = new javax.swing.JButton();
        manageOrders = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new Color(153, 0, 255));
        jLabel1.setText("Admin Management");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        backb.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backb.setText("Back");
        backb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbActionPerformed(evt);
            }
        });

        managecustomer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        managecustomer.setText("Manage Customer's Account");
        managecustomer.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                managecustomerComponentResized(evt);
            }
        });
        managecustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managecustomerActionPerformed(evt);
            }
        });

        managestaff.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        managestaff.setText("Manage staff's account");
        managestaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managestaffActionPerformed(evt);
            }
        });

        manageOrders.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        manageOrders.setText("Manage Order's Record");
        manageOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        		.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        			.addGap(112)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(managecustomer, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        				.addComponent(manageOrders, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        				.addComponent(managestaff, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))
        			.addGap(164))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(216)
        			.addComponent(backb, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(290, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(16)
        			.addComponent(managestaff, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        			.addGap(21)
        			.addComponent(managecustomer, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(manageOrders, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(backb, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        AccessMenu l = new AccessMenu();
        l.setVisible(true);
    }//GEN-LAST:event_backbActionPerformed

    private void managecustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managecustomerActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ManageCustomerAccount s = new ManageCustomerAccount();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
    }//GEN-LAST:event_managecustomerActionPerformed

    private void managecustomerComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_managecustomerComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_managecustomerComponentResized

    private void managestaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managestaffActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ManageStaffAccount s = new ManageStaffAccount();
        s.setVisible(true);
        s.setLocationRelativeTo(null);

    }//GEN-LAST:event_managestaffActionPerformed

    private void manageOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ManageOrderRecords s = new ManageOrderRecords();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
    }//GEN-LAST:event_manageOrdersActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }
    private javax.swing.JButton backb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton manageOrders;
    private javax.swing.JButton managecustomer;
    private javax.swing.JButton managestaff;
    // End of variables declaration//GEN-END:variables
}
