package com.projetopadrao.models;

import com.orm.SugarRecord;

import java.util.List;

public class Usuario extends SugarRecord {
    private String nome;
    private String email;
    private String senha;
    private boolean logado;


    public Usuario (){

    }
    public Usuario (String email,String senha){
        this.email = email;
        this.senha = senha;

    }



    public void logar(){
        this.logado = true;
    }

    public void registrar(){

    }

    public void salvarUsuarioNoBanco(){
        this.save();
    }

    public void deletarUsuarioNoBonco(){
        this.delete();
    }

    public List<Usuario> listarUsuariosDoBanco(){
        List<Usuario> usuarios = Usuario.listAll(Usuario.class);
        return usuarios;
    }

    public Usuario buscarUsuarioPeloid(){
        Usuario usuario = Usuario.findById(Usuario.class, this.getId());
        return  usuario;
    }

    public void editarUsuarioBanco(){
        Usuario usuario = this.buscarUsuarioPeloid();
        usuario.save();
    }

    public void redefinirSenhaUsuarioBanco(){
        Usuario usuario = this.buscarUsuarioPeloid();
            usuario.setSenha("novaSenha1123");
            usuario.save();

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
