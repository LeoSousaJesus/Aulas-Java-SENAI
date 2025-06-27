import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

    // Constantes de conexão
    private static final String URL = "jdbc:mysql://localhost:3306/cadastroUsuario?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Método de conexão reutilizável
    private Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
            
    // Listar todos os usuários
    public List<Usuario> listarUsuarios() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT idUsuario, nomeUsuario, emailUsuario, telefoneUsuario, tipoUsuario FROM usuario ORDER BY nomeUsuario ASC";
        
        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                lista.add(extrairUsuario(rs));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // Inserir novo usuário
    public boolean salvarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario (nomeUsuario, emailUsuario, telefoneUsuario, tipoUsuario) VALUES (?, ?, ?, ?)";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            preencherStatementUsuario(stmt, usuario);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Atualizar usuário existente
    public boolean atualizarUsuario(Usuario usuario) {
        String sql = "UPDATE usuario SET nomeUsuario = ?, emailUsuario = ?, telefoneUsuario = ?, tipoUsuario = ? WHERE idUsuario = ?";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            preencherStatementUsuario(stmt, usuario);
            stmt.setInt(5, usuario.getIdUsuario());
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Excluir usuário por ID
    public boolean excluirUsuario(int idUsuario) {
        String sql = "DELETE FROM usuario WHERE idUsuario = ?";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idUsuario);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Buscar usuário por ID
    public Usuario buscarUsuarioPorId(int idUsuario) {
        String sql = "SELECT * FROM usuario WHERE idUsuario = ?";
        Usuario usuario = null;

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idUsuario);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    usuario = extrairUsuario(rs);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuario;
    }

    // Buscar usuário por e-mail (útil para evitar duplicidade no botão Salvar)
    public Usuario buscarUsuarioPorEmail(String email) {
        String sql = "SELECT * FROM usuario WHERE emailUsuario = ?";
        Usuario usuario = null;

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    usuario = extrairUsuario(rs);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuario;
    }

    // -------------------------------
    // MÉTODOS AUXILIARES
    // -------------------------------

    // Cria objeto Usuario a partir de ResultSet
    private Usuario extrairUsuario(ResultSet rs) throws SQLException {
        Usuario u = new Usuario();
        u.setIdUsuario(rs.getInt("idUsuario"));
        u.setNomeUsuario(rs.getString("nomeUsuario"));
        u.setEmailUsuario(rs.getString("emailUsuario"));
        u.setTelefoneUsuario(rs.getInt("telefoneUsuario"));
        u.setTipoUsuario(rs.getString("tipoUsuario"));
        return u;
    }

    // Preenche campos do Statement a partir de um objeto Usuario
    private void preencherStatementUsuario(PreparedStatement stmt, Usuario usuario) throws SQLException {
        stmt.setString(1, usuario.getNomeUsuario());
        stmt.setString(2, usuario.getEmailUsuario());
        stmt.setInt(3, usuario.getTelefoneUsuario());
        stmt.setString(4, usuario.getTipoUsuario());
    }
    
    
    public boolean salvarOuAtualizarUsuario(Usuario usuario) {
    Usuario existente = buscarUsuarioPorEmail(usuario.getEmailUsuario());

    if (existente != null) {
        // Atualiza o ID do usuário encontrado para reaproveitar no UPDATE
        usuario.setIdUsuario(existente.getIdUsuario());
        return atualizarUsuario(usuario);
    } else {
        return salvarUsuario(usuario);
    }
}
}