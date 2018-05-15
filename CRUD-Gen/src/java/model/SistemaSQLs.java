package model;

/**
 * @author Artur
 */

public enum SistemaSQLs {
    INSERIR("insert into sistema(nome) values (?)"), 
    LISTAR_TODOS("select * from sistema"),
    EXCLUIR("delete from sistema where codigo=?"),
    ATUALIZAR("update sistema set nome=? where codigo=?");
        
    private final String sql;
    SistemaSQLs(String sql){
        this.sql = sql;
    }

    public String getSql() {
        return sql;
    }    
    
}
