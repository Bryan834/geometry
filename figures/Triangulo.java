package figures;

public class Triangulo extends Figura {

    private double b;
    private double h;

    public Triangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double area() {
        return this.b * this.h / 2;
    }

    /*   public double getL1() {
           return l1;
       }

       public double getL2() {
           return l2;
       }
   */
    public String toString() {
        return "El triángulo de base " + this.b + " y altura " + this.h + " tiene como área: " + this.area();
    }
}
