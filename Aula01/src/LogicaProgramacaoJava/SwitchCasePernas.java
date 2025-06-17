package LogicaProgramacaoJava;

import java.util.Scanner;

public class SwitchCasePernas {
    public static void main(String[] args){
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
        
    }
    
}
