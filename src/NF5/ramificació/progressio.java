
import java.util.Locale;
import java.util.Scanner;

public class progressio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int con = 2;
        int serie = n2 - n1; // Calcula la diferencia entre los dos primeros números.

        while (N > con) { // Comprueba los números restantes de la secuencia.
            con++;
            n1 = n2; // Actualiza el número anterior.
            n2 = sc.nextInt(); // Lee el siguiente número.

            if (n2 - n1 != serie) { // Comprueba si la diferencia ha cambiado.
                System.out.println("no"); // Indica que la secuencia no sigue la misma progresión.
                return; // Termina el programa.
            }
        }

        System.out.println("si"); // Si todas las diferencias coinciden, indica que es una progresión.
    }
}
