package aula07;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UsuarioDao {

    private Connection connection;
    private Object Conexao;
    private Usuario usuario;

    public UsuarioDao() {
        this.connection = new ConnectionsFactory().conectaDB();
    }

    public void criaUsuario(Usuario usuario) throws SQLException {

        String sql = "INSERT INTO usuario(nome,email,telefone,tipoUsuario)"
                + "VALUES(?,?,?,?)";

        PreparedStatement pstm = null;

        try {
            pstm = connection.prepareStatement(sql);

            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getEmail());
            pstm.setString(3, usuario.getTelefone());
            pstm.setString(4, usuario.getTipoUsuario());

            pstm.executeUpdate();

            System.out.println("Usuário cadastrado com sucesso!");

        } catch (Exception e) {

            System.out.println("Erro no cadastro de usuário!");
        } finally {
            if (pstm != null) {
                pstm.close();
            }
        }

    }

    public List<Usuario> listarUsuarios() throws SQLException {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT id, nome, email, telefone, tipoUsuario FROM usuario";

        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            pstm = connection.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                String tipoUsuario = rs.getString("tipoUsuario");

                Usuario usuario = new Usuario(id, nome, email, telefone, tipoUsuario);
                lista.add(usuario);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar usuários!");
            e.printStackTrace();
            throw e;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pstm != null) {
                pstm.close();
            }
        }

        return lista;
    }

    public void atualizarUsuario(Usuario usuario) throws SQLException {
        String sql = "UPDATE usuario SET nome = ?, email = ?, telefone = ?, tipoUsuario = ? WHERE id = ?";

        PreparedStatement pstm = null;

        try {
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getEmail());
            pstm.setString(3, usuario.getTelefone());
            pstm.setString(4, usuario.getTipoUsuario());
            pstm.setInt(5, usuario.getId());

            int linhasAfetadas = pstm.executeUpdate();

            if (linhasAfetadas == 1) {

                System.out.println("Id: " + usuario.getId() + " Alterado com sucesso!");
            } else {
                if (linhasAfetadas == 0) {
                    System.out.println("Nenhum usuário foi atualizado. Verifique se o ID existe.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar usuário!");
            e.printStackTrace();
            throw e;
        } finally {
            if (pstm != null) {
                pstm.close();
            }
        }
    }

    public void deletarUsuario(int id) throws SQLException {
        String sql = "DELETE FROM usuario WHERE id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);

            int linhasAfetadas = pstm.executeUpdate();

            if (linhasAfetadas == 1) {
                System.out.println("Usuário com ID " + id + " deletado com sucesso.");
            } else {
                System.out.println("Nenhum usuário encontrado com ID " + id + ".");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao deletar usuário!");
            e.printStackTrace();
            throw e;
        } finally {
            if (pstm != null) {
                pstm.close();
            }
        }

    }    
    
    
    
    public Usuario buscaUsuarioPorId(int id) throws SQLException {
    String sql = "SELECT * FROM usuario WHERE id = ?";
    
    try (
        PreparedStatement pstm = connection.prepareStatement(sql)
    ) {
        pstm.setInt(1, id);
        
        try (ResultSet rs = pstm.executeQuery()) {
            if (rs.next()) {
                Usuario usuario = new Usuario(); 
                
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setTipoUsuario(rs.getString("tipoUsuario"));
                return usuario;
            }
        }
    } catch (SQLException e) {
        System.out.println("Erro ao buscar usuário: " + e.getMessage());
        throw e; // rethrow para a camada superior tratar, se necessário
    }

    return usuario; // Se não encontrou o usuário
}
}
