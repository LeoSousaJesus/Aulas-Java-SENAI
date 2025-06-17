/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

import java.util.Scanner;

public class Baskara {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Informe o valor de A: ");
        a = sc.nextInt();
        System.out.println("Informe o valor de B: ");
        b = sc.nextInt();
        System.out.println("Informe o valor de C: ");
        c = sc.nextInt();
        //double a = 1, b = -1, c = -12;
                double delta = Math.pow(b, 2) - 4 * a * c;
                double x1 = (-b + Math.sqrt(delta)/(2 * a));
                double x2 = (-b - Math.sqrt(delta)/(2 * a));
                System.out.println("Delta: " +delta);
                System.out.println("X1: " +x1);
                System.out.println("X2: " +x2);
                System.out.println("");
                System.out.println("");
    }
    
}
