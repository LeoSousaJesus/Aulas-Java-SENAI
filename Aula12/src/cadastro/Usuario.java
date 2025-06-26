// Usuario.java
// Define o pacote onde esta classe está localizada.
package cadastro;

// Declaração da classe pública 'Usuario'.
// Esta classe serve como um modelo para representar os dados de um usuário.
public class Usuario {

    // --- ATRIBUTOS ---
    // Atributo privado para armazenar o ID do usuário. 'private' significa que só pode ser acessado de dentro desta classe.
    private int id;
    // Atributo privado para armazenar o nome do usuário.
    private String nome;
    // Atributo privado para armazenar o e-mail do usuário.
    private String email;
    // Atributo privado para armazenar o telefone do usuário.
    private String telefone;
    // Atributo privado para armazenar o tipo de usuário (ex: admin, comum).
    private String tipo_usuario;

    // --- CONSTRUTORES ---

    /**
     * Construtor Padrão (sem argumentos).
     * É importante ter este construtor para criar instâncias do objeto sem precisar passar todos os dados de uma vez.
     * Ex: Usuario usuario = new Usuario(); usuario.setNome("João");
     */
    public Usuario() {
    }

    /**
     * Construtor com todos os parâmetros.
     * Permite criar um objeto 'Usuario' já com todos os seus dados inicializados.
     * @param id O identificador único do usuário.
     * @param nome O nome do usuário.
     * @param email O e-mail do usuário.
     * @param telefone O telefone de contato do usuário.
     * @param tipo_usuario O tipo ou perfil do usuário.
     */
    public Usuario(int id, String nome, String email, String telefone, String tipo_usuario) {
        // A palavra-chave 'this' se refere à instância atual da classe.
        // É usada para diferenciar o atributo da classe (this.id) do parâmetro do método (id).
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.tipo_usuario = tipo_usuario;
    }

    // --- MÉTODOS GETTERS E SETTERS ---
    // Métodos públicos que permitem ler (get) e modificar (set) os atributos privados da classe.
    // Isso é um princípio fundamental do encapsulamento em Java.

    // Retorna o valor do ID.
    public int getId() {
        return id;
    }

    // Define um novo valor para o ID.
    public void setId(int id) {
        this.id = id;
    }

    // Retorna o valor do nome.
    public String getNome() {
        return nome;
    }

    // Define um novo valor para o nome.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna o valor do e-mail.
    public String getEmail() {
        return email;
    }

    // Define um novo valor para o e-mail.
    public void setEmail(String email) {
        this.email = email;
    }

    // Retorna o valor do telefone.
    public String getTelefone() {
        return telefone;
    }

    // Define um novo valor para o telefone.
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Retorna o valor do tipo de usuário.
    public String getTipo_usuario() {
        return tipo_usuario;
    }

    // Define um novo valor para o tipo de usuário.
    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
}