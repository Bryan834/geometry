import figures.*;

import java.util.Arrays;


public class GestorClases {

    public static void sort (Figura [] v) {
        Arrays.sort(v);

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
        Figura[] v = new Figura[5];
        v[0] = new Circulo(5);
        v[1] = new Rectangulo(2,1);
        v[2] = new Cuadrado(6);
        v[3] = new Triangulo(4,5);
        v[4] = new Rombo(5,3);

        double r = GestorClases.suma(v);

        System.out.println("El área total es: "+ r);

        System.out.println(Arrays.asList(v));
        GestorClases.sort(v);
        System.out.println(Arrays.asList(v));

    }
}
