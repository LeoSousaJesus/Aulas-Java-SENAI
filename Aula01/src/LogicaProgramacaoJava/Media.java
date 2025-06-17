package LogicaProgramacaoJava;

import java.util.Locale;
import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        
        double n1, n2 , n3;         
      
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as três notas: ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        double media;
        media = (n1 + n2 + n3)/3;
        System.out.printf("Sua média é: %.2f\n" ,media);
    
    }
    
}
