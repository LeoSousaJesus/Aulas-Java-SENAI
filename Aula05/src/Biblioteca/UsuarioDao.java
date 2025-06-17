package Biblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class UsuarioDao {
    private Connection connection;
    private Object Conexao;

    public UsuarioDao() {
        this.connection = new ConnectionsFactory().conectaDB();
    }
    
    public void criaUsuario(Usuario usuario) throws SQLException{
    
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
        }
        finally{
            if(pstm != null){
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
        if (rs != null) rs.close();
        if (pstm != null) pstm.close();
    }

    return lista;
}
}
