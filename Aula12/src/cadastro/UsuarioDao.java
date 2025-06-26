// UsuarioDao.java
// Define o pacote onde esta classe está localizada.
package cadastro;

// Importa as classes necessárias para o acesso a dados e manipulação de listas.
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement; // Usado para executar queries SQL de forma segura.
import java.sql.ResultSet;         // Armazena o resultado de uma consulta ao banco.
import java.util.ArrayList;        // Implementação de uma lista dinâmica.
import java.util.List;             // Interface para listas de objetos.

// A classe DAO (Data Access Object) centraliza toda a comunicação com o banco de dados referente aos usuários.
public class UsuarioDao {

    // (REMOVIDO) Não é uma boa prática manter uma única conexão aberta para toda a vida do objeto DAO.
    // private Connection connection;
    // public UsuarioDao() { this.connection = new ConnectionFactory().connectaDB(); }

    /**
     * Lista todos os usuários cadastrados no banco de dados.
     * @return uma Lista de objetos Usuario.
     */
    public List<Usuario> listarUsuarios() {
        // Cria uma lista vazia para armazenar os usuários que vêm do banco.
        List<Usuario> lista = new ArrayList<>();
        // Define a instrução SQL para selecionar todos os dados da tabela 'usuarios', ordenados por nome.
        String sql = "SELECT id, nome, email, telefone, tipo_usuario FROM usuarios ORDER BY nome ASC";

        // O 'try-with-resources' garante que a conexão (conn), o statement (stmt) e o resultset (rs)
        // sejam fechados automaticamente no final, mesmo que ocorram erros.
        try (Connection conn = new ConnectionFactory().connectaDB();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            // O laço 'while (rs.next())' percorre cada linha retornada pela consulta.
            while (rs.next()) {
                // Para cada linha, cria um novo objeto Usuario usando o construtor com parâmetros.
                Usuario u = new Usuario(
                    rs.getInt("id"),              // Pega o valor inteiro da coluna 'id'.
                    rs.getString("nome"),         // Pega o valor de texto da coluna 'nome'.
                    rs.getString("email"),        // Pega o valor de texto da coluna 'email'.
                    rs.getString("telefone"),     // Pega o valor de texto da coluna 'telefone'.
                    rs.getString("tipo_usuario")  // Pega o valor de texto da coluna 'tipo_usuario'.
                );
                // Adiciona o objeto 'u' (usuário) recém-criado à lista.
                lista.add(u);
            }

        } catch (SQLException e) {
            // Se um erro de SQL ocorrer, imprime o rastreamento do erro no console.
            e.printStackTrace();
        }
        // Retorna a lista de usuários (pode estar vazia se não houver registros ou se ocorrer um erro).
        return lista;
    }
    
    /**
     * Busca um usuário específico no banco de dados pelo seu ID.
     * @param id O ID do usuário a ser procurado.
     * @return um objeto Usuario com os dados encontrados, ou null se o usuário não for encontrado.
     */
    public Usuario buscarPorId(int id) {
        // A query SQL para selecionar um usuário com um ID específico.
        String sql = "SELECT id, nome, email, telefone, tipo_usuario FROM usuarios WHERE id = ?";
        Usuario usuario = null; // Inicia o objeto como nulo.

        // Usa try-with-resources para garantir que a conexão e o statement sejam fechados.
        try (Connection conn = new ConnectionFactory().connectaDB();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Define o valor do primeiro placeholder (?) na query SQL para o ID fornecido.
            stmt.setInt(1, id);

            // Executa a consulta e armazena o resultado no ResultSet.
            try (ResultSet rs = stmt.executeQuery()) {

                // Verifica se a consulta retornou algum resultado.
                // Usamos 'if' em vez de 'while' porque esperamos no máximo um único usuário.
                if (rs.next()) {
                    // Se um usuário foi encontrado, cria um novo objeto Usuario com os dados do ResultSet.
                    usuario = new Usuario(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("telefone"),
                        rs.getString("tipo_usuario")
                    );
                }
            }

        } catch (SQLException e) {
            // Se ocorrer um erro, imprime no console.
            e.printStackTrace();
        }

        // Retorna o objeto 'usuario' (que será nulo se ninguém for encontrado ou se ocorrer um erro).
        return usuario;
    }

    /**
     * Insere um novo registro de usuário no banco de dados.
     * @param usuario O objeto Usuario com os dados a serem salvos (sem o ID).
     * @return 'true' se o usuário foi salvo com sucesso, 'false' caso contrário.
     */
    public boolean salvarUsuario(Usuario usuario) {
        // Define a instrução SQL para inserir um novo registro. Os '?' são placeholders.
        // CORREÇÃO: O nome da tabela foi corrigido para 'usuarios'.
        String sql = "INSERT INTO usuarios (nome, email, telefone, tipo_usuario) VALUES (?, ?, ?, ?)";

        // Usa 'try-with-resources' para garantir que a conexão e o statement sejam fechados.
        try (Connection conn = new ConnectionFactory().connectaDB();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Substitui os placeholders '?' pelos valores do objeto 'usuario'.
            // O primeiro argumento é o índice do '?' (começando em 1).
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getTelefone());
            stmt.setString(4, usuario.getTipo_usuario());

            // Executa a instrução INSERT. Retorna o número de linhas afetadas.
            int rowsInserted = stmt.executeUpdate();
            // Retorna 'true' se pelo menos uma linha foi inserida, e 'false' caso contrário.
            return rowsInserted > 0;

        } catch (SQLException e) {
            // Em caso de erro, imprime o rastreamento e retorna 'false'.
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Atualiza os dados de um usuário existente no banco de dados.
     * @param usuario O objeto Usuario com os dados atualizados, incluindo o ID.
     * @return 'true' se a atualização foi bem-sucedida, 'false' caso contrário.
     */
    public boolean atualizarUsuario(Usuario usuario) {
        // Define a instrução SQL para atualizar um registro existente.
        // CORREÇÃO: Nome da tabela e das colunas corrigidos para o padrão do banco.
        String sql = "UPDATE usuarios SET nome = ?, email = ?, telefone = ?, tipo_usuario = ? WHERE id = ?";

        // Usa 'try-with-resources'.
        try (Connection conn = new ConnectionFactory().connectaDB();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Define os parâmetros da query.
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getTelefone());
            stmt.setString(4, usuario.getTipo_usuario());
            stmt.setInt(5, usuario.getId()); // O ID é usado na cláusula WHERE.

            // Executa a instrução UPDATE. Retorna o número de linhas afetadas.
            // Retorna 'true' se pelo menos uma linha foi atualizada.
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            // Em caso de erro, imprime o rastreamento e retorna 'false'.
            e.printStackTrace();
            return false;
        }
    }
}