import java.util.Locale;
import java.util.Scanner;

public class corrent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String res = "CORRECTE";

        // Repetimos mientras no encontremos el valor 0, que indica el final de la secuencia.
        while (n2 != 0) {
            // Comprobamos que el siguiente número sea mayor que el anterior.
            if (n1 < n2) {
                n1 = n2;
                n2 = sc.nextInt();
            }
            else {
                // Si no es mayor, la secuencia deja de ser correcta.
                res = "INCORRECTE";
                break;
            }
            // Si todavía quedan números, comprobamos que ahora sea menor que el anterior.
            if (n2 != 0) {
                if (n1 > n2) {
                    n1 = n2;
                    n2 = sc.nextInt();
                }
                else {
                    res = "INCORRECTE";
                    break;
                }
            }
        }

        // Mostramos si la secuencia cumple el orden esperado.
        System.out.println(res);
    }
}
