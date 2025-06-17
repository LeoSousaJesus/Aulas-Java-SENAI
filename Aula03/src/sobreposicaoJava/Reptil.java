package sobreposicaoJava;


public class Reptil extends Animal{
    
    String corEscama;

    public Reptil(double peso, int idade, String membros) {
        super(peso, idade, membros);
    }

    public Reptil(String corEscama, double peso, int idade, String membros) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
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
