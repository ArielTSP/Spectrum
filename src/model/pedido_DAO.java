package model;

import controller.jdbc_DB;

public class pedido_DAO {
    
    //Valor Total
    
    static double valor_total = 0;
    
    // Temp BD
    
    public static int pao = 0; 
    public static int pao_vegano = 0;
    public static int carne = 0; 
    public static int carne_vegana = 0;
    public static int cheddar = 0; 
    public static int bacon = 0;
    public static int tomate = 0;
    public static int cebola = 0;
    public static int alface = 0;
    public static int colaDB = 0; 
    public static int sucoDB = 0; 
    public static int aguaDB = 0; 
    public static int batata_fritaDB = 0; 
    public static int nuggetsDB = 0;
    public static int onionDB = 0;
    
    //Hamburguers
    
    static int classic = 0;
    static int vegano = 0;
    static int cheddarcon = 0;
    static int crook = 0;
    static int doubleef = 0;
    static int tower = 0;
    
    //Acompanhamentos e Bebidas
    
    static int coca_cola = 0;
    static int suco_natural = 0;
    static int nuggets = 0;
    static int batata_frita = 0;
    static int onion_rings = 0;
    static int agua_mineral = 0;
    
    //Função de Criar Pedidos
    
    public static void recebaPedido(int id){
 
        if ( id==1 ){
            
            if (controller.jdbc_DB.pao >= 100 && controller.jdbc_DB.carne >= 100
                    && controller.jdbc_DB.cheddar >= 30){
                
                valor_total = valor_total + 10.5;
                controller.jdbc_DB.pao -= 100;
                controller.jdbc_DB.carne -= 100;
                controller.jdbc_DB.cheddar -= 30;
                
                pao += 100;
                carne += 100;
                cheddar += 30;
                
                int quantidade = Integer.valueOf(view.Pedido_GUI.Classic_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Classic_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
                classic += 1;
            }
        }
        
        if ( id==2 ){
            
            if (controller.jdbc_DB.pao_vegano >= 100 && controller.jdbc_DB.carne_vegana >= 150
                    && controller.jdbc_DB.cheddar >= 30){
                
                valor_total = valor_total + 20;
                controller.jdbc_DB.pao_vegano -= 100;
                controller.jdbc_DB.carne_vegana -= 100;
                controller.jdbc_DB.cheddar -= 30;
                
                pao_vegano += 100;
                carne_vegana += 100;
                cheddar += 30;
                
                int quantidade = Integer.valueOf(view.Pedido_GUI.Vegano_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Vegano_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
                vegano += 1;
            }
        }
        
        if ( id==3 ){
            
            if (controller.jdbc_DB.cola >= 750){
                
                valor_total = valor_total + 5;
                controller.jdbc_DB.cola -= 750;
                
                colaDB += 750;
                
                int quantidade = Integer.valueOf(view.Pedido_GUI.Cola_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Cola_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
                coca_cola += 1;
            }
        }
        
        if ( id==4 ){
            
            if (controller.jdbc_DB.batata_frita >= 250){
                
                valor_total = valor_total + 5;
                controller.jdbc_DB.batata_frita -= 750;
                
                batata_fritaDB += 750;
                
                int quantidade = Integer.valueOf(view.Pedido_GUI.Fries_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Fries_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
                batata_frita += 1;
            }
        }
        
        if ( id==5 ){
            
            if (controller.jdbc_DB.pao >= 100 && controller.jdbc_DB.carne >= 100
                    && controller.jdbc_DB.cheddar >= 30 && controller.jdbc_DB.bacon >= 60){
                
                valor_total = valor_total + 15.5;
                controller.jdbc_DB.pao -= 100;
                controller.jdbc_DB.carne -= 100;
                controller.jdbc_DB.cheddar -= 30;
                controller.jdbc_DB.bacon -= 60;
                
                pao += 100;
                carne += 100;
                cheddar += 30;
                bacon += 60;
                
                int quantidade = Integer.valueOf(view.Pedido_GUI.Cheddarcon_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Cheddarcon_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
                cheddarcon += 1;
            }
        }
        
        if ( id==6 ){
            
            if (controller.jdbc_DB.pao >= 100 && controller.jdbc_DB.carne >= 200
                    && controller.jdbc_DB.cheddar >= 60 && controller.jdbc_DB.cebola >= 75
                    && controller.jdbc_DB.tomate >= 75 && controller.jdbc_DB.alface >= 30){
                
                valor_total = valor_total + 17.5;
                controller.jdbc_DB.pao -= 100;
                controller.jdbc_DB.carne -= 200;
                controller.jdbc_DB.cheddar -= 60;
                controller.jdbc_DB.cebola -= 75;
                controller.jdbc_DB.tomate -= 75;
                controller.jdbc_DB.alface -= 30;
                
                pao += 100;
                carne += 200;
                cheddar += 60;
                cebola += 75;
                tomate += 75;
                alface += 30;
                
                int quantidade = Integer.valueOf(view.Pedido_GUI.Crook_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Crook_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
                crook += 1;
            }
        }
        
        if ( id==7 ){
            
            if (controller.jdbc_DB.suco >= 500){
                
                valor_total = valor_total + 3.5;
                controller.jdbc_DB.suco -= 500;
                
                sucoDB += 500;
                
                int quantidade = Integer.valueOf(view.Pedido_GUI.Juice_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Juice_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
                suco_natural += 1;
            }
        }
        
        if ( id==8 ){
            
            if (controller.jdbc_DB.nuggets >= 100){
                
                valor_total = valor_total + 6.5;
                controller.jdbc_DB.nuggets -= 250;
                
                nuggetsDB += 250;
                
                int quantidade = Integer.valueOf(view.Pedido_GUI.Chicken_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Chicken_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
                nuggets += 1;
            }
        }
        
        if ( id==9 ){
            
            if (controller.jdbc_DB.pao >= 100 && controller.jdbc_DB.carne >= 200
                    && controller.jdbc_DB.cheddar >= 60){
                
                valor_total = valor_total + 18.5;
                controller.jdbc_DB.pao -= 100;
                controller.jdbc_DB.carne -= 200;
                controller.jdbc_DB.cheddar -= 60;
                
                pao += 100;
                carne += 200;
                cheddar -= 60;
                
                int quantidade = Integer.valueOf(view.Pedido_GUI.Doubleef_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Doubleef_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
                doubleef += 1;
            }
        }
        
        if ( id==10 ){
            
            if (controller.jdbc_DB.pao >= 100 && controller.jdbc_DB.carne >= 200
                    && controller.jdbc_DB.cheddar >= 90 && controller.jdbc_DB.cebola >= 100
                    && controller.jdbc_DB.tomate >= 100 && controller.jdbc_DB.alface >= 30){
                
                valor_total = valor_total + 25.0;
                controller.jdbc_DB.pao -= 100;
                controller.jdbc_DB.carne -= 200;
                controller.jdbc_DB.cheddar -= 90;
                controller.jdbc_DB.cebola -= 100;
                controller.jdbc_DB.tomate -= 100;
                controller.jdbc_DB.alface -= 30;
                
                pao += 100;
                carne += 200;
                cheddar += 90;
                cebola += 100;
                tomate += 100;
                alface += 30;
                
                int quantidade = Integer.valueOf(view.Pedido_GUI.Tower_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Tower_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
                tower += 1;
            }
        }
        
        if ( id==11 ){
            
            if (controller.jdbc_DB.onion >= 250){
                
                valor_total = valor_total + 7.0;
                controller.jdbc_DB.onion -= 250;
                
                onionDB += 250;
                
                int quantidade = Integer.valueOf(view.Pedido_GUI.Onion_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Onion_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
                onion_rings += 1;
            }
        }
        
        if ( id==12 ){
            
            if (controller.jdbc_DB.agua >= 500){
                
                valor_total = valor_total + 2.5;
                controller.jdbc_DB.agua -= 500;
                
                aguaDB += 500;
                
                int quantidade = Integer.valueOf(view.Pedido_GUI.Water_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Water_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
                agua_mineral += 1;
            }
        }
    }
    
    public static void limparPedidos(){
        
        // Limpar Preço - Variáveis
        
        valor_total = 0;
        
        // Limpar Quantidades - Variáveis
        
        classic = 0;
        vegano = 0;
        cheddarcon = 0;
        crook = 0;
        doubleef = 0;
        tower = 0;
        coca_cola = 0;
        suco_natural = 0;
        nuggets = 0;
        batata_frita = 0;
        onion_rings = 0;
        agua_mineral = 0;
        
        // Re-Estoque
        
        controller.jdbc_DB.agua += aguaDB;
        controller.jdbc_DB.alface += alface;
        controller.jdbc_DB.bacon += bacon;
        controller.jdbc_DB.batata_frita += batata_fritaDB;
        controller.jdbc_DB.carne += carne;
        controller.jdbc_DB.carne_vegana += carne_vegana;
        controller.jdbc_DB.cebola += cebola;
        controller.jdbc_DB.cheddar += cheddar;
        controller.jdbc_DB.cola += colaDB;
        controller.jdbc_DB.nuggets += nuggetsDB;
        controller.jdbc_DB.onion += onionDB;
        controller.jdbc_DB.pao += pao;
        controller.jdbc_DB.pao_vegano += pao_vegano;
        controller.jdbc_DB.suco += sucoDB;
        controller.jdbc_DB.tomate += tomate;
        
        // Reiniciar Estoque Usado
        
        pao = 0; 
        pao_vegano = 0;
        carne = 0; 
        carne_vegana = 0;
        cheddar = 0; 
        bacon = 0;
        tomate = 0;
        cebola = 0;
        alface = 0;
        colaDB = 0; 
        sucoDB = 0; 
        aguaDB = 0; 
        batata_fritaDB = 0; 
        nuggetsDB = 0;
        onionDB = 0;
        
        // Limpar Preço - JTF
        
        view.Pedido_GUI.ValorTotal_JTF.setText("R$ 0.00");
        
        // Limpar Quantidades - LBL
        
        view.Pedido_GUI.Classic_QNT.setText("0");
        view.Pedido_GUI.Vegano_QNT.setText("0");
        view.Pedido_GUI.Cheddarcon_QNT.setText("0");
        view.Pedido_GUI.Crook_QNT.setText("0");
        view.Pedido_GUI.Doubleef_QNT.setText("0");
        view.Pedido_GUI.Tower_QNT.setText("0");
        view.Pedido_GUI.Cola_QNT.setText("0");
        view.Pedido_GUI.Onion_QNT.setText("0");
        view.Pedido_GUI.Fries_QNT.setText("0");
        view.Pedido_GUI.Chicken_QNT.setText("0");
        view.Pedido_GUI.Water_QNT.setText("0");
        view.Pedido_GUI.Juice_QNT.setText("0");
        
    }
    
}
