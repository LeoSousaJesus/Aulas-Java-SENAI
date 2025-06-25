package cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class usuarioDao {

    private static final String URL = "jdbc:mysql://localhost:3306/cadastroUsuario?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);

    }
    
    public void inserirUsuario(Usuario usuario) {
    String sql = "INSERT INTO usuario (nomeUsuario, emailUsuario, telefoneUsuario, tipoUsuario) VALUES (?, ?, ?, ?)";
    Connection conn = null;
    PreparedStatement stmt = null;

    try {
        conn = getConnection();
        stmt = conn.prepareStatement(sql);

        stmt.setString(1, usuario.getNomeUsuario());
        stmt.setString(2, usuario.getEmailUsuario());
        stmt.setInt(3, usuario.getTelefoneUsuario());
        stmt.setString(4, usuario.getTipoUsuario());

        stmt.executeUpdate();

        System.out.println("Usuário inserido com sucesso!");
    } catch (SQLException e) {
        e.printStackTrace();  // Exibe o erro completo no console
    } finally {
        try {
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
}
    

