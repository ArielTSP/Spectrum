
package model;

import view.NF_GUI;

public class notaFiscal_DAO {
    
    public static void nf_Pedido(){
        if (pedido_DAO.classic != 0){
            view.NF_GUI.Pedido_JXT.setText("Classic "+ pedido_DAO.classic +"x \n" + view.NF_GUI.Pedido_JXT.getText());
        }
        if (model.pedido_DAO.vegano != 0){
            view.NF_GUI.Pedido_JXT.setText("Vegano "+ pedido_DAO.vegano +"x \n" + view.NF_GUI.Pedido_JXT.getText());
        }
        if (model.pedido_DAO.coca_cola != 0){
            view.NF_GUI.Pedido_JXT.setText("Coca-Cola "+ pedido_DAO.coca_cola +"x \n" + view.NF_GUI.Pedido_JXT.getText());
        }
        if (model.pedido_DAO.batata_frita != 0){
            view.NF_GUI.Pedido_JXT.setText("Batata-Frita "+ pedido_DAO.batata_frita +"x \n" + view.NF_GUI.Pedido_JXT.getText());
        }
        if (model.pedido_DAO.cheddarcon != 0){
            view.NF_GUI.Pedido_JXT.setText("Cheddarcon "+ pedido_DAO.cheddarcon +"x \n" + view.NF_GUI.Pedido_JXT.getText());
        }
        if (model.pedido_DAO.crook != 0){
            view.NF_GUI.Pedido_JXT.setText("Crook "+ pedido_DAO.crook +"x \n" + view.NF_GUI.Pedido_JXT.getText());
        }
        if (model.pedido_DAO.suco_natural != 0){
            view.NF_GUI.Pedido_JXT.setText("Suco Natural "+ pedido_DAO.suco_natural +"x \n" + view.NF_GUI.Pedido_JXT.getText());
        }
        if (model.pedido_DAO.nuggets != 0){
            view.NF_GUI.Pedido_JXT.setText("Nuggets "+ pedido_DAO.nuggets +"x \n" + view.NF_GUI.Pedido_JXT.getText());
        }
        if (model.pedido_DAO.doubleef != 0){
            view.NF_GUI.Pedido_JXT.setText("Doubleef "+ pedido_DAO.doubleef +"x \n" + view.NF_GUI.Pedido_JXT.getText());
        }
        if (model.pedido_DAO.tower != 0){
            view.NF_GUI.Pedido_JXT.setText("Tower "+ pedido_DAO.tower +"x \n" + view.NF_GUI.Pedido_JXT.getText());
        }
        
        view.NF_GUI.TotalPay_JTF.setText("R$ " + pedido_DAO.valor_total);
       
        view.NF_GUI.Nome_JTF.setText(view.Pagamento_GUI.Nome_TXF.getText());
        view.NF_GUI.CPF_JTF.setText(view.Pagamento_GUI.CPF_TXF.getText());
    }
    
}
