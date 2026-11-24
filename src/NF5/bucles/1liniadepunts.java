import java.util.Locale;
import java.util.Scanner;

public class liniadepunts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int puntos = sc.nextInt();
        int contador = 0;

        // Mientras el contador sea menor que la cantidad de puntos...
        while (contador < puntos) {
            // Aumentamos el contador en 1 en cada vuelta.
            contador += 1;
            // Mostramos un punto sin hacer un salto de línea.
            System.out.print(".");
        }
    }
}
