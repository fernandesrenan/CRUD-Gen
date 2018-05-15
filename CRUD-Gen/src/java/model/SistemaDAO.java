package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Artur
 */
public class SistemaDAO {

    public static boolean atualizar(Sistema sistema) {
        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt = connection.prepareStatement(SistemaSQLs.ATUALIZAR.getSql());) {
            System.out.println("SQL = " + SistemaSQLs.ATUALIZAR.getSql());
            System.out.println("Conexão aberta!");
            stmt.setString(1, sistema.getNome());
            stmt.setString(2, String.valueOf(sistema.getCodigo()));
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("exceção com recursos - remover");
        }
        return false;
    }

    public static boolean excluir(Sistema sistema) {
        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt = connection.prepareStatement(SistemaSQLs.EXCLUIR.getSql());) {
            stmt.setString(1, String.valueOf(sistema.getCodigo()));
            if (stmt.executeUpdate() >= 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("exceção com recursos - remover");
        }
        return false;
    }

    public static boolean cadastrar(Sistema sistema) {
        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt = connection.prepareStatement(SistemaSQLs.INSERIR.getSql());) {
            stmt.setString(1, sistema.getNome());
            System.out.println("Dados Gravados!");
            return stmt.execute();
        } catch (SQLException e) {
            System.out.println("exceção com recursos - cadastrar");
        }
        return false;
    }

    public static List<Sistema> getLista() {
        List<Sistema> lista = new LinkedList<>();

        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SistemaSQLs.LISTAR_TODOS.getSql());) {
            System.out.println("Conexão aberta - lista!");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String codigo = rs.getString("codigo");
                String nome = rs.getString("nome");
                lista.add(new Sistema());
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("Exceção SQL");
        } catch (Exception e) {
            System.out.println("Exceção no código!");
        }
        return null;
    }
}
