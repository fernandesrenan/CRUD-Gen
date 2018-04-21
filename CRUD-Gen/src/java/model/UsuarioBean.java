package model;
import java.util.*;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UsuarioBean{
    private Usuario usuarioLogado = new Usuario();
    
    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public String validar() {
        if(usuarioLogado.validar()){
           return "menu";
        }
        return "invalido";
    }
    
    public void cadastrar(){
        //faz o cadastro
    }
    
    public void limpar() {
       this.usuarioLogado = new Usuario();
    }

}
