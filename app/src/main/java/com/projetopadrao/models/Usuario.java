package com.projetopadrao.models;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private boolean logado;


    public Usuario (){

    }
    public Usuario (String nomeUsuario,String senha){
        this.nome = nomeUsuario;
        this.senha=senha;

    }




    public void logar(){
        this.logado = true;
    }

    public void registrar(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
}
