import java.util.Locale;
import java.util.Scanner;

public class a12collats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        int contador = 0;

        // Repetimos el proceso hasta que n1 llegue a 1.
        while (n1 != 1) {
            // Si el número es par, lo dividimos entre 2.
            if (n1 % 2 == 0) {
                n1 = n1 / 2;
                contador++;
            }
            // Si el número es impar, lo multiplicamos por 3 y sumamos 1.
            else if (n1 % 2 == 1) {
                n1 = (n1 * 3) + 1;
                contador++;
            }
        }
        // Mostramos cuántas operaciones hemos realizado para llegar a 1.
        System.out.println(contador);
    }
}
