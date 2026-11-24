import java.util.Locale;
import java.util.Scanner;

public class a10factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        int fin = 1;

        // Repetimos mientras n1 sea mayor que 0.
        while (n1 > 0) {
            // Multiplicamos el resultado acumulado por el valor actual de n1.
            fin = fin * n1;
            // Decrementamos n1 para continuar con el número anterior.
            n1--;
        }
        // Mostramos el resultado del factorial.
        System.out.println(fin);
    }
}
