package figures;

public class Rombo extends Figura {

    private double d1;
    private double d2;

    public Rombo(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public double area() {return this.d1 * this.d2 / 2;}

    public String toString() {return "El rombo de diagonal 1 " + this.d1 + " y diagonal 2 " + this.d2 + " tiene como área: " + this.area();}

}
