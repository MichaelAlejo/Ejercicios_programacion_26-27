import java.util.Locale;
import java.util.Scanner;

public class candau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int codi = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        boolean res = false;

        // Repetimos mientras no encontremos el valor -1, que indica el final de los datos.
        while (n3 != -1) {
            // Comprobamos si la suma de los dos números anteriores, multiplicada por el actual, coincide con el código.
            if ((n1 + n2) * n3 == codi) {
                res = true;
                // Si encontramos una combinación válida, salimos del bucle.
                break;
            }
            // Desplazamos los números para comprobar la siguiente combinación de tres consecutivos.
            n1 = n2;
            n2 = n3;
            n3 = sc.nextInt();
        }
        // Mostramos si se ha encontrado alguna combinación válida.
        System.out.println(res);
    }
}
