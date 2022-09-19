
package view;

public class Impressao_NF_DAO extends javax.swing.JFrame {

    public Impressao_NF_DAO() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fundo = new javax.swing.JPanel();
        Close_BTN = new javax.swing.JButton();
        Vendedora_LBL = new javax.swing.JLabel();
        DocAux_LBL = new javax.swing.JLabel();
        Localizacao_LBL = new javax.swing.JLabel();
        CidadeEstado_LBL = new javax.swing.JLabel();
        Separador_LBL = new javax.swing.JLabel();
        CNPJ_LBL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pedidos = new javax.swing.JTable();
        Separador_LBL1 = new javax.swing.JLabel();
        Valor_LBL = new javax.swing.JLabel();
        valorT_LBL = new javax.swing.JLabel();
        Separador_LBL2 = new javax.swing.JLabel();
        Separador_LBL3 = new javax.swing.JLabel();
        methodtext_LBL = new javax.swing.JLabel();
        method_LBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Fundo.setBackground(new java.awt.Color(255, 237, 201));
        Fundo.setLayout(null);

        Close_BTN.setBackground(new java.awt.Color(255, 51, 51));
        Close_BTN.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Close_BTN.setForeground(new java.awt.Color(255, 51, 0));
        Close_BTN.setText("X");
        Close_BTN.setBorderPainted(false);
        Close_BTN.setContentAreaFilled(false);
        Close_BTN.setFocusable(false);
        Close_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_BTNActionPerformed(evt);
            }
        });
        Fundo.add(Close_BTN);
        Close_BTN.setBounds(230, 0, 50, 30);

        Vendedora_LBL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Vendedora_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Vendedora_LBL.setText("Hamburgueria MK");
        Fundo.add(Vendedora_LBL);
        Vendedora_LBL.setBounds(6, 6, 268, 40);

        DocAux_LBL.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        DocAux_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DocAux_LBL.setText("Documento Auxiliar da Nota Fiscal");
        DocAux_LBL.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Fundo.add(DocAux_LBL);
        DocAux_LBL.setBounds(10, 120, 260, 16);

        Localizacao_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Localizacao_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Localizacao_LBL.setText("Rua das Goiabas, nº362 - Centro");
        Fundo.add(Localizacao_LBL);
        Localizacao_LBL.setBounds(10, 60, 260, 20);

        CidadeEstado_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        CidadeEstado_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CidadeEstado_LBL.setText("São Paulo - SP");
        Fundo.add(CidadeEstado_LBL);
        CidadeEstado_LBL.setBounds(10, 80, 260, 16);

        Separador_LBL.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        Separador_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Separador_LBL.setText("Pagamentos");
        Fundo.add(Separador_LBL);
        Separador_LBL.setBounds(10, 410, 260, 14);

        CNPJ_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        CNPJ_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CNPJ_LBL.setText("CNPJ: 28.874.176/0001-34");
        Fundo.add(CNPJ_LBL);
        CNPJ_LBL.setBounds(10, 100, 260, 14);

        Pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Preço", "QTD", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Pedidos);

        Fundo.add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 250, 190);

        Separador_LBL1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Separador_LBL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Separador_LBL1.setText("=============================");
        Fundo.add(Separador_LBL1);
        Separador_LBL1.setBounds(10, 140, 260, 14);

        Valor_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Valor_LBL.setText("Valor Total");
        Fundo.add(Valor_LBL);
        Valor_LBL.setBounds(10, 370, 140, 14);

        valorT_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        valorT_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valorT_LBL.setText("R$ 0.00");
        Fundo.add(valorT_LBL);
        valorT_LBL.setBounds(180, 370, 80, 14);

        Separador_LBL2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Separador_LBL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Separador_LBL2.setText("=============================");
        Fundo.add(Separador_LBL2);
        Separador_LBL2.setBounds(10, 350, 260, 14);

        Separador_LBL3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Separador_LBL3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Separador_LBL3.setText("=============================");
        Fundo.add(Separador_LBL3);
        Separador_LBL3.setBounds(10, 390, 260, 14);

        methodtext_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        methodtext_LBL.setText("Metodo de Pagamento");
        Fundo.add(methodtext_LBL);
        methodtext_LBL.setBounds(10, 430, 120, 14);

        method_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        method_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fundo.add(method_LBL);
        method_LBL.setBounds(140, 430, 120, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(280, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Close_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_BTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Close_BTNActionPerformed

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
            java.util.logging.Logger.getLogger(Impressao_NF_DAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Impressao_NF_DAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Impressao_NF_DAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Impressao_NF_DAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Impressao_NF_DAO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CNPJ_LBL;
    private javax.swing.JLabel CidadeEstado_LBL;
    private javax.swing.JButton Close_BTN;
    private javax.swing.JLabel DocAux_LBL;
    private javax.swing.JPanel Fundo;
    private javax.swing.JLabel Localizacao_LBL;
    public static javax.swing.JTable Pedidos;
    private javax.swing.JLabel Separador_LBL;
    private javax.swing.JLabel Separador_LBL1;
    private javax.swing.JLabel Separador_LBL2;
    private javax.swing.JLabel Separador_LBL3;
    private javax.swing.JLabel Valor_LBL;
    private javax.swing.JLabel Vendedora_LBL;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel method_LBL;
    private javax.swing.JLabel methodtext_LBL;
    public static javax.swing.JLabel valorT_LBL;
    // End of variables declaration//GEN-END:variables
}
