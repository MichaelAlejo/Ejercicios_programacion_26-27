
import java.util.Locale;
import java.util.Scanner;

public class ous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int huevos = sc.nextInt();

        // Comprobamos si la cantidad de huevos es múltiplo de 24.
        if (huevos % 24 == 0) {
            // Calculamos las hueveras necesarias y los huevos que faltan.
            // Si es múltiplo de 24, no faltará ningún huevo.
            System.out.println((huevos / 24) + " " + (huevos % 24));
        }
        else {
            // Calculamos las hueveras necesarias.
            // y sumamomos uno para que el codigo redondee autimaticamente
            // a las hueveras que hacen falta sin los decimales
            int hueveras = huevos / 24 + 1;
            // Calculamos cuántos huevos hay, y los restamos
            // por los huevos que caben en una huevera para saber cuantos faltan para llenar la última huevera.
            int huevosrest = 24 - (huevos % 24);
            System.out.println(hueveras + " " + huevosrest);
        }

    }
}
