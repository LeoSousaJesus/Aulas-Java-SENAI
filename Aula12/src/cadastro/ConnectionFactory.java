// ConnectionFactory.java
// Define o pacote onde esta classe está localizada.
package cadastro;

// Importa as classes necessárias para trabalhar com SQL.
import java.sql.Connection;       // Representa a conexão com o banco de dados.
import java.sql.DriverManager;     // Gerencia os drivers de banco de dados.
import java.sql.SQLException;      // Trata exceções relacionadas ao SQL.

// Declaração da classe pública 'ConnectionFactory'.
// O objetivo desta classe é centralizar e gerenciar a criação de conexões com o banco de dados.
public class ConnectionFactory {

    /**
     * Método público que tenta estabelecer uma conexão com o banco de dados.
     * @return um objeto 'Connection' se a conexão for bem-sucedida, ou 'null' se ocorrer um erro.
     */
    public Connection connectaDB() {
        // Inicializa a variável de conexão como nula.
        Connection conn = null;

        // O bloco 'try-catch' é usado para tratar possíveis erros (exceções) que podem ocorrer
        // durante a tentativa de conexão com o banco de dados.
        try {
            // Define a URL de conexão JDBC para o MariaDB.
            // jdbc:mariadb:// -> Protocolo e driver.
            // localhost:3306 -> Endereço do servidor e porta.
            // /cadastro -> Nome do banco de dados (schema).
            // ?useSSL=false -> Parâmetro para desabilitar o uso de SSL (CORRIGIDO: era useSS!=false).
            String url = "jdbc:mariadb://localhost:3306/cadastro?useSSL=false";

            // Define o nome de usuário do banco de dados.
            String user = "root";

            // Define a senha do banco de dados. (Vazia, neste caso).
            String password = "";

            // Tenta estabelecer a conexão usando o DriverManager, passando a URL, usuário e senha.
            conn = DriverManager.getConnection(url, user, password);

            // Se a linha acima não lançar uma exceção, a conexão foi bem-sucedida.
            // Imprime uma mensagem no console para confirmar.
            System.out.println("Conexão com o banco de dados bem-sucedida.");

        // Se ocorrer uma exceção do tipo SQLException durante o bloco 'try'...
        } catch (SQLException e) {
            // ...o programa captura o erro e imprime uma mensagem detalhada no console.
            System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());
        }

        // Retorna o objeto de conexão. Será 'null' se a conexão falhou.
        return conn;
    }
}