package aula01;

import java.util.Locale;
import java.util.Scanner;

public class Aula01 {

    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        
        String nome = "Paulo Ribeiro de Aguiar";
        int idade = 44;
        double altura = 1.73;
        boolean casado = true;
        
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(casado);
        
        /*int n1 = 4, n2 = 5 , n3;
        n3 = n1 + n2;
        System.out.println("Hello World!");
        System.out.println(n3);
        System.out.println("Teste");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as três notas: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double media;
        media = (n1 + n2 + n3)/3;
        System.out.printf("Sua média é: %.2f\n" ,media);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe 2 notas para calcular sua méida:");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double media = (n1 + n2)/2;
        String resultado = "";
        resultado = media > 5? "Aprovado!" : "reprovado!";
        System.out.println(resultado);
        sc.close();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        double numero = sc.nextDouble();
        double parImpar = numero%2;
        String r = "";
        r = (parImpar == 0)? "Núemro par!" : "Número impar!"; 
        System.out.println(r);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade pernas: ");
        int pernas = sc.nextInt();
        String tipo = "";
        switch(pernas){
            case 1:
                tipo = "Saci";
                break;
                
            case 2:
                tipo = "Bipede";
                break;
                
            case 3:
                tipo = "Tripé";
                break;
                
            case 4:
                tipo = "Quadrupede";
                break;
            
            case 6: 
                tipo = "Aranha";
                break;
                
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
        sc.close();
        
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
        sc.close();*/
    }
    
            
}
