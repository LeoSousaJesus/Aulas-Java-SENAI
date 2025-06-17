package ContaBancaria;

public class MainConta {
    
    public static void main(String[] args){
        
        //Conta conta = new Conta(001, "CC", "Paulo Aguiar", 250.00, 'A');
        //conta.depositarConta(13.00);
        //conta.sacarConta(3.00);
       
        Conta conta = new Conta(002, "CC", "Paulo Aguiar", 250.00, 'A');
        System.out.println(conta.toString());         
        
    }
        
}
