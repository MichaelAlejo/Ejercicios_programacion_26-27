import java.util.Locale;
import java.util.Scanner;

public class perimetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int ancho = x1 - x2;
        int alto = y1 - y2;

        System.out.println(2 * (ancho + alto));


    }
}