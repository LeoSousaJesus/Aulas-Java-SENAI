package Caneta;

public class Caneta {
    
    public String marca;
    public String modelo;
    public String cor;
    public int carga;
    public double ponta;

    public Caneta(String marca, String modelo, String cor, int carga, double ponta) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.carga = carga;
        this.ponta = ponta;
    }

    public Caneta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getCarga() {
        return carga;
    }

    public double getPonta() {
        return ponta;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    @Override
    public String toString() {
        return "Caneta: " + marca +"\n"
              +"Modelo: " + modelo +"\n"
              +"Cor: " + cor + "\n"
              +"Carga: "+ carga +"\n"
              +"Ponta: " + ponta +"\n";
    }
    
    
    
}
