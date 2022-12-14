
package view;

import javax.swing.table.DefaultTableModel;

public class NF_GUI extends javax.swing.JFrame {

    public NF_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Banner_IMG = new org.edisoncor.gui.panel.PanelImage();
        Close_BTN = new javax.swing.JButton();
        Pedido_TXT = new javax.swing.JScrollPane();
        Pedido_JXT = new javax.swing.JTextArea();
        Greetings_LBL = new javax.swing.JLabel();
        Pedido_LBL = new javax.swing.JLabel();
        Nome_LBL = new javax.swing.JLabel();
        Nome_JTF = new javax.swing.JTextField();
        Payment_M_LBL = new javax.swing.JLabel();
        Payment_M_JTF = new javax.swing.JTextField();
        CPF_LBL = new javax.swing.JLabel();
        CPF_JTF = new javax.swing.JTextField();
        TotalPay_LBL = new javax.swing.JLabel();
        TotalPay_JTF = new javax.swing.JTextField();
        Imprimir_BTN = new javax.swing.JButton();
        Finalizar_BTN = new javax.swing.JButton();
        Num_Contato_LBL = new javax.swing.JLabel();
        Contato_JTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(102, 102, 102));
        Background.setLayout(null);

        Banner_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/MK Label.png"))); // NOI18N

        javax.swing.GroupLayout Banner_IMGLayout = new javax.swing.GroupLayout(Banner_IMG);
        Banner_IMG.setLayout(Banner_IMGLayout);
        Banner_IMGLayout.setHorizontalGroup(
            Banner_IMGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        Banner_IMGLayout.setVerticalGroup(
            Banner_IMGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        Background.add(Banner_IMG);
        Banner_IMG.setBounds(10, 0, 480, 110);

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
        Close_BTN.setBounds(490, 10, 50, 30);

        Pedido_JXT.setEditable(false);
        Pedido_JXT.setColumns(20);
        Pedido_JXT.setRows(5);
        Pedido_TXT.setViewportView(Pedido_JXT);

        Background.add(Pedido_TXT);
        Pedido_TXT.setBounds(20, 200, 160, 240);

        Greetings_LBL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Greetings_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Greetings_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Greetings_LBL.setText("Agradecemos Por Escolher Nosso Servi??o!");
        Background.add(Greetings_LBL);
        Greetings_LBL.setBounds(20, 110, 500, 30);

        Pedido_LBL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Pedido_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Pedido_LBL.setText("Seu Pedido:");
        Background.add(Pedido_LBL);
        Pedido_LBL.setBounds(20, 164, 160, 30);

        Nome_LBL.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Nome_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Nome_LBL.setText("Nome");
        Background.add(Nome_LBL);
        Nome_LBL.setBounds(190, 170, 140, 20);

        Nome_JTF.setEditable(false);
        Nome_JTF.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Background.add(Nome_JTF);
        Nome_JTF.setBounds(190, 200, 140, 19);

        Payment_M_LBL.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Payment_M_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Payment_M_LBL.setText("Metodo de Pagamento");
        Background.add(Payment_M_LBL);
        Payment_M_LBL.setBounds(190, 290, 140, 20);

        Payment_M_JTF.setEditable(false);
        Payment_M_JTF.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Background.add(Payment_M_JTF);
        Payment_M_JTF.setBounds(190, 320, 140, 19);

        CPF_LBL.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CPF_LBL.setForeground(new java.awt.Color(255, 255, 255));
        CPF_LBL.setText("CPF");
        Background.add(CPF_LBL);
        CPF_LBL.setBounds(190, 230, 140, 20);

        CPF_JTF.setEditable(false);
        CPF_JTF.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Background.add(CPF_JTF);
        CPF_JTF.setBounds(190, 260, 140, 19);

        TotalPay_LBL.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TotalPay_LBL.setForeground(new java.awt.Color(255, 255, 255));
        TotalPay_LBL.setText("Pre??o Total");
        Background.add(TotalPay_LBL);
        TotalPay_LBL.setBounds(190, 350, 140, 20);

        TotalPay_JTF.setEditable(false);
        TotalPay_JTF.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Background.add(TotalPay_JTF);
        TotalPay_JTF.setBounds(190, 380, 140, 19);

        Imprimir_BTN.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Imprimir_BTN.setText("Imprimir");
        Imprimir_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir_BTNActionPerformed(evt);
            }
        });
        Background.add(Imprimir_BTN);
        Imprimir_BTN.setBounds(350, 330, 170, 50);

        Finalizar_BTN.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Finalizar_BTN.setText("Fechar Pedido");
        Finalizar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Finalizar_BTNActionPerformed(evt);
            }
        });
        Background.add(Finalizar_BTN);
        Finalizar_BTN.setBounds(350, 390, 170, 50);

        Num_Contato_LBL.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Num_Contato_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Num_Contato_LBL.setText("Contato");
        Background.add(Num_Contato_LBL);
        Num_Contato_LBL.setBounds(190, 400, 140, 20);

        Contato_JTF.setEditable(false);
        Contato_JTF.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Background.add(Contato_JTF);
        Contato_JTF.setBounds(190, 420, 140, 19);

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

        setSize(new java.awt.Dimension(539, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Close_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_BTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Close_BTNActionPerformed

    private void Finalizar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Finalizar_BTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Finalizar_BTNActionPerformed

    private void Imprimir_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir_BTNActionPerformed
        Impressao_NF_DAO NF = new Impressao_NF_DAO();
        model.impressao_DAO.gerarNF();
        NF.setVisible(true);
    }//GEN-LAST:event_Imprimir_BTNActionPerformed

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
            java.util.logging.Logger.getLogger(NF_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NF_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NF_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NF_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NF_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private org.edisoncor.gui.panel.PanelImage Banner_IMG;
    public static javax.swing.JTextField CPF_JTF;
    private javax.swing.JLabel CPF_LBL;
    private javax.swing.JButton Close_BTN;
    public static javax.swing.JTextField Contato_JTF;
    private javax.swing.JButton Finalizar_BTN;
    private javax.swing.JLabel Greetings_LBL;
    private javax.swing.JButton Imprimir_BTN;
    public static javax.swing.JTextField Nome_JTF;
    private javax.swing.JLabel Nome_LBL;
    private javax.swing.JLabel Num_Contato_LBL;
    public static javax.swing.JTextField Payment_M_JTF;
    private javax.swing.JLabel Payment_M_LBL;
    public static javax.swing.JTextArea Pedido_JXT;
    private javax.swing.JLabel Pedido_LBL;
    public static javax.swing.JScrollPane Pedido_TXT;
    public static javax.swing.JTextField TotalPay_JTF;
    private javax.swing.JLabel TotalPay_LBL;
    // End of variables declaration//GEN-END:variables
}
