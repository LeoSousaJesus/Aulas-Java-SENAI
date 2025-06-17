package classesJava;

public class Funcionario extends Pessoa{
    private String setor;
    private String trabalhando;
    
    public void mudarTrabalho(){
        System.out.println("Mudou de trabalho!");
    }   

    public Funcionario(String setor, String trabalhando, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
        

    public String getSetor() {
        return setor;
    }

    public String getTrabalhando() {
        return trabalhando;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTrabalhando(String trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        return super.toString()+ "setor=" + setor + ", trabalhando=" + trabalhando + '}';
    }
    
}
