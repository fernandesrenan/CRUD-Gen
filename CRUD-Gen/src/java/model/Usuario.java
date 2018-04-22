/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author renan
 */
public class Usuario {
    private String nome;
    private String login;
    private String senha;
    
    public Usuario(){}
    
    public Usuario(String nome, String login, String senha){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getLogin(){
        return this.login;
    }
    public String getSenha(){
        return this.senha;
    }

    public List<Usuario> listar(){
        return UsuarioDAO.getLista();
    }
    public boolean cadastrar(){
        return UsuarioDAO.cadastrar(this);
    }
    public boolean excluir(){
        return UsuarioDAO.excluir(this);
    }
    public boolean validar(){
        return UsuarioDAO.validar(this);
    }
    public boolean atualizar(){
        return UsuarioDAO.atualizar(this);
    }
}
