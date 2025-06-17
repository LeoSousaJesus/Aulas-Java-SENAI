package sobreposicaoJava;

public abstract class Animal {
    
    private double peso;
    private int idade;
    private String membros;

    public Animal(double peso, int idade, String membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public String getMembros() {
        return membros;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMembros(String membros) {
        this.membros = membros;
    }

    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + '}';
    }
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
