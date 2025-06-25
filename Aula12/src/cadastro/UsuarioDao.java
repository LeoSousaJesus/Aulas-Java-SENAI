package cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {
    //**************Declarando variável para fazer a conecção com o banco de dadeo*******************************//
    private static final String URL = "jdbc:mysql://localhost:3306/cadastroUsuario?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";          // seu usuário do banco
    private static final String PASSWORD = ""; // sua senha do banco    
        
    //***********Método responsável pela conecxão com o banco de dados********************************************//
    public Connection conectar() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
        return conn;
    }    
    
    //**************************Método que lista os registros do banco de dodos para preencher a tabela**************//
    public List<Usuario> listarUsuarios() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT idUsuario, nomeUsuario, emailUsuario, telefoneUsuario, tipoUsuario FROM usuario ORDER BY nomeUsuario ASC";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setIdUsuario(rs.getInt("idUsuario"));
                u.setNomeUsuario(rs.getString("nomeUsuario"));
                u.setEmailUsuario(rs.getString("emailUsuario"));
                u.setTelefoneUsuario(rs.getInt("telefoneUsuario"));
                u.setTipoUsuario(rs.getString("tipoUsuario"));
                lista.add(u);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    //***************Método que insere e salva um registro no banco de dados****************************************///
    public boolean salvarUsuario(Usuario usuario) {
    String sql = "INSERT INTO usuario (nomeUsuario, emailUsuario, telefoneUsuario, tipoUsuario) VALUES (?, ?, ?, ?)";

    try (Connection conn = conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, usuario.getNomeUsuario());
        stmt.setString(2, usuario.getEmailUsuario());
        stmt.setInt(3, usuario.getTelefoneUsuario());
        stmt.setString(4, usuario.getTipoUsuario());

        int rowsInserted = stmt.executeUpdate();
        return rowsInserted > 0;

    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
    public boolean atualizarUsuario(Usuario usuario) {
    String sql = "UPDATE usuario SET nomeUsuario = ?, emailUsuario = ?, telefoneUsuario = ?, tipoUsuario = ? WHERE idUsuario = ?";
    
    try (Connection conn = conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, usuario.getNomeUsuario());
        stmt.setString(2, usuario.getEmailUsuario());
        stmt.setInt(3, usuario.getTelefoneUsuario());
        stmt.setString(4, usuario.getTipoUsuario());
        stmt.setInt(5, usuario.getIdUsuario());

        return stmt.executeUpdate() > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
}
    

