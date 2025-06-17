
package mamatica;

import java.util.Scanner;

public class Matematica {   
        
        private int numero;

    public Matematica(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Matematica{" + "numero=" + numero + '}';
    }
        
    public static void imparPar(int numero){
        
        if (numero % 2 == 0) {
            System.out.println("Número Par!");
        }else{
            System.out.println("Número Impar!");
        }     
    }
    
    //public class double baskara(double a,  double b, double c){
        
           
       
                
    
        //double a = 1, b = -1, c = -12;
        
                //double delta = Math.pow(b, 2) - 4 * a * c;
                //double x1 = (-b + Math.sqrt(delta)/(2 * a));
                //double x2 = (-b - Math.sqrt(delta)/(2 * a));
                
                /*System.out.println("Delta: " +delta);
                System.out.println("X1: " +x1);
                System.out.println("X2: " +x2);
                System.out.println("");
                System.out.println("");*/
    }


