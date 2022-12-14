
package view;

public class Pedido_GUI extends javax.swing.JFrame {

    public Pedido_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Banner_IMG = new org.edisoncor.gui.panel.PanelImage();
        Close_BTN = new javax.swing.JButton();
        Effect_BTN = new javax.swing.JButton();
        ValorTotal_JTF = new javax.swing.JTextField();
        ValorTotal_LBL = new javax.swing.JLabel();
        limparPedido_BTN = new javax.swing.JButton();
        pagOne_PNL = new javax.swing.JPanel();
        Fries_IMG = new org.edisoncor.gui.button.ButtonIcon();
        Cola_LBL = new javax.swing.JLabel();
        Cheddarcon_QNT = new javax.swing.JLabel();
        Bebidas_LBL = new javax.swing.JLabel();
        Crook_QNT = new javax.swing.JLabel();
        Extras_LBL = new javax.swing.JLabel();
        Water_IMG = new org.edisoncor.gui.button.ButtonIcon();
        Tower_QNT = new javax.swing.JLabel();
        Doubleef_LBL = new javax.swing.JLabel();
        Juice_LBL = new javax.swing.JLabel();
        Classic_LBL = new javax.swing.JLabel();
        Vegano_LBL = new javax.swing.JLabel();
        Chicken_QNT = new javax.swing.JLabel();
        Cola_IMG = new org.edisoncor.gui.button.ButtonIcon();
        Fries_QNT = new javax.swing.JLabel();
        Cola_QNT = new javax.swing.JLabel();
        Classic_QNT = new javax.swing.JLabel();
        Doubleef_IMG = new org.edisoncor.gui.button.ButtonIcon();
        Classic_IMG = new org.edisoncor.gui.button.ButtonIcon();
        Cheddarcon_LBL = new javax.swing.JLabel();
        Fries_LBL = new javax.swing.JLabel();
        Crook_LBL = new javax.swing.JLabel();
        Vegano_IMG = new org.edisoncor.gui.button.ButtonIcon();
        Vegano_QNT = new javax.swing.JLabel();
        Crook_IMG = new org.edisoncor.gui.button.ButtonIcon();
        Onion_QNT = new javax.swing.JLabel();
        Chicken_LBL = new javax.swing.JLabel();
        Onion_IMG = new org.edisoncor.gui.button.ButtonIcon();
        Onion_LBL = new javax.swing.JLabel();
        Cheddarcon_IMG = new org.edisoncor.gui.button.ButtonIcon();
        Chicken_IMG = new org.edisoncor.gui.button.ButtonIcon();
        Lanches_LBL = new javax.swing.JLabel();
        Doubleef_QNT = new javax.swing.JLabel();
        Juice_IMG = new org.edisoncor.gui.button.ButtonIcon();
        Juice_QNT = new javax.swing.JLabel();
        Tower_LBL = new javax.swing.JLabel();
        Tower_IMG = new org.edisoncor.gui.button.ButtonIcon();
        Water_QNT = new javax.swing.JLabel();
        Water_LBL = new javax.swing.JLabel();

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
        Banner_IMG.setBounds(90, 0, 480, 110);

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
        Close_BTN.setBounds(680, 10, 50, 30);

