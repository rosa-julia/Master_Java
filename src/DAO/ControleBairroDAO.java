
package DAO;

import java.util.ArrayList;
import DTO.ControleBairroDTO;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.List;


public class ControleBairroDAO {
//Conexão    
    Connection conn;
    ArrayList<ControleBairroDTO> listabairro;
    
    public ControleBairroDAO(){
        this.listabairro = new ArrayList<>();
    }
    
    //Declarações, imports e construtor
    public void atualizarBairro(ControleBairroDTO objbairrodto){
        conn = new ControleConexaoDAO().conectarDadosDAO();
        String sql = "UPDATE bairro SET nome_bairro = ? WHERE id_bairro = ?";
        
        try (PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1,objbairrodto.getNome());
            pstm.executeUpdate();
            if (pstm != null){
                pstm.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try{
                if (conn != null);
                conn.close();
                }
            catch (SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    
    //Alterações
    public void cadastrarBairro(ControleBairroDTO objbairrodto){
        conn = new ControleConexaoDAO().conectarDadosDAO();
        String sql = "INSERT INTO bairro (nome_bairro) VALUES (?)";
        
        try (PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1,objbairrodto.getNome());
            pstm.executeUpdate();
            if (pstm != null){
                pstm.close(); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try{
                if (conn != null);
                    conn.close();
                }
        catch (SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

    }
    //Exclusões
    public void excluirBairro(ControleBairroDTO objbairrodto){
        conn = new ControleConexaoDAO().conectarDadosDAO();
        String sql = "DELETE FROM bairro WHERE id_bairro = ?";
        
        try (PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1,objbairrodto.getNome());
            pstm.executeUpdate();
            if (pstm != null){
                pstm.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try{
                if (conn != null);
                    conn.close();
                }
        catch (SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

    }
    
//Pesquisas
    public List pesquisarBairro(){
        ResultSet rs;
        conn = new ControleConexaoDAO().conectarDadosDAO();
        String sql = "SELECT * FROM bairro";
        
        try (PreparedStatement pstm = conn.prepareStatement(sql)){
            rs = pstm.executeQuery();
            
            while (rs.next()){
                ControleBairroDTO objbairrodto = new ControleBairroDTO();
                objbairrodto.setId(rs.getInt("id_bairro"));
                objbairrodto.setNome(rs.getString("nome_bairro"));
                listabairro.add(objbairrodto);
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "BairroDAO Pesquisar"+ erro.getMessage());   
            }
        return listabairro;
        }
    
     public int pesquisarBairroId(String nome) {
        ControleBairroDTO objbairrodto = new ControleBairroDTO();

        String sql = "SELECT id_bairro FROM bairro WHERE nome_bairro = ?";
        Connection conn = new ControleConexaoDAO().conectarDadosDAO();
        objbairrodto.setNome(nome);//resgatar nome do cmb na VIEW
        int idbairro = 0;

        try (PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, objbairrodto.getNome());
            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                idbairro = rs.getInt(1);
                objbairrodto.setId(idbairro);
                System.out.println("O id no rs: "+rs.getInt(1));//Teste, resultado inconsistente para nomes idênticos         

            } else {
                JOptionPane.showMessageDialog(null, "Bairro não encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "BairroDAO Pesquisar: " + erro.getMessage());        
        } finally {

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
            }
        }
        return idbairro;
    }
    
    
  
    }
    
    
    
    
    

    
    

