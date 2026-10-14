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

        // Restamos las coordenadas para calcular el ancho y el alto
        int ancho_x = x1 - x2;
        int alto_y = y1 - y2;
        
        // Sumamos el ancho y el alto y multiplicamos por 2 para calcular el perímetro
        //utilizando la formula para calcular perimetro
        System.out.println(2 * (ancho_x + alto_y));


    }
}
