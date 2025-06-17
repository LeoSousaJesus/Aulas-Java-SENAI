/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

import java.util.Scanner;

public class OperadorTernario {
    
    public static void main(String[] args){
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = sc.nextInt();
        
        result = (Math.floorMod(num, 2) == 0)? "Par" : "Impar";
        System.out.println(result);
        sc.close();
    }
}

