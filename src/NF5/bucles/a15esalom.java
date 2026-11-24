import java.util.Locale;
import java.util.Scanner;

public class a15esalom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String l1 = sc.nextLine();
        int contador = 0;

        // Repetimos el bucle hasta encontrar la palabra "META".
        while (!l1.equals("META")) {
            // Aumentamos el contador por cada línea recibida.
            contador++;
            // Mostramos el contenido de la línea junto con su número.
            System.out.println(l1 + " " + contador);
            // Leemos la siguiente línea.
            l1 = sc.nextLine();
        }
    }
}
