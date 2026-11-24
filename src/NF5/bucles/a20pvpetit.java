import java.util.Locale;
import java.util.Scanner;

public class a20pvpetit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int tot = sc.nextInt();
        int cont = 1;

        int n1 = sc.nextInt();
        int valorp = n1;
        int poscp = cont;

        // Repetimos hasta haber leído todos los números.
        while (tot > cont) {
            int n2 = sc.nextInt();
            cont++;
            // Comprobamos si el número actual es menor que el mínimo guardado.
            if (valorp > n2) {
                valorp = n2;
                // Actualizamos la posición donde hemos encontrado el nuevo mínimo.
                poscp = cont;
            }
        }
        // Mostramos el número más pequeño y su posición.
        System.out.println("El nombre més petit és el " + valorp + " i es troba a la posició " + poscp);
    }
}
