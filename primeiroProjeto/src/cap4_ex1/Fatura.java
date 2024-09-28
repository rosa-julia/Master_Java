
package cap4_ex1;
import javax.swing.JOptionPane;


public class Fatura {
   
    public static double CalcularFatura(){
         String numFatura, nomeProduto;
         double precoProduto, totalFatura, qntProduto;
        
        nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto"); 
        precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do produto "));
        qntProduto =  Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de produtos: "));
        numFatura =  (JOptionPane.showInputDialog("Digite o numero da fatura: "));
        
        totalFatura = (precoProduto * qntProduto);
        
        Itens(nomeProduto, precoProduto, qntProduto, totalFatura, numFatura);
        
        return totalFatura;
        
    }
    
    public static void Itens(String nome, double preco,double qnt,double total,String numero){
        
          JOptionPane.showMessageDialog(null,"Nome do produto: " + nome);
          JOptionPane.showMessageDialog(null,"Preco do produto: " + preco);
          JOptionPane.showMessageDialog(null,"Quantidade do produto: " + qnt);
          JOptionPane.showMessageDialog(null,"Numero do produto: " + numero);
          JOptionPane.showMessageDialog(null,"Valor total: " + total);
         
        
    }

    
    
    
}
