/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uts;

/**
 *
 * @author ASUS
 */
public class frameuts extends javax.swing.JFrame {
    String musuh, User;

    /**
     * Creates new form frameuts
     */
    public frameuts() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        eGunting = new javax.swing.JButton();
        eBatu = new javax.swing.JButton();
        eKertas = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        gunting = new javax.swing.JRadioButton();
        batu = new javax.swing.JRadioButton();
        kertas = new javax.swing.JRadioButton();
        eMusuh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("PROGRAM PERMAINAN KERTAS");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        eGunting.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        eGunting.setText("GUNTING");
        eGunting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eGuntingActionPerformed(evt);
            }
        });
        jPanel1.add(eGunting, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        eBatu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        eBatu.setText("BATU");
        eBatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eBatuActionPerformed(evt);
            }
        });
        jPanel1.add(eBatu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        eKertas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        eKertas.setText("KERTAS");
        eKertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eKertasActionPerformed(evt);
            }
        });
        jPanel1.add(eKertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        user.setEditable(false);
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 200, -1));

        bg1.add(gunting);
        gunting.setText("Gunting");
        jPanel1.add(gunting, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        bg1.add(batu);
        batu.setText("Batu");
        jPanel1.add(batu, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        bg1.add(kertas);
        kertas.setText("Kertas");
        jPanel1.add(kertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        eMusuh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        eMusuh.setText("Musuh");
        jPanel1.add(eMusuh, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eGuntingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eGuntingActionPerformed
        if (gunting.isSelected()){
                User = "Seri";
            }else if (batu.isSelected()){
                User = "Anda Menang";
            }else if (kertas.isSelected()){
                User = "Anda Kalah";
            }

            user.setText("" + User);
    }//GEN-LAST:event_eGuntingActionPerformed

    private void eKertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eKertasActionPerformed
            if (gunting.isSelected()){
                User = "Anda Kalah";
            }else if (batu.isSelected()){
                User = "Anda Menang";
            }else if (kertas.isSelected()){
                User = "seri";
            }

            user.setText("" + User);

    }//GEN-LAST:event_eKertasActionPerformed

    private void eBatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eBatuActionPerformed
        if (gunting.isSelected()){
                User = "Anda Menang";
            }else if (batu.isSelected()){
                User = "Seri";
            }else if (kertas.isSelected()){
                User = "Anda Kalah";
            }

            user.setText("" + User);
    }//GEN-LAST:event_eBatuActionPerformed

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
            java.util.logging.Logger.getLogger(frameuts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameuts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameuts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameuts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameuts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton batu;
    private javax.swing.ButtonGroup bg1;
    private javax.swing.JButton eBatu;
    private javax.swing.JButton eGunting;
    private javax.swing.JButton eKertas;
    private javax.swing.JLabel eMusuh;
    private javax.swing.JRadioButton gunting;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton kertas;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
