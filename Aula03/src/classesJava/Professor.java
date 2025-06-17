package classesJava;

public class Professor extends Pessoa{
    private String especialidade;
    private Double salario;
    
    public void receberAumento(){
        System.out.println("Recebeu aumento!");
    }

    public Professor(String especialidade, Double salario, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    
}
