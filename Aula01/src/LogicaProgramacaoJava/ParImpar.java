package LogicaProgramacaoJava;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        double numero = sc.nextDouble();
        double parImpar = numero%2;
        String r = "";
        r = (parImpar == 0)? "Núemro par!" : "Número impar!"; 
        System.out.println(r);
    
    }
    
}
