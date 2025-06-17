package metodos;

public class Aula02 {

    public static void main(String[] args) {
        int linhas = 10;
        for (int i = 1; i < linhas; i++) {
        String espacos = " ".repeat(linhas - i);
        String estrelas = "*".repeat(i);
        
            System.out.println(espacos + estrelas + " " + estrelas);
        }
    }
    
}
