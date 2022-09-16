
package view;

public class Impressao_NF_DAO extends javax.swing.JFrame {

    public Impressao_NF_DAO() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Vendedora_LBL = new javax.swing.JLabel();
        DocAux_LBL = new javax.swing.JLabel();
        Localizacao_LBL = new javax.swing.JLabel();
        CidadeEstado_LBL = new javax.swing.JLabel();
        Separador_LBL = new javax.swing.JLabel();
        CNPJ_LBL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pedidos = new javax.swing.JTable();
        Separador_LBL1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 237, 201));
        jPanel1.setLayout(null);

        Vendedora_LBL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Vendedora_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Vendedora_LBL.setText("Hamburgueria MK");
        jPanel1.add(Vendedora_LBL);
        Vendedora_LBL.setBounds(6, 6, 268, 40);

        DocAux_LBL.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        DocAux_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DocAux_LBL.setText("Documento Auxiliar da Nota Fiscal");
        DocAux_LBL.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(DocAux_LBL);
        DocAux_LBL.setBounds(10, 120, 260, 16);

        Localizacao_LBL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Localizacao_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Localizacao_LBL.setText("Rua das Goiabas, nº362 - Centro");
        jPanel1.add(Localizacao_LBL);
        Localizacao_LBL.setBounds(10, 60, 260, 20);

        CidadeEstado_LBL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CidadeEstado_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CidadeEstado_LBL.setText("São Paulo - SP");
        jPanel1.add(CidadeEstado_LBL);
        CidadeEstado_LBL.setBounds(10, 80, 260, 16);

        Separador_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Separador_LBL.setText("=============================");
        jPanel1.add(Separador_LBL);
        Separador_LBL.setBounds(10, 270, 260, 16);

        CNPJ_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CNPJ_LBL.setText("CNPJ: 28.874.176/0001-34");
        jPanel1.add(CNPJ_LBL);
        CNPJ_LBL.setBounds(10, 100, 260, 16);

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

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 250, 110);

        Separador_LBL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Separador_LBL1.setText("=============================");
        jPanel1.add(Separador_LBL1);
        Separador_LBL1.setBounds(10, 140, 260, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(296, 428));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel DocAux_LBL;
    private javax.swing.JLabel Localizacao_LBL;
    public static javax.swing.JTable Pedidos;
    private javax.swing.JLabel Separador_LBL;
    private javax.swing.JLabel Separador_LBL1;
    private javax.swing.JLabel Vendedora_LBL;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
