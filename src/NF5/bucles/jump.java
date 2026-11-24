import java.util.Locale;
import java.util.Scanner;

public class jump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int salt = 0;

        // Repetimos mientras no encontremos el valor -1, que indica el final de la secuencia.
        while (n2 != -1) {
            // Si el siguiente número es menor o igual que el anterior, no contamos ningún salto.
            if (n1 >= n2) {
                n1 = n2;
                n2 = sc.nextInt();
            }
            // Si el siguiente número es mayor que el anterior, contamos un salto.
            else if (n1 < n2) {
                salt++;
                n1 = n2;
                n2 = sc.nextInt();
            }
        }
        // Mostramos el número total de saltos.
        System.out.println(salt);
    }
}
