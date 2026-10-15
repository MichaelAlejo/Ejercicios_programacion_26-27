import java.util.Locale;
import java.util.Scanner;

public class mecanogràfica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int ct = sc.nextInt();
        int ce = sc.nextInt();
        int ts = sc.nextInt();

        int cc = ct - ce;
        float precision = (cc/(float)ct) * 100;
        System.out.println((int)precision);

        float  velocidad_palabras = ct/5f;
        float seg_a_min = ts/60f;

        float velocidad_total = velocidad_palabras/seg_a_min;
        System.out.println((int)velocidad_total);
    }
}