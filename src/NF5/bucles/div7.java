import java.util.Locale;
import java.util.Scanner;

public class div7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int num = sc.nextInt();

        // Repetimos el bucle hasta encontrar el número 0.
        while (num != 0) {
            // Comprobamos si el número es divisible entre 7.
            if (num % 7 == 0) {
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }
            // Leemos el siguiente número.
            num = sc.nextInt();
        }
    }
}
