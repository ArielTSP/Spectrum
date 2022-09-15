
package model;

import javax.swing.JOptionPane;
import view.Pagamento_GUI;

public class checaFuncoes_DAO {
    
    public static boolean checarFuncaoPagamento(){
        
        // Receber Variáveis
        
        String nome = view.Pagamento_GUI.Nome_TXF.getText();
        String contato = view.Pagamento_GUI.Contact_JTF.getText();
        String cpf = view.Pagamento_GUI.CPF_TXF.getText();
        
        if (!"".equals(nome) && !"".equals(contato) && !"".equals(cpf)){
            
            // Receber Método de Pagamento
            
            if (view.Pagamento_GUI.CartaoDeCredito_RBT.isSelected()){
                
                // Receber Dados do Pagamento
                
                String crtNumero = view.Pagamento_GUI.Numero_JTF.getText();
                String crtTitular = view.Pagamento_GUI.Titular_JTF.getText();
                String crtCVV = view.Pagamento_GUI.CVV_JTF.getText();
                String crtData = view.Pagamento_GUI.D_Vencimento_JTF.getText();
                
                if (!"".equals(crtNumero) && !"".equals(crtTitular) && !"".equals(crtCVV) && !"".equals(crtData)){
                    
                    // Prosseguir com o Pedido - NF
                    
                    return true;
                    
                }else{
                    
                    JOptionPane.showMessageDialog(null, "Há campos de pagamento faltando.");
                    return false;
                }
                
            }else if (view.Pagamento_GUI.Pix_RBT.isSelected() || view.Pagamento_GUI.Dinheiro_RBT.isSelected()){
                
                // Prosseguir com o Pedido - NF
             
                return true;
                
            }else{
                
                //Nenhum Método de Pagamento foi selecionado
                JOptionPane.showMessageDialog(null, "Selecione um método de pagamento.");
                return false;
                
            }
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Há campos de dados pessoais faltando.");
            //Nenhum IF foi atendido
            return false;
            
        }
    }
    
    public static boolean checarFuncaoPedido(){
        
        if (pedido_DAO.batata_frita == 0 && pedido_DAO.cheddarcon == 0 && pedido_DAO.classic == 0 &&
                pedido_DAO.coca_cola == 0 && pedido_DAO.crook == 0 && pedido_DAO.doubleef == 0 &&
                pedido_DAO.nuggets == 0 && pedido_DAO.suco_natural == 0 && pedido_DAO.tower == 0 &&
                pedido_DAO.valor_total == 0 && pedido_DAO.vegano == 0){
            
            JOptionPane.showMessageDialog(null, "Selecione os produtos antes de finalizar o pedido.");
            return false;
            
        }else{
            
            return true;
            
        }
        
    }
    
}
