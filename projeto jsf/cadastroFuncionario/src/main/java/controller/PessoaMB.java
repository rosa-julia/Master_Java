package controller;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import model.Pessoa;

@Named("pessoaMB")
@SessionScoped

public class PessoaMB implements Serializable {

    private static final long serialVersionUID = 1L; //Identificador único para 
    //serialização

    @Inject //Injeção de dependência CDI
    private Pessoa pessoa;
    private List<Pessoa> pessoas = new ArrayList<>(); //Cria uma lista para pessoas
    private Pessoa pessoaSelecionada;

    public String adicionar() { //Método para adicionar pessoas
        pessoas.add(0, pessoa);
        limpar();
        return "listar.xhtml"; //Crie a pagina listar em webpages
    }

    public void excluir(Pessoa pessoa) { //Método para excluir pessoas
        pessoas.remove(pessoa);
    }

    public List<Pessoa> listar() {//Retorna uma lista de pessoas
        return pessoas;
    }

    public String editar(Pessoa pessoa) {//Método para editar pessoas
        this.pessoaSelecionada = pessoa;
        return "editar";// Crie a página editar em web-pages
    }

    public String atualizar() {// Atualizar a pessoa selecionada com os novos dados
        int index = pessoas.indexOf(pessoaSelecionada);
        if (index != -1) {
            pessoas.set(index, pessoaSelecionada);
        }
        limpar();
        return "listar";// Crie a página listar em web-pages
    }

    public void limpar() { // Método para limpar formulário
        pessoa = new Pessoa();
        pessoaSelecionada = null;
    }

    public String cancelar() { //Método para cancelar ação
        limpar();
        return "login.xhtml"; //Crie a página login em webpages
    }
    
    public String cancelarCadastro() {
        limpar(); // Se quiser limpar o formulário
        return "index.xhtml";
}

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Pessoa getPessoaSelecionada() {
        return pessoaSelecionada;
    }

    public void setPessoaSelecionada(Pessoa pessoaSelecionada) {
        this.pessoaSelecionada = pessoaSelecionada;
    }

    
    
    
    
    
    
}
