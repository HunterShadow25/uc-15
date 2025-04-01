package DAO;

import Beans.Clientes;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClientesDAO {

    private Conexao conexao;
    private Connection conn;

    public ClientesDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.conectar();
    }

    public void inserir(Clientes cliente) {
        String sql = "INSERT INTO clientes (nome,email,cpf) VALUES (?,?,?) ";

        try {

            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getCpf());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "  erro ao inserir os dados");
        }
    }

    public List<Clientes> getClientes(String pesquisa) {
        String sql = "Select * from clientes where nome LIKE ? or email LIKE ? or cpf Like ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, "%" + pesquisa + "%");
            stmt.setString(2, "%" + pesquisa + "%");
            stmt.setString(3, "%" + pesquisa + "%");

            ResultSet rs = stmt.executeQuery();
            List<Clientes> lista = new ArrayList();
            while (rs.next()) {
                Clientes c = new Clientes();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setCpf(rs.getString("cpf"));
                lista.add(c);

            }
            return lista;
        } catch (SQLException e) {
            return null;
        }

    }

    public void excluir(int id) {

        String sql = "delete from clientes where id = ?";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setInt(1, id);
            stmt.execute();

        } catch (SQLException e) {

        }

    }

    public void editar(Clientes cliente) {
        String sql = "Update clientes set nome = ?, email = ?, cpf = ? where id = ?";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEmail());
            stmt.setInt(4, cliente.getId());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

}
