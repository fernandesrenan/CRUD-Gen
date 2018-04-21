package model;
import java.io.Serializable;
import java.util.*;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UsuarioBean implements Serializable{
    private static final long serialVersionUID = 356240640918386194L;
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
    public void limpar() {
       this.usuarioLogado = new Usuario();
    }
    

}
