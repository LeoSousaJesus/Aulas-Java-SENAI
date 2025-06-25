package calculo;

public class Bhaskara {

    private double a, b, c;

    public Bhaskara(double a, double b, double c) {
        
        this.a = a;
        this.b = b;
        this.c = c;

    }
    
    public double delta(){
    
        return Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC();
    }
    
    public double[] resposta(){
    
    double delta = delta();
    double x1 = (-this.getB() + Math.sqrt(delta))/(2 * this.getA());
    double x2 = (-this.getB() - Math.sqrt(delta))/(2 * this.getA());
    return new double[] {x1, x2};
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }
}
