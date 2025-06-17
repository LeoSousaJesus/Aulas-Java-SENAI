package aula01;

public class LacoForImpressaoAsterisco {
    
    public static void main(String[] args) {
        
        for (int i = 1; i < 5; i++) {
            System.out.println("1");
            for (int j = 1; j < i+1; j++) {
               System.out.print("*");
            }
           
        }
        
    }
}
