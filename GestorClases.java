import figures.Figura;
import figures.Rectangulo;
import figures.Circulo;

import java.util.Arrays;


public class GestorClases {

    public static void sort (Figura [] v) {

    }

    public static double suma (Figura[] v) {
        double ret = 0;
        for (Figura f: v) {
            System.out.println(f);
            ret += f.area();
        }
        return ret;
    }

    public static void main(String[] args) {
        Figura[] v = new Figura[3];
        v[0] = new Circulo(5);
        v[1] = new Rectangulo(2,1);
        v[2] = new Rectangulo(2,2);

        double r = GestorClases.suma(v);

        System.out.println("El área total es: "+ r);
/*
        System.out.println(Arrays.asList(v));
        GestorClases.sort(v);
        System.out.println(Arrays.asList(v));
*/
    }
}
