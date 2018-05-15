package model;

import java.util.List;

/**
 * @author Artur
 */
public class Sistema {

    private int codigo;
    private String nome;
    
    public Sistema(){}
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    public String getNome(){
        return this.nome;
    }
    
    public List<Usuario> listar(){
        return SistemaDAO.getLista();
    }
    public boolean cadastrar(){
        return SistemaDAO.cadastrar(this);
    }
    public boolean excluir(){
        return SistemaDAO.excluir(this);
    }
    public boolean validar(){
        return SistemaDAO.validar(this);
    }
    public boolean atualizar(){
        return SistemaDAO.atualizar(this);
    }
}
