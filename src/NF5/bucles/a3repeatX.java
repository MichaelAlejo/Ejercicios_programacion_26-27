import java.util.Locale;
import java.util.Scanner;

public class a3repeatX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int A = sc.nextInt();
        int contador = 0;

        // Repetimos el bucle mientras el contador sea menor que A.
        while (contador < A) {
            // Mostramos el valor de A en cada repetición.
            System.out.print(A);
            // Aumentamos el contador para controlar cuántas veces se repite.
            contador += 1;
        }
    }
}
