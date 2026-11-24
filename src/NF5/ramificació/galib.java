import java.util.Locale;
import java.util.Scanner;

public class galib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float altura = sc.nextFloat();
        int puentes = sc.nextInt();
        float altura_p = sc.nextFloat();
        int cont = 1;

        // Repetimos mientras la altura del vehículo no supere la altura del puente.
        while (altura <= altura_p) {
            cont++;
            // Leemos la altura del siguiente puente.
            altura_p = sc.nextFloat();
            // Si hemos llegado al límite de puentes, terminamos el programa.
            if (puentes <= cont) {
                return;
            }
        }
        // Si salimos del bucle, mostramos el puente con el que choca el vehículo.
        System.out.println("xoca amb el pont " + cont);
    }
}
