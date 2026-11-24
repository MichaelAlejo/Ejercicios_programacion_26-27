import java.util.Locale;
import java.util.Scanner;

public class a5fizz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int A = sc.nextInt();
        int B = sc.nextInt();

        // Repetimos el bucle mientras A sea mayor o igual que B.
        while (A >= B) {
            // Comprobamos primero si A es divisible entre 3 y entre 5.
            if (A % 3 == 0 && A % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Si no cumple la condición anterior, comprobamos si es divisible entre 3.
            else if (A % 3 == 0) {
                System.out.println("Fizz");
            }
            // Si no, comprobamos si es divisible entre 5.
            else if (A % 5 == 0) {
                System.out.println("Buzz");
            }
            // Si no cumple ninguna condición, mostramos el propio número.
            else {
                System.out.println(A);
            }
            // Restamos 1 para continuar con el número anterior.
            A--;
        }
    }
}
