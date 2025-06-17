package aula07;

import java.sql.SQLException;

public class Biblioteca {

    public static void main(String[] args) throws SQLException {

        /* ConnectionsFactory conexao = new ConnectionsFactory();
        
        String a = (conexao.conectaDB() != null)? "Conectado!" : "Erro conecção";
        
        System.out.println(a);*/
        
        
        
        
 /*UsuarioDao usuarioDao = new UsuarioDao();
       
       Usuario usuario = new Usuario(0, "José", "jose@email", "3354-3635", "teste");
       
       usuarioDao.criaUsuario(usuario);*/
 
 
 
 
 
 /*ArrayList<Usuario> usuarios = new ArrayList<>();  // Lista de usuários

        usuarios.add(new Usuario(0, "Antônio", "antonio@email", "37582254", "arreiLis"));
        usuarios.add(new Usuario(0, "Mariana", "mariana@email", "85365485", "arreiLis1"));
        usuarios.add(new Usuario(0, "Sofia", "sofia@email", "99854554", "arreiLis2"));

        UsuarioDao usuarioDao = new UsuarioDao();

        for (Usuario usuario : usuarios) {
            usuarioDao.criaUsuario(usuario);
        }*/
 /*UsuarioDao listarUsuarios = new UsuarioDao();
        listarUsuarios.listarUsuarios();
        System.out.println(listarUsuarios.listarUsuarios()+"\n");*/
 
 
        /*UsuarioDao usuario = new UsuarioDao();

        Usuario usuarioAtualizado = new Usuario(
                3,
                "Anabeli Atualizado",
                "joao@novo.com",
                "99999-9999",
                "QA"
        );
        
        usuario.atualizarUsuario(usuarioAtualizado);*/
        
       /* UsuarioDao deletarUsuario = new UsuarioDao();
        
        
        deletarUsuario.deletarUsuario(6);
        */
       
       UsuarioDao consultaId = new UsuarioDao();
       
        consultaId.buscaUsuarioPorId(3);
        
        Usuario id = consultaId.buscaUsuarioPorId(3);
        
        System.out.println(consultaId.buscaUsuarioPorId(3));
        
        
    }
}
