package aula06;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String tipoUsuario;    

    public Usuario(int id, String nome, String email, String telefone, String tipoUsuario) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
    }
    
    

    public Usuario() {
    // Construtor padrão vazio — necessário para instanciar objetos sem parâmetros
}

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return
                "Id "+ id +"\n"+
                "Nome " + nome +"\n"+
                "E-mail " + email + "\n"+
                "Telefone " + telefone +"\n"+
                "Tipo Usuario " + tipoUsuario +"\n\n" ;
    }
    
}

