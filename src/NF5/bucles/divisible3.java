import java.util.Locale;
import java.util.Scanner;

public class divisible3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int A = sc.nextInt();
        int B = sc.nextInt();

        // Repetimos el bucle mientras A sea menor o igual que B.
        while (A <= B) {
            // Comprobamos si A es divisible entre 3, es decir, si su resto es 0.
            if (A % 3 == 0) {
                // Si es divisible entre 3, mostramos su valor.
                System.out.println(A);
            }
            // Aumentamos A en 1 para comprobar el siguiente número.
            A++;
        }
    }
}
