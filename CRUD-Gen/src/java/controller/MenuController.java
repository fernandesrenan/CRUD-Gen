package controller;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class MenuController {
    
    private String page = "welcome.xhtml";

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
    
    public void doViewWelcome(){
        this.page = "welcome.xhtml";
    }
    
    public void doViewListarUsuarios(){
        this.page = "listar.xhtml";
    }
}