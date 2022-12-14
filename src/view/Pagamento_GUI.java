
package view;

public class Pagamento_GUI extends javax.swing.JFrame {
    
    public Pagamento_GUI() {
        initComponents();
        Panel_Credit_PNL.setVisible(false);
        Panel_PIX_PNL.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaymentMethods = new javax.swing.ButtonGroup();
        Background = new javax.swing.JPanel();
        Banner_IMG = new org.edisoncor.gui.panel.PanelImage();
        Close_BTN = new javax.swing.JButton();
        Name_LBL = new javax.swing.JLabel();
        Nome_TXF = new javax.swing.JTextField();
        Contact_LBL = new javax.swing.JLabel();
        Contact_JTF = new javax.swing.JTextField();
        CPF_LBL = new javax.swing.JLabel();
        CPF_TXF = new javax.swing.JTextField();
        Info_LBL = new javax.swing.JLabel();
        InfoPayment_LBL = new javax.swing.JLabel();
        Panel_Credit_PNL = new javax.swing.JPanel();
        Numero_JTF = new javax.swing.JTextField();
        Numero_LBL = new javax.swing.JLabel();
        Titular_JTF = new javax.swing.JTextField();
        Titular_LBL = new javax.swing.JLabel();
        CVV_JTF = new javax.swing.JTextField();
        CVV_LBL = new javax.swing.JLabel();
        D_Vencimento_JTF = new javax.swing.JTextField();
        D_Vencimento_LBL = new javax.swing.JLabel();
        Methods_PNL = new javax.swing.JPanel();
        CartaoDeCredito_RBT = new javax.swing.JRadioButton();
        Pix_RBT = new javax.swing.JRadioButton();
        Dinheiro_RBT = new javax.swing.JRadioButton();
        Panel_PIX_PNL = new javax.swing.JPanel();
        ChavePix_TXT = new javax.swing.JScrollPane();
        ChavePix_JXT = new javax.swing.JTextArea();
        ChavePix_LBL = new javax.swing.JLabel();
        Pix_QR_IMG = new org.edisoncor.gui.panel.PanelImage();
        QR_Code_LBL = new javax.swing.JLabel();
        Effect_Payment_BTN = new javax.swing.JButton();

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

        Name_LBL.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Name_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Name_LBL.setText("Nome");
        Background.add(Name_LBL);
        Name_LBL.setBounds(30, 170, 200, 30);

        Nome_TXF.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Nome_TXF.setToolTipText("");
        Background.add(Nome_TXF);
        Nome_TXF.setBounds(30, 200, 200, 30);

        Contact_LBL.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Contact_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Contact_LBL.setText("Contato");
        Background.add(Contact_LBL);
        Contact_LBL.setBounds(30, 270, 200, 30);

        Contact_JTF.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Background.add(Contact_JTF);
        Contact_JTF.setBounds(30, 300, 200, 30);

        CPF_LBL.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CPF_LBL.setForeground(new java.awt.Color(255, 255, 255));
        CPF_LBL.setText("CPF");
        Background.add(CPF_LBL);
        CPF_LBL.setBounds(30, 360, 200, 30);

        CPF_TXF.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Background.add(CPF_TXF);
        CPF_TXF.setBounds(30, 390, 200, 30);

        Info_LBL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Info_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Info_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Info_LBL.setText("Informa????es de Cadastro");
        Background.add(Info_LBL);
        Info_LBL.setBounds(20, 140, 230, 22);

        InfoPayment_LBL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        InfoPayment_LBL.setForeground(new java.awt.Color(255, 255, 255));
        InfoPayment_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InfoPayment_LBL.setText("Informa????es de Pagamento");
        Background.add(InfoPayment_LBL);
        InfoPayment_LBL.setBounds(260, 140, 260, 22);

        Panel_Credit_PNL.setLayout(null);

        Numero_JTF.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Panel_Credit_PNL.add(Numero_JTF);
        Numero_JTF.setBounds(10, 31, 220, 20);

        Numero_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Numero_LBL.setText("N??mero do Cart??o");
        Panel_Credit_PNL.add(Numero_LBL);
        Numero_LBL.setBounds(10, 11, 87, 14);

        Titular_JTF.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Panel_Credit_PNL.add(Titular_JTF);
        Titular_JTF.setBounds(10, 77, 220, 20);

        Titular_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Titular_LBL.setText("Nome do(a) Titular");
        Panel_Credit_PNL.add(Titular_LBL);
        Titular_LBL.setBounds(10, 57, 88, 14);

        CVV_JTF.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Panel_Credit_PNL.add(CVV_JTF);
        CVV_JTF.setBounds(10, 123, 80, 20);

        CVV_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        CVV_LBL.setText("CVV");
        Panel_Credit_PNL.add(CVV_LBL);
        CVV_LBL.setBounds(10, 103, 50, 14);

        D_Vencimento_JTF.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Panel_Credit_PNL.add(D_Vencimento_JTF);
        D_Vencimento_JTF.setBounds(100, 123, 130, 20);

        D_Vencimento_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        D_Vencimento_LBL.setText("Data de Vencimento");
        Panel_Credit_PNL.add(D_Vencimento_LBL);
        D_Vencimento_LBL.setBounds(103, 103, 130, 14);

        Background.add(Panel_Credit_PNL);
        Panel_Credit_PNL.setBounds(270, 250, 240, 150);

        Methods_PNL.setBackground(new java.awt.Color(153, 153, 153));
        Methods_PNL.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "M??todos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        PaymentMethods.add(CartaoDeCredito_RBT);
        CartaoDeCredito_RBT.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        CartaoDeCredito_RBT.setText("Cart??o de Cr??dito");
        CartaoDeCredito_RBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartaoDeCredito_RBTActionPerformed(evt);
            }
        });

        PaymentMethods.add(Pix_RBT);
        Pix_RBT.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Pix_RBT.setText("PIX");
        Pix_RBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pix_RBTActionPerformed(evt);
            }
        });

        PaymentMethods.add(Dinheiro_RBT);
        Dinheiro_RBT.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Dinheiro_RBT.setText("Dinheiro");
        Dinheiro_RBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dinheiro_RBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Methods_PNLLayout = new javax.swing.GroupLayout(Methods_PNL);
        Methods_PNL.setLayout(Methods_PNLLayout);
        Methods_PNLLayout.setHorizontalGroup(
            Methods_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Methods_PNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Methods_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dinheiro_RBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Methods_PNLLayout.createSequentialGroup()
                        .addComponent(CartaoDeCredito_RBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Pix_RBT, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Methods_PNLLayout.setVerticalGroup(
            Methods_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Methods_PNLLayout.createSequentialGroup()
                .addGroup(Methods_PNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CartaoDeCredito_RBT)
                    .addComponent(Pix_RBT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
                .addComponent(Dinheiro_RBT))
        );

        Background.add(Methods_PNL);
        Methods_PNL.setBounds(270, 170, 240, 70);

        Panel_PIX_PNL.setLayout(null);

        ChavePix_JXT.setEditable(false);
        ChavePix_JXT.setColumns(20);
        ChavePix_JXT.setLineWrap(true);
        ChavePix_JXT.setRows(5);
        ChavePix_JXT.setText("*m4rF&^Qf27>bC:A))JT';V!FG)#/[s;Zm@u;f*G+8PPYBU3*@}o4o2F79*mkndb/B:o'SBT{Jxot_fM8!'9Qu]4A@_UuZ`Ua=MFeqC7(@Cm?fNj_m#&=7'8");
        ChavePix_TXT.setViewportView(ChavePix_JXT);

        Panel_PIX_PNL.add(ChavePix_TXT);
        ChavePix_TXT.setBounds(10, 26, 130, 110);

        ChavePix_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        ChavePix_LBL.setText("Chave PIX");
        Panel_PIX_PNL.add(ChavePix_LBL);
        ChavePix_LBL.setBounds(10, 10, 130, 14);

        Pix_QR_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/QR Code.png"))); // NOI18N

        javax.swing.GroupLayout Pix_QR_IMGLayout = new javax.swing.GroupLayout(Pix_QR_IMG);
        Pix_QR_IMG.setLayout(Pix_QR_IMGLayout);
        Pix_QR_IMGLayout.setHorizontalGroup(
            Pix_QR_IMGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        Pix_QR_IMGLayout.setVerticalGroup(
            Pix_QR_IMGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        Panel_PIX_PNL.add(Pix_QR_IMG);
        Pix_QR_IMG.setBounds(150, 50, 80, 80);

        QR_Code_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        QR_Code_LBL.setText("C??digo QR");
        Panel_PIX_PNL.add(QR_Code_LBL);
        QR_Code_LBL.setBounds(150, 30, 80, 14);

        Background.add(Panel_PIX_PNL);
        Panel_PIX_PNL.setBounds(270, 250, 240, 150);

        Effect_Payment_BTN.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Effect_Payment_BTN.setText("Efetuar Pagamento");
        Effect_Payment_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Effect_Payment_BTNActionPerformed(evt);
            }
        });
        Background.add(Effect_Payment_BTN);
        Effect_Payment_BTN.setBounds(270, 410, 240, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(539, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Close_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_BTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Close_BTNActionPerformed

    private void Effect_Payment_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Effect_Payment_BTNActionPerformed
        boolean verificacao = model.checaFuncoes_DAO.checarFuncaoPagamento();
        
        if (verificacao == true){
            new NF_GUI().setVisible(true);
            model.notaFiscal_DAO.nf_Pedido();
            this.dispose();
        }
    }//GEN-LAST:event_Effect_Payment_BTNActionPerformed

    private void CartaoDeCredito_RBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartaoDeCredito_RBTActionPerformed
        Panel_Credit_PNL.setVisible(true);
        Panel_PIX_PNL.setVisible(false);
    }//GEN-LAST:event_CartaoDeCredito_RBTActionPerformed

    private void Pix_RBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pix_RBTActionPerformed
        Panel_Credit_PNL.setVisible(false);
        Panel_PIX_PNL.setVisible(true);
    }//GEN-LAST:event_Pix_RBTActionPerformed

    private void Dinheiro_RBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dinheiro_RBTActionPerformed
        Panel_Credit_PNL.setVisible(false);
        Panel_PIX_PNL.setVisible(false);
    }//GEN-LAST:event_Dinheiro_RBTActionPerformed

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
            java.util.logging.Logger.getLogger(Pagamento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagamento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagamento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagamento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagamento_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private org.edisoncor.gui.panel.PanelImage Banner_IMG;
    private javax.swing.JLabel CPF_LBL;
    public static javax.swing.JTextField CPF_TXF;
    public static javax.swing.JTextField CVV_JTF;
    private javax.swing.JLabel CVV_LBL;
    public static javax.swing.JRadioButton CartaoDeCredito_RBT;
    public static javax.swing.JTextArea ChavePix_JXT;
    private javax.swing.JLabel ChavePix_LBL;
    private javax.swing.JScrollPane ChavePix_TXT;
    private javax.swing.JButton Close_BTN;
    public static javax.swing.JTextField Contact_JTF;
    private javax.swing.JLabel Contact_LBL;
    public static javax.swing.JTextField D_Vencimento_JTF;
    private javax.swing.JLabel D_Vencimento_LBL;
    public static javax.swing.JRadioButton Dinheiro_RBT;
    private javax.swing.JButton Effect_Payment_BTN;
    private javax.swing.JLabel InfoPayment_LBL;
    private javax.swing.JLabel Info_LBL;
    private javax.swing.JPanel Methods_PNL;
    private javax.swing.JLabel Name_LBL;
    public static javax.swing.JTextField Nome_TXF;
    public static javax.swing.JTextField Numero_JTF;
    private javax.swing.JLabel Numero_LBL;
    private javax.swing.JPanel Panel_Credit_PNL;
    private javax.swing.JPanel Panel_PIX_PNL;
    private javax.swing.ButtonGroup PaymentMethods;
    private org.edisoncor.gui.panel.PanelImage Pix_QR_IMG;
    public static javax.swing.JRadioButton Pix_RBT;
    private javax.swing.JLabel QR_Code_LBL;
    public static javax.swing.JTextField Titular_JTF;
    private javax.swing.JLabel Titular_LBL;
    // End of variables declaration//GEN-END:variables
}