        Effect_BTN.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Effect_BTN.setText("Efetuar Pedido");
        Effect_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Effect_BTNActionPerformed(evt);
            }
        });
        Background.add(Effect_BTN);
        Effect_BTN.setBounds(560, 380, 150, 40);

        ValorTotal_JTF.setEditable(false);
        ValorTotal_JTF.setText("R$ 0.00");
        Background.add(ValorTotal_JTF);
        ValorTotal_JTF.setBounds(560, 350, 150, 22);

        ValorTotal_LBL.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        ValorTotal_LBL.setForeground(new java.awt.Color(255, 255, 255));
        ValorTotal_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValorTotal_LBL.setText("Valor Total");
        Background.add(ValorTotal_LBL);
        ValorTotal_LBL.setBounds(560, 330, 150, 13);

        limparPedido_BTN.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        limparPedido_BTN.setText("Limpar Pedido");
        limparPedido_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparPedido_BTNActionPerformed(evt);
            }
        });
        Background.add(limparPedido_BTN);
        limparPedido_BTN.setBounds(560, 430, 150, 40);

        pagOne_PNL.setBackground(new java.awt.Color(102, 102, 102));
        pagOne_PNL.setLayout(null);

        Fries_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BatataFrita.png"))); // NOI18N
        Fries_IMG.setText("buttonIcon1");
        Fries_IMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fries_IMGActionPerformed(evt);
            }
        });
        pagOne_PNL.add(Fries_IMG);
        Fries_IMG.setBounds(390, 60, 70, 60);

        Cola_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Cola_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Cola_LBL.setText("Coca-Cola 750ml R$ 5.00");
        pagOne_PNL.add(Cola_LBL);
        Cola_LBL.setBounds(250, 40, 130, 13);

        Cheddarcon_QNT.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Cheddarcon_QNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cheddarcon_QNT.setText("0");
        pagOne_PNL.add(Cheddarcon_QNT);
        Cheddarcon_QNT.setBounds(20, 230, 70, 30);

        Bebidas_LBL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Bebidas_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Bebidas_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bebidas_LBL.setText("Bebidas");
        pagOne_PNL.add(Bebidas_LBL);
        Bebidas_LBL.setBounds(240, 10, 90, 22);

        Crook_QNT.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Crook_QNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Crook_QNT.setText("0");
        pagOne_PNL.add(Crook_QNT);
        Crook_QNT.setBounds(140, 230, 70, 30);

        Extras_LBL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Extras_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Extras_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Extras_LBL.setText("Extras");
        pagOne_PNL.add(Extras_LBL);
        Extras_LBL.setBounds(380, 10, 90, 22);

        Water_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agua.png"))); // NOI18N
        Water_IMG.setText("buttonIcon1");
        Water_IMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Water_IMGActionPerformed(evt);
            }
        });
        pagOne_PNL.add(Water_IMG);
        Water_IMG.setBounds(250, 280, 70, 60);

        Tower_QNT.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Tower_QNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tower_QNT.setText("0");
        pagOne_PNL.add(Tower_QNT);
        Tower_QNT.setBounds(140, 340, 70, 30);

        Doubleef_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Doubleef_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Doubleef_LBL.setText("Doubleef R$ 18.50");
        pagOne_PNL.add(Doubleef_LBL);
        Doubleef_LBL.setBounds(20, 260, 100, 13);

        Juice_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Juice_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Juice_LBL.setText("Suco Natural 500ml R$ 3.50");
        pagOne_PNL.add(Juice_LBL);
        Juice_LBL.setBounds(250, 150, 140, 13);

        Classic_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Classic_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Classic_LBL.setText("Classic R$ 10.50");
        pagOne_PNL.add(Classic_LBL);
        Classic_LBL.setBounds(20, 40, 100, 13);

        Vegano_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Vegano_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Vegano_LBL.setText("Vegano R$ 20.00");
        pagOne_PNL.add(Vegano_LBL);
        Vegano_LBL.setBounds(140, 40, 90, 13);

        Chicken_QNT.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Chicken_QNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Chicken_QNT.setText("0");
        pagOne_PNL.add(Chicken_QNT);
        Chicken_QNT.setBounds(390, 230, 70, 30);

        Cola_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CocaCola.png"))); // NOI18N
        Cola_IMG.setText("buttonIcon1");
        Cola_IMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cola_IMGActionPerformed(evt);
            }
        });
        pagOne_PNL.add(Cola_IMG);
        Cola_IMG.setBounds(250, 60, 70, 60);

        Fries_QNT.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Fries_QNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fries_QNT.setText("0");
        pagOne_PNL.add(Fries_QNT);
        Fries_QNT.setBounds(390, 120, 70, 30);

        Cola_QNT.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Cola_QNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cola_QNT.setText("0");
        pagOne_PNL.add(Cola_QNT);
        Cola_QNT.setBounds(250, 120, 70, 30);

        Classic_QNT.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Classic_QNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Classic_QNT.setText("0");
        pagOne_PNL.add(Classic_QNT);
        Classic_QNT.setBounds(20, 120, 70, 30);

        Doubleef_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Duas Carnes.png"))); // NOI18N
        Doubleef_IMG.setText("buttonIcon1");
        Doubleef_IMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Doubleef_IMGActionPerformed(evt);
            }
        });
        pagOne_PNL.add(Doubleef_IMG);
        Doubleef_IMG.setBounds(20, 280, 70, 60);

        Classic_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Classico.png"))); // NOI18N
        Classic_IMG.setText("buttonIcon1");
        Classic_IMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Classic_IMGActionPerformed(evt);
            }
        });
        pagOne_PNL.add(Classic_IMG);
        Classic_IMG.setBounds(20, 60, 70, 60);

        Cheddarcon_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Cheddarcon_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Cheddarcon_LBL.setText("Cheddarcon R$ 15.50");
        pagOne_PNL.add(Cheddarcon_LBL);
        Cheddarcon_LBL.setBounds(20, 150, 110, 13);

        Fries_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Fries_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Fries_LBL.setText("Batata-Frita 250g R$ 5.00");
        pagOne_PNL.add(Fries_LBL);
        Fries_LBL.setBounds(390, 40, 140, 13);

        Crook_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Crook_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Crook_LBL.setText("Crook R$ 17.50");
        pagOne_PNL.add(Crook_LBL);
        Crook_LBL.setBounds(140, 150, 100, 13);

        Vegano_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Vegano.png"))); // NOI18N
        Vegano_IMG.setText("buttonIcon1");
        Vegano_IMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vegano_IMGActionPerformed(evt);
            }
        });
        pagOne_PNL.add(Vegano_IMG);
        Vegano_IMG.setBounds(140, 60, 70, 60);

        Vegano_QNT.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Vegano_QNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Vegano_QNT.setText("0");
        pagOne_PNL.add(Vegano_QNT);
        Vegano_QNT.setBounds(140, 120, 70, 30);

        Crook_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Recheado.png"))); // NOI18N
        Crook_IMG.setText("buttonIcon1");
        Crook_IMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crook_IMGActionPerformed(evt);
            }
        });
        pagOne_PNL.add(Crook_IMG);
        Crook_IMG.setBounds(140, 170, 70, 60);

        Onion_QNT.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Onion_QNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Onion_QNT.setText("0");
        pagOne_PNL.add(Onion_QNT);
        Onion_QNT.setBounds(390, 340, 70, 30);

        Chicken_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Chicken_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Chicken_LBL.setText("Nuggets 250g R$ 6.50");
        pagOne_PNL.add(Chicken_LBL);
        Chicken_LBL.setBounds(390, 150, 130, 13);

        Onion_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/OnionRIngs.png"))); // NOI18N
        Onion_IMG.setText("buttonIcon1");
        Onion_IMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Onion_IMGActionPerformed(evt);
            }
        });
        pagOne_PNL.add(Onion_IMG);
        Onion_IMG.setBounds(390, 280, 70, 60);

        Onion_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Onion_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Onion_LBL.setText("Onion Rings 250g R$7.00 ");
        pagOne_PNL.add(Onion_LBL);
        Onion_LBL.setBounds(390, 260, 130, 13);

        Cheddarcon_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Bacon c Cheddar.png"))); // NOI18N
        Cheddarcon_IMG.setText("buttonIcon1");
        Cheddarcon_IMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cheddarcon_IMGActionPerformed(evt);
            }
        });
        pagOne_PNL.add(Cheddarcon_IMG);
        Cheddarcon_IMG.setBounds(20, 170, 70, 60);

        Chicken_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Nuggets.png"))); // NOI18N
        Chicken_IMG.setText("buttonIcon1");
        Chicken_IMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chicken_IMGActionPerformed(evt);
            }
        });
        pagOne_PNL.add(Chicken_IMG);
        Chicken_IMG.setBounds(390, 170, 70, 60);

        Lanches_LBL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Lanches_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Lanches_LBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lanches_LBL.setText("Lanches");
        pagOne_PNL.add(Lanches_LBL);
        Lanches_LBL.setBounds(20, 10, 190, 22);

        Doubleef_QNT.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Doubleef_QNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Doubleef_QNT.setText("0");
        pagOne_PNL.add(Doubleef_QNT);
        Doubleef_QNT.setBounds(20, 340, 70, 30);

        Juice_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Suco.png"))); // NOI18N
        Juice_IMG.setText("buttonIcon1");
        Juice_IMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Juice_IMGActionPerformed(evt);
            }
        });
        pagOne_PNL.add(Juice_IMG);
        Juice_IMG.setBounds(250, 170, 70, 60);

        Juice_QNT.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Juice_QNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Juice_QNT.setText("0");
        pagOne_PNL.add(Juice_QNT);
        Juice_QNT.setBounds(250, 230, 70, 30);

        Tower_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Tower_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Tower_LBL.setText("Tower R$ 25.00");
        pagOne_PNL.add(Tower_LBL);
        Tower_LBL.setBounds(140, 260, 90, 13);

        Tower_IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Tower.png"))); // NOI18N
        Tower_IMG.setText("buttonIcon1");
        Tower_IMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tower_IMGActionPerformed(evt);
            }
        });
        pagOne_PNL.add(Tower_IMG);
        Tower_IMG.setBounds(140, 280, 70, 60);

        Water_QNT.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Water_QNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Water_QNT.setText("0");
        pagOne_PNL.add(Water_QNT);
        Water_QNT.setBounds(250, 340, 70, 30);

        Water_LBL.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Water_LBL.setForeground(new java.awt.Color(255, 255, 255));
        Water_LBL.setText("??gua Mineral R$2.50");
        pagOne_PNL.add(Water_LBL);
        Water_LBL.setBounds(240, 260, 100, 13);

        Background.add(pagOne_PNL);
        pagOne_PNL.setBounds(10, 110, 540, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(727, 505));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Close_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_BTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Close_BTNActionPerformed

    private void Effect_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Effect_BTNActionPerformed
        boolean verificacao = model.checaFuncoes_DAO.checarFuncaoPedido();
        
        if (verificacao == true){
            new Pagamento_GUI().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_Effect_BTNActionPerformed

    private void Classic_IMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Classic_IMGActionPerformed
        model.pedido_DAO.recebaPedido(1);
    }//GEN-LAST:event_Classic_IMGActionPerformed

    private void Vegano_IMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vegano_IMGActionPerformed
        model.pedido_DAO.recebaPedido(2);
    }//GEN-LAST:event_Vegano_IMGActionPerformed

    private void Cola_IMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cola_IMGActionPerformed
        model.pedido_DAO.recebaPedido(3);
    }//GEN-LAST:event_Cola_IMGActionPerformed

    private void Fries_IMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fries_IMGActionPerformed
        model.pedido_DAO.recebaPedido(4);
    }//GEN-LAST:event_Fries_IMGActionPerformed

    private void Cheddarcon_IMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cheddarcon_IMGActionPerformed
        model.pedido_DAO.recebaPedido(5);
    }//GEN-LAST:event_Cheddarcon_IMGActionPerformed

    private void Crook_IMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crook_IMGActionPerformed
        model.pedido_DAO.recebaPedido(6);
    }//GEN-LAST:event_Crook_IMGActionPerformed

    private void Water_IMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Water_IMGActionPerformed
        model.pedido_DAO.recebaPedido(12);
    }//GEN-LAST:event_Water_IMGActionPerformed

    private void Chicken_IMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chicken_IMGActionPerformed
        model.pedido_DAO.recebaPedido(8);
    }//GEN-LAST:event_Chicken_IMGActionPerformed

    private void Doubleef_IMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Doubleef_IMGActionPerformed
        model.pedido_DAO.recebaPedido(9);
    }//GEN-LAST:event_Doubleef_IMGActionPerformed

    private void Onion_IMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Onion_IMGActionPerformed
        model.pedido_DAO.recebaPedido(11);
    }//GEN-LAST:event_Onion_IMGActionPerformed

    private void limparPedido_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparPedido_BTNActionPerformed
        model.pedido_DAO.limparPedidos();
    }//GEN-LAST:event_limparPedido_BTNActionPerformed

    private void Juice_IMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Juice_IMGActionPerformed
        model.pedido_DAO.recebaPedido(7);
    }//GEN-LAST:event_Juice_IMGActionPerformed

    private void Tower_IMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tower_IMGActionPerformed
        model.pedido_DAO.recebaPedido(10);
    }//GEN-LAST:event_Tower_IMGActionPerformed

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
            java.util.logging.Logger.getLogger(Pedido_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedido_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedido_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedido_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedido_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private org.edisoncor.gui.panel.PanelImage Banner_IMG;
    private javax.swing.JLabel Bebidas_LBL;
    private org.edisoncor.gui.button.ButtonIcon Cheddarcon_IMG;
    private javax.swing.JLabel Cheddarcon_LBL;
    public static javax.swing.JLabel Cheddarcon_QNT;
    private org.edisoncor.gui.button.ButtonIcon Chicken_IMG;
    private javax.swing.JLabel Chicken_LBL;
    public static javax.swing.JLabel Chicken_QNT;
    private org.edisoncor.gui.button.ButtonIcon Classic_IMG;
    private javax.swing.JLabel Classic_LBL;
    public static javax.swing.JLabel Classic_QNT;
    private javax.swing.JButton Close_BTN;
    private org.edisoncor.gui.button.ButtonIcon Cola_IMG;
    private javax.swing.JLabel Cola_LBL;
    public static javax.swing.JLabel Cola_QNT;
    private org.edisoncor.gui.button.ButtonIcon Crook_IMG;
    private javax.swing.JLabel Crook_LBL;
    public static javax.swing.JLabel Crook_QNT;
    private org.edisoncor.gui.button.ButtonIcon Doubleef_IMG;
    private javax.swing.JLabel Doubleef_LBL;
    public static javax.swing.JLabel Doubleef_QNT;
    public static javax.swing.JButton Effect_BTN;
    private javax.swing.JLabel Extras_LBL;
    private org.edisoncor.gui.button.ButtonIcon Fries_IMG;
    private javax.swing.JLabel Fries_LBL;
    public static javax.swing.JLabel Fries_QNT;
    private org.edisoncor.gui.button.ButtonIcon Juice_IMG;
    private javax.swing.JLabel Juice_LBL;
    public static javax.swing.JLabel Juice_QNT;
    private javax.swing.JLabel Lanches_LBL;
    private org.edisoncor.gui.button.ButtonIcon Onion_IMG;
    private javax.swing.JLabel Onion_LBL;
    public static javax.swing.JLabel Onion_QNT;
    private org.edisoncor.gui.button.ButtonIcon Tower_IMG;
    private javax.swing.JLabel Tower_LBL;
    public static javax.swing.JLabel Tower_QNT;
    public static javax.swing.JTextField ValorTotal_JTF;
    private javax.swing.JLabel ValorTotal_LBL;
    private org.edisoncor.gui.button.ButtonIcon Vegano_IMG;
    private javax.swing.JLabel Vegano_LBL;
    public static javax.swing.JLabel Vegano_QNT;
    private org.edisoncor.gui.button.ButtonIcon Water_IMG;
    private javax.swing.JLabel Water_LBL;
    public static javax.swing.JLabel Water_QNT;
    public static javax.swing.JButton limparPedido_BTN;
    private javax.swing.JPanel pagOne_PNL;
    // End of variables declaration//GEN-END:variables
}
