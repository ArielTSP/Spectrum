
package model;

import javax.swing.table.DefaultTableModel;
import view.Impressao_NF_DAO;

public class impressao_DAO {

    public static void gerarNF(){
        
        DefaultTableModel pedidos = (DefaultTableModel) Impressao_NF_DAO.Pedidos.getModel();
        
        if (pedido_DAO.classic != 0){ 
            pedidos.addRow(new Object[]{"01","Classic","10.50",pedido_DAO.classic,10.50*pedido_DAO.classic});
        }
        if (pedido_DAO.vegano != 0){ 
            pedidos.addRow(new Object[]{"02","Vegano","20.00",pedido_DAO.vegano,20.00*pedido_DAO.vegano});
        }
        if (pedido_DAO.cheddarcon != 0){
            pedidos.addRow(new Object[]{"05","Cheddarcon","15.50",pedido_DAO.cheddarcon,15.50*pedido_DAO.cheddarcon});
        }
        if (pedido_DAO.crook != 0){ 
            pedidos.addRow(new Object[]{"06","Crook","17.50",pedido_DAO.crook,17.50*pedido_DAO.crook});
        }
        if (pedido_DAO.doubleef != 0){
            pedidos.addRow(new Object[]{"09","Doubleef","18.50",pedido_DAO.doubleef,18.50*pedido_DAO.doubleef});
        }
        if (pedido_DAO.tower != 0){
            pedidos.addRow(new Object[]{"10","Tower","25.00",pedido_DAO.tower,25.00*pedido_DAO.tower});
        }
        if (pedido_DAO.coca_cola != 0){
            pedidos.addRow(new Object[]{"03","Coca-Cola 500ml","7.00",pedido_DAO.coca_cola,7.00*pedido_DAO.coca_cola});
        }
        if (pedido_DAO.suco_natural != 0){
            pedidos.addRow(new Object[]{"07","Suco Natural 500ml","3.50",pedido_DAO.suco_natural,3.50*pedido_DAO.suco_natural});
        }
        if (pedido_DAO.nuggets != 0){
            pedidos.addRow(new Object[]{"08","Nuggets 250mg","6.50",pedido_DAO.nuggets,6.50*pedido_DAO.nuggets});
        }
        if (pedido_DAO.batata_frita != 0){
            pedidos.addRow(new Object[]{"04","Batata-Frita 250mg","5.00",pedido_DAO.batata_frita,5.00*pedido_DAO.batata_frita});
        }
        if (pedido_DAO.onion_rings != 0){
            pedidos.addRow(new Object[]{"11","Onion Rings 250mg","7.00",pedido_DAO.onion_rings,7.00*pedido_DAO.onion_rings});
        }
        if (pedido_DAO.agua_mineral != 0){
            pedidos.addRow(new Object[]{"12","Agua Mineral","2.50",pedido_DAO.agua_mineral,2.50*pedido_DAO.agua_mineral});
        }
        
        Impressao_NF_DAO.valorT_LBL.setText("R$ " + pedido_DAO.valor_total);
        Impressao_NF_DAO.method_LBL.setText(notaFiscal_DAO.methodPay);
        
    }
    
}
