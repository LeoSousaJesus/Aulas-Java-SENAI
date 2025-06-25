package cadastro;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

    private Connection connection;

    public UsuarioDao() {
        this.connection = new ConnectionFactory().connectaDB();
    }

    public void criarUsuario(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuarios (nome, email, telefone, tipo_usuario) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getEmail());
            pstm.setString(3, usuario.getTelefone());
            pstm.setString(4, usuario.getTipo_usuario());
            pstm.executeUpdate();
        }
    }   //**************************Método que lista os registros do banco de dodos para preencher a tabela**************//

    public List<Usuario> listarUsuarios() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT id, nome, email, telefone, tipo_usuario FROM usuarios ORDER BY nome ASC";

        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Usuario u = new Usuario
                u.setId(rs.getInt("id"));
                u.setNome(rs.getString("nome"));
                u.setEmail(rs.getString("email"));
                u.setTelefone(rs.getString("telefone"));
                u.setTipo_usuario(rs.getString("tipo_usuario"));
                lista.add(u);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    //***************Método que insere e salva um registro no banco de dados****************************************///
    public boolean salvarUsuario(Usuario usuarios) {
        String sql = "INSERT INTO usuario (nome, email, telefone, tipo_usuario) VALUES (?, ?, ?, ?)";

        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuarios.getNome());
            stmt.setString(2, usuarios.getEmail());
            stmt.setString(3, usuarios.getTelefone());
            stmt.setString(4, usuarios.getTipo_usuario());

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizarUsuario(Usuario usuario) {
        String sql = "UPDATE usuario SET nomeUsuario = ?, emailUsuario = ?, telefoneUsuario = ?, tipoUsuario = ? WHERE idUsuario = ?";

        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getTelefone());
            stmt.setString(4, usuario.getTipo_usuario());
            stmt.setInt(5, usuario.getId());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
