package controller;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioBean{
    private Usuario usuario = new Usuario();
    private Usuario usuarioLogado = new Usuario();
    private List<Usuario> lista;
    
    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public List<Usuario> getLista() {
        if(lista == null){
            return usuario.listar();
        }
        return lista;
    }
    public String atualizar(Usuario usuario){
        usuario.atualizar();
        return "listar";
    }
    public String validar() {
        if(usuario.validar()){
           this.usuarioLogado = usuario;
           this.usuario = new Usuario();
           return "menu";
        }
        return "invalido";
    }
    
    public String cadastrar(){
        usuario.cadastrar();
        return "listar";
    }
    
    public String excluir(Usuario usuario){
        usuario.excluir();
        return "listar";
    }
     public String editar(Usuario usuario){
        this.usuario = usuario;
        return "editar";
    }
}
