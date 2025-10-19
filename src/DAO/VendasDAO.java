package DAO;

/**
 * classe responsavel por administrar o CRUD com os dados das vendas
 *
 * @javadoc
 */
import Beans.Vendas;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

public class VendasDAO {

    Conexao conexao;
    Connection conn;

    public VendasDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.conectar();

    }

    public void inserir(Vendas venda) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String sql = "INSERT INTO vendas (livro,quantidade,cliente,pagamento,total,data) VALUES (?,?,?,?,?,?) ";

        try {

            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, venda.getDescricao());
            stmt.setInt(2, venda.getQuantidade());
            stmt.setString(3, venda.getCliente());
            stmt.setString(4, venda.getPagamento());
            stmt.setDouble(5, venda.getTotal());
            stmt.setString(6, sdf.format(venda.getData()));
            stmt.execute();
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao inserir os dados");
        }finally{
            conexao.desconectar();
        }
    }

    public void excluir(int id) {

        String sql = "delete from vendas where id = ?";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setInt(1, id);
            stmt.execute();

        } catch (SQLException e) {

        }finally{
            conexao.desconectar();
        }
    }

    public void editar(Vendas venda) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String sql = "Update vendas set livro = ?,quantidade = ?,cliente = ? ,pagamento = ? ,total = ? ,data = ? WHERE id = ? ";

        try {

            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, venda.getDescricao());
            stmt.setInt(2, venda.getQuantidade());
            stmt.setString(3, venda.getCliente());
            stmt.setString(4, venda.getPagamento());
            stmt.setDouble(5, venda.getTotal());
            stmt.setString(6, sdf.format(venda.getData()));
            stmt.setInt(7, venda.getId());
            stmt.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao inserir os dados");
        }finally{
            conexao.desconectar();
        }
    }

    public List<Vendas> getVendas(String pesquisa) {
        String sql = "Select * from Vendas where livro like ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, "%" + pesquisa + "%");

            ResultSet rs = stmt.executeQuery();
            List<Vendas> lista = new ArrayList();
            while (rs.next()) {
                Vendas v = new Vendas();
                v.setId(rs.getInt("id"));
                v.setDescricao(rs.getString("livro"));
                v.setQuantidade(rs.getInt("quantidade"));
                v.setCliente(rs.getString("cliente"));
                v.setPagamento(rs.getString("pagamento"));
                v.setTotal(rs.getDouble("total"));
                v.setData(rs.getDate("data"));

                lista.add(v);

            }
            return lista;
        } catch (SQLException e) {
        
            return null;
        }finally{
            conexao.desconectar();
        }

    }

}
