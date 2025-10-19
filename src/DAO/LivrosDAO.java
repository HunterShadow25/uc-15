package DAO;

/**
 * classe responsavel por administrar o CRUD com os dados dos livros
 *
 * @javadoc
 */
import Beans.Livros;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LivrosDAO {

    private Conexao conexao;
    private Connection conn;

    public LivrosDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.conectar();
    }

    public void inserir(Livros livro) {
        String sql = "INSERT INTO livros (nome,genero,autor,descricao,preço) VALUES (?,?,?,?,?) ";

        try {

            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, livro.getNome());
            stmt.setString(2, livro.getGenero());
            stmt.setString(3, livro.getAutor());
            stmt.setString(4, livro.getDescricao());
            stmt.setDouble(5, livro.getPreco());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao inserir os dados");
        } finally {
            conexao.desconectar();
        }
    }

    public List<Livros> getLivros(String pesquisa, double minimo, double maximo) {
        String sql = "Select * from livros where nome LIKE ? AND preço between ? AND ? or genero LIKE ? AND preço between ? AND ? or autor LIKE ? AND preço between ? AND ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, "%" + pesquisa + "%");
            stmt.setDouble(2, minimo);
            stmt.setDouble(3, maximo);
            stmt.setString(4, "%" + pesquisa + "%");
            stmt.setDouble(5, minimo);
            stmt.setDouble(6, maximo);
            stmt.setString(7, "%" + pesquisa + "%");
            stmt.setDouble(8, minimo);
            stmt.setDouble(9, maximo);

            ResultSet rs = stmt.executeQuery();
            List<Livros> lista = new ArrayList();
            while (rs.next()) {
                Livros l = new Livros();
                l.setId(rs.getInt("id"));
                l.setNome(rs.getString("nome"));
                l.setAutor(rs.getString("autor"));
                l.setGenero(rs.getString("genero"));
                l.setDescricao(rs.getString("descricao"));
                l.setPreco(rs.getDouble("preço"));
                lista.add(l);

            }
            return lista;
        } catch (SQLException e) {

            return null;
        } finally {
            conexao.desconectar();
        }

    }

    public void excluir(int id) {

        String sql = "delete from livros where id = ?";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setInt(1, id);
            stmt.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao excluir verifique a conexao");
        }
    }

    public void editar(Livros livros) {
        String sql = "Update livros set nome = ?, genero  = ?, autor = ?,descricao = ?, preço = ? where id = ?";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, livros.getNome());
            stmt.setString(2, livros.getGenero());
            stmt.setString(3, livros.getAutor());
            stmt.setString(4, livros.getDescricao());
            stmt.setDouble(5, livros.getPreco());
            stmt.setInt(6, livros.getId());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            conexao.desconectar();
        }

    }

    public List<Livros> getLivro(String pesquisa) {
        String sql = "Select * from livros where nome = (?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, pesquisa);

            ResultSet rs = stmt.executeQuery();
            List<Livros> lista = new ArrayList();
            while (rs.next()) {
                Livros l = new Livros();
                l.setId(rs.getInt("id"));
                l.setNome(rs.getString("nome"));
                l.setPreco(rs.getDouble("preço"));
                lista.add(l);

            }
            return lista;
        } catch (SQLException e) {

            return null;
        } finally {
            conexao.desconectar();
        }

    }

}
