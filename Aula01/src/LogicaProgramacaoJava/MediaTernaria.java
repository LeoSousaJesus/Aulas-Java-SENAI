package LogicaProgramacaoJava;

import java.util.Scanner;

public class MediaTernaria {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe 2 notas para calcular sua méida:");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double media = (n1 + n2)/2;
        String resultado = "";
        resultado = media > 5? "Aprovado!" : "reprovado!";
        System.out.println(resultado);
        sc.close();
        
    }
    
}
