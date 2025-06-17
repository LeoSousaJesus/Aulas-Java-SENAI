package SobrecargaJava;

public class SobrecarMain {
    
    public static void main(String[] args){
        
        Matematica matematica = new Matematica();
        
        
        System.out.println(matematica.calculo(12));
        matematica.calculo(8,32);
        matematica.calculo(8,32,69);
        matematica.calculo(8d,-1d,-9d);
    }
    
}
