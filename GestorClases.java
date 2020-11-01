import figures.Círculo;
import figures.Figura;
public class GestorClases {

    public static void sort (Figura [] v) {

    }

    public static double suma (Figura[] v) {
        double ret = 0;
        for (Figura f: v) {
            ret += f.area();
        }
        return ret;
    }

    public static void main(String[] args) {
        Figura[] v = new Figura[3];
        v[0] = new Círculo()
    }

}
