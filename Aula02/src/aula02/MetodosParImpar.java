package aula02;

import java.util.Scanner;

public class MetodosParImpar {
    
    public static void main(String[] args){
        parImpar(8);
    } 
    
    
    public static void parImpar(int numero){  
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println(numero + " é um úmero par.");
        }else{
            System.out.println(numero + " é um úmero impar.");
        }
    }
}
