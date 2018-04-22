package model;

public enum UsuarioSQLs {
    INSERIR("insert into usuario(nome, login, senha) values (?, ?, ?)"), 
    LISTAR_TODOS("select * from usuario"),
    VALIDAR("select nome from usuario where login = ? AND senha = ?"),
    EXCLUIR("delete from usuario where nome=? AND login=?"),
    ATUALIZAR("update usuario set nome=?, senha=? where login=?"),
    PESQUISAR_LOGIN("select nome from usuario where login=?");
        
    private final String sql;
    UsuarioSQLs(String sql){
        this.sql = sql;
    }

    public String getSql() {
        return sql;
    }    
}

