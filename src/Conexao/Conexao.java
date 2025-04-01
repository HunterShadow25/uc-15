package Conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {

    Connection conn = null;

    public Connection conectar() {

        String url = "jdbc:mysql://localhost:3306/ohara";
        String user = "root";
        String senha = "Hunter25**";

        try {

            conn = DriverManager.getConnection(url, user, senha);
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage()+  "  erro ao conectar a base de dados","aviso", 2);
            return null;
        }
        return conn;
    }

    public void desconectar(){
        try{
        conn.close();
        
        }catch(SQLException e){
            
        }
    }
}
