import java.util.Locale;
import java.util.Scanner;

    public class a17sumar_parells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int tot = sc.nextInt();
        int n1 = sc.nextInt();
        int res = 0;
        int cont = 1;

        // Repetimos el bucle hasta procesar la cantidad de números indicada en tot.
        while (tot >= cont) {
            cont++;
            // Comprobamos si el número actual es par.
            if (n1 % 2 == 0) {
                // Si es par, lo añadimos al resultado acumulado.
                res = res + n1;
            }
            // Leemos el siguiente número solamente si todavía quedan números por procesar.
            if (tot >= cont) {
                n1 = sc.nextInt();
            }
        }
        // Mostramos la suma de todos los números pares.
        System.out.println(res);
    }
}
