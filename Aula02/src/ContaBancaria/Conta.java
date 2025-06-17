package ContaBancaria;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private char status;

    public Conta(int numConta, String tipo, String dono, double saldo, char status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public char getStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
   

    @Override
    public String toString() {
        return "Conta: "+ numConta+"\n"
              +"Tipo: "+ tipo +"\n"
              +"Nome: "+ dono +"\n"
              +"Saldo: " +saldo +"\n"
              +"Status: " +status +"\n";
    }    
    
    public double depositarConta(double valorDeposito)
    {
        saldo += valorDeposito;
        return saldo;
    }
    
    public double sacarConta(double valorDeposito)
    {
        saldo -= valorDeposito;    
        return saldo;
    }
}
