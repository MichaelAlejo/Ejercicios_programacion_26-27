import java.util.Locale;
import java.util.Scanner;

public class interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int contador = A;

        // Repetimos el bucle mientras el contador sea menor que B.
        while (contador < B) {
            // Mostramos el número actual sin saltar de línea.
            System.out.print(contador);
            // Aumentamos el contador en 1 para pasar al siguiente número.
            contador += 1;
        }
    }
}
