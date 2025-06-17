package aula02.AulaObjeto;

public class CanetaPrivada {

    private class CanetaPrivida {

        private String marca;
        private String modelo;
        private double ponta;
        private String cor;
        private int carga;

        public CanetaPrivida(String marca, String modelo, double ponta, String cor, int carga) {
            this.marca = marca;
            this.modelo = modelo;
            this.ponta = ponta;
            this.cor = cor;
            this.carga = carga;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public double getPonta() {
            return ponta;
        }

        public String getCor() {
            return cor;
        }

        public int getCarga() {
            return carga;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public void setPonta(double ponta) {
            this.ponta = ponta;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public void setCarga(int carga) {
            this.carga = carga;
        }

        @Override
        public String toString() {
            return "CanetaPrivida{" + "marca=" + marca + ", modelo=" + modelo + ", ponta=" + ponta + ", cor=" + cor + ", carga=" + carga + '}';
        }
        
        
    }

}
