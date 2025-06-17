package sobreposicaoJava;

public class Mamifero extends Animal{
    
    String corPelo;

    public Mamifero(double peso, int idade, String membros) {
        super(peso, idade, membros);
    }

    public Mamifero(String corPelo, double peso, int idade, String membros) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alimentar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void emitirSom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
