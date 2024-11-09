
package controlebancario;

import DAO.ControleConexaoDAO;


public class ControleBancario {

    
    public static void main(String[] args) {
       
        ControleConexaoDAO objconexao = new ControleConexaoDAO();
        objconexao.conectarDadosDAO();
        
        
    }
    
}
