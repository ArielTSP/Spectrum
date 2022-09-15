
package view;

public class Splash_Screen_GUI extends javax.swing.JFrame {
    
    public Splash_Screen_GUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Logo_IMG = new org.edisoncor.gui.panel.PanelImage();
        Acess_BTN = new javax.swing.JButton();
        Close_BTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(102, 102, 102));
        Background.setLayout(null);

        Logo_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Flat Logo.png"))); // NOI18N

        javax.swing.GroupLayout Logo_IMGLayout = new javax.swing.GroupLayout(Logo_IMG);
        Logo_IMG.setLayout(Logo_IMGLayout);
        Logo_IMGLayout.setHorizontalGroup(
            Logo_IMGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );
        Logo_IMGLayout.setVerticalGroup(
            Logo_IMGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );

        Background.add(Logo_IMG);
        Logo_IMG.setBounds(140, 10, 203, 201);

        Acess_BTN.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Acess_BTN.setText("Acessar Loja Virtual");
        Acess_BTN.setFocusable(false);
        Acess_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acess_BTNActionPerformed(evt);
            }
        });
        Background.add(Acess_BTN);
        Acess_BTN.setBounds(160, 220, 170, 30);

        Close_BTN.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Close_BTN.setForeground(new java.awt.Color(255, 255, 255));
        Close_BTN.setText("X");
        Close_BTN.setBorderPainted(false);
        Close_BTN.setContentAreaFilled(false);
        Close_BTN.setFocusable(false);
        Close_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_BTNActionPerformed(evt);
            }
        });
        Background.add(Close_BTN);
        Close_BTN.setBounds(423, 10, 50, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(485, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Acess_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acess_BTNActionPerformed
        new Pedido_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Acess_BTNActionPerformed

    private void Close_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_BTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Close_BTNActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public void main(String args[]) throws InterruptedException {
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
            java.util.logging.Logger.getLogger(Splash_Screen_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash_Screen_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash_Screen_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash_Screen_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash_Screen_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acess_BTN;
    private javax.swing.JPanel Background;
    private javax.swing.JButton Close_BTN;
    private org.edisoncor.gui.panel.PanelImage Logo_IMG;
    // End of variables declaration//GEN-END:variables
}
