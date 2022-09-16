
package model;

import javax.swing.table.DefaultTableModel;
import view.Impressao_NF_DAO;

public class impressao_DAO {
    
    public static void gerarNF(){
        
        DefaultTableModel pedidos = (DefaultTableModel) Impressao_NF_DAO.Pedidos.getModel();
        pedidos.addRow(new Object[]{"1","1","1","1","1"});
        
    }
    
}
