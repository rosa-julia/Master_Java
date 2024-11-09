/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import INTER.DadosBasicosINTER;


public class DadosBasicosDTO implements DadosBasicosINTER{
    private int id = 0;
    private int bairro = 0;
    private String nome = "";
    private String senha = "";

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getBairro() {
        return bairro;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getSenha() {
        return senha;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setBairro(int bairro) {
        this.bairro = bairro;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
