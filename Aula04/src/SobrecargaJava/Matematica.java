package SobrecargaJava;

public class Matematica {
    
    public String calculo(int a){
        return(Math.floorMod(a, 2) == 0)? "Par" : "Impar";
    }
    
    public void calculo(int a, int b){
        System.out.println("A soma é: "+(a + b));
    }
    
    public void calculo(int a, int b, int c){
        System.out.println("A média é: "+(a + b + c)/2);
    }
    
    public void calculo(double a, double b, double c){
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
