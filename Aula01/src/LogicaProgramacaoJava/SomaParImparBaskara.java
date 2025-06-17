package LogicaProgramacaoJava;

import java.util.Scanner;

public class SomaParImparBaskara {
    public static void main(String[] args) {       
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número para o tipo de operação: ");
        int tipo = sc.nextInt();
        
        switch (tipo) {
            case 1:
                System.out.println("Informe dois números: ");
                double numero1 = sc.nextDouble();
                double numero2 = sc.nextDouble();
                System.out.println("A soma é: " +(numero1 + numero2));
                break;
            default:
                throw new AssertionError();
                
            case 2:
                System.out.println("Informe um valor: ");
                numero1 = sc.nextDouble();
                String r = (numero1 % 2 == 0)? "Par" : "Impar";
                System.out.println(r);
                break;
                
            case 3:
                double a = 1, b = -1, c = -12;
                double delta = Math.pow(b, 2) - 4 * a * c;
                double x1 = (-b + Math.sqrt(delta)/(2 * a));
                double x2 = (-b - Math.sqrt(delta)/(2 * a));
                System.out.println("Delta: " +delta);
                System.out.println("X1: " +x1);
                System.out.println("X2: " +x2);
                System.out.println("");
                System.out.println("");
        }
        sc.close();
    }    
}
