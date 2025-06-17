
package classesJava;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    public void canelarMatricula(){
        System.out.println("Matricula cancelada!");
    }

    public Aluno(int matricula, String curso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

   

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "matricula=" + matricula + ", curso=" + curso + '}';
    }
    
}
