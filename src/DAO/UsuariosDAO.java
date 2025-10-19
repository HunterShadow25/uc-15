package DAO;

/**
 * classe responsavel por administrar o CRUD com os dados dos usuarios
 *
 * @javadoc
 */
import Beans.Usuarios;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class UsuariosDAO {

    Conexao conexao;
    Connection conn;

    public UsuariosDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.conectar();

    }

    public void inserir(Usuarios user) {
        String sql = "INSERT INTO usuarios (nome,nivel,senha) VALUES (?,?,?) ";

        try {

            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getNivel());
            stmt.setString(3, user.getSenha());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "  erro ao inserir os dados");
        }
    }

    public void excluir(int id) {

        String sql = "delete from usuarios where id = ?";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setInt(1, id);
            stmt.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao excluir verifique a conexao");
        } finally {
            conexao.desconectar();
        }
    }

    public void editar(Usuarios user) {
        String sql = "Update usuarios set nome = ?, nivel = ? where id = ?";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getNivel());
            stmt.setInt(3, user.getId());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            conexao.desconectar();
        }

    }

    public List<Usuarios> getUsuarios(String pesquisa) {
        String sql = "Select * from Usuarios where nome LIKE ? or nivel LIKE ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, "%" + pesquisa + "%");
            stmt.setString(2, "%" + pesquisa + "%");

            ResultSet rs = stmt.executeQuery();
            List<Usuarios> lista = new ArrayList();
            while (rs.next()) {
                Usuarios user = new Usuarios();
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setNivel(rs.getString("nivel"));
                lista.add(user);

            }
            return lista;
        } catch (SQLException e) {
            return null;
        } finally {
            conexao.desconectar();
        }
    }

    public List<Usuarios> teste(Usuarios use) {
        String sql = "Select * FROM Usuarios where nome = ? AND senha = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, use.getNome());
            stmt.setString(2, use.getSenha());
            ResultSet rs = stmt.executeQuery();
            List<Usuarios> lista = new ArrayList();
            while (rs.next()) {
                Usuarios user = new Usuarios();
                user.setNome(rs.getString("nome"));
                user.setNivel(rs.getString("nivel"));
                lista.add(user);
            }
            return lista;
        } catch (Exception e) {
            return null;
        } finally {
            conexao.desconectar();
        }
    }
}
