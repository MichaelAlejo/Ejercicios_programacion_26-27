
import java.util.Locale;
import java.util.Scanner;

public class petitsdev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();

        // Comprobamos si el primer número es menor o igual que el segundo.
        if (d1 <= d2)  {
            // Comprobamos si los tres números están ordenados de menor a mayor.
            System.out.println( d1 <= d2 && d2 <= d3);
        }
        // Si el primer número es mayor o igual que el segundo,
        // significa que no están ordenados correctamente.
        else if (d1 >= d2 ) {
            // Mostramos false porque el orden de los números es incorrecto.
            System.out.println( d1 <= d2 && d2 <= d3);

        }

    }
}
