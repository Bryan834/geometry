package figures;

public class Cuadrado extends Figura {

    private double l;

    public Cuadrado(double l) {
        this.l = l;
    }

    public double area() {
       // return this.l * this.l;
        return Math.pow(this.l,2);
    }

    /*   public double getL1() {
           return l1;
       }

       public double getL2() {
           return l2;
       }
   */
    public String toString() {
        return "El cuadrado de lado " + this.l + " tiene como área: " + this.area();
    }
}