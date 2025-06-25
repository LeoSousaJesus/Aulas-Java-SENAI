package SwingMatematica;

public class Matematica {

    public double soma(double numero1, double numero2) {

        return numero1 + numero2;
    }

    public String parImpar(int numero) {

        String parImpar = "";

        if (numero % 2 == 0) {
            parImpar = "Par!";
        } else {
            parImpar = "Impar!";
        }

        return parImpar;

    }

    public void baskaraMatematica() {

        double num1 = 0;
        double num2 = 0;
        double num3 = 0;

        double delta = 0;

        delta = Math.pow(num2, 2) - 4 * num1 * num3;
        double x1 = (-num2 + Math.sqrt(delta) / (2 * num1));
        double x2 = (-num2 - Math.sqrt(delta) / (2 * num1));

        System.out.println("Delta: " + delta);
        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);

    }
}
