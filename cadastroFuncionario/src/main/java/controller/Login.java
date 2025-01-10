
package controller;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.Serializable;

@Named("login")
@SessionScoped

public class Login implements Serializable {
    PessoaMB pessoa = new PessoaMB();
    
    private String nome = "admin";
    private String senha= "123";
    
    //Aqui construímos o método para verificação das credenciais
    public String validarLogin() {
        if (nome.equals("admin") && senha.equals("123")) {
        return "index.xhtml"; //Redirecionar para a principal
    } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
             (FacesMessage.SEVERITY_ERROR, "Erro ao fazer Login!", "Nome de usuário ou senha inválidos!"));     
                return null;    
        }
    }
    public String cancelarCadastro(){
        pessoa.limpar();
        return "login";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
