package model;

public class pedido_DAO {
    
    static double valor_total = 0;
    
    public static void recebaPedido(int id){
 
        if ( id==1 ){
            
            if (controller.jdbc_DB.pao >= 100 && controller.jdbc_DB.carne >= 100
                    && controller.jdbc_DB.cheddar >= 30){
                
                valor_total = valor_total + 10.5;
                controller.jdbc_DB.pao -= 100;
                controller.jdbc_DB.carne -= 100;
                controller.jdbc_DB.cheddar -= 30;
                int quantidade = Integer.valueOf(view.Pedido_GUI.Classic_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Classic_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
            }
        }
        
        if ( id==2 ){
            
            if (controller.jdbc_DB.pao_vegano >= 100 && controller.jdbc_DB.carne_vegana >= 150
                    && controller.jdbc_DB.cheddar >= 30){
                
                valor_total = valor_total + 20;
                controller.jdbc_DB.pao_vegano -= 100;
                controller.jdbc_DB.carne_vegana -= 100;
                controller.jdbc_DB.cheddar -= 30;
                int quantidade = Integer.valueOf(view.Pedido_GUI.Vegano_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Vegano_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
            }
        }
        
        if ( id==3 ){
            
            if (controller.jdbc_DB.cola >= 750){
                
                valor_total = valor_total + 5;
                controller.jdbc_DB.cola -= 750;
                int quantidade = Integer.valueOf(view.Pedido_GUI.Cola_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Cola_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
            }
        }
        
        if ( id==4 ){
            
            if (controller.jdbc_DB.batata_frita >= 250){
                
                valor_total = valor_total + 5;
                controller.jdbc_DB.batata_frita -= 750;
                int quantidade = Integer.valueOf(view.Pedido_GUI.Fries_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Fries_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
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
                int quantidade = Integer.valueOf(view.Pedido_GUI.Cheddarcon_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Cheddarcon_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
            }
        }
        
        if ( id==6 ){
            
            if (controller.jdbc_DB.pao >= 100 && controller.jdbc_DB.carne >= 200
                    && controller.jdbc_DB.cheddar >= 60 && controller.jdbc_DB.cebola >= 75
                    && controller.jdbc_DB.tomate >= 75 && controller.jdbc_DB.alface >= 30){
                
                valor_total = valor_total + 17.3;
                controller.jdbc_DB.pao -= 100;
                controller.jdbc_DB.carne -= 200;
                controller.jdbc_DB.cheddar -= 60;
                controller.jdbc_DB.cebola -= 75;
                controller.jdbc_DB.tomate -= 75;
                controller.jdbc_DB.alface -= 30;
                
                int quantidade = Integer.valueOf(view.Pedido_GUI.Crook_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Crook_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
            }
        }
        
        if ( id==7 ){
            
            if (controller.jdbc_DB.suco >= 500){
                
                valor_total = valor_total + 3.5;
                controller.jdbc_DB.suco -= 500;
                
                int quantidade = Integer.valueOf(view.Pedido_GUI.Juice_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Juice_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
            }
        }
        
        if ( id==8 ){
            
            if (controller.jdbc_DB.nuggets >= 100){
                
                valor_total = valor_total + 6.5;
                controller.jdbc_DB.nuggets -= 250;
                
                int quantidade = Integer.valueOf(view.Pedido_GUI.Chicken_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Chicken_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
            }
        }
        
        if ( id==9 ){
            
            if (controller.jdbc_DB.pao >= 100 && controller.jdbc_DB.carne >= 200
                    && controller.jdbc_DB.cheddar >= 60){
                
                valor_total = valor_total + 18.5;
                controller.jdbc_DB.pao -= 100;
                controller.jdbc_DB.carne -= 200;
                controller.jdbc_DB.cheddar -= 60;
                
                int quantidade = Integer.valueOf(view.Pedido_GUI.Doubleef_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Doubleef_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
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
                
                int quantidade = Integer.valueOf(view.Pedido_GUI.Tower_QNT.getText());
                quantidade += 1;
                view.Pedido_GUI.Tower_QNT.setText(String.valueOf(quantidade));
                
                view.Pedido_GUI.ValorTotal_JTF.setText("R$ "+ valor_total);
            }
        }
    }
    
}
