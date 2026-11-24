import java.util.Locale;
import java.util.Scanner;

public class analyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String frase = sc.next();
        int tot = 0;

        // Repetimos mientras no encontremos la palabra "END".
        while (!frase.equals("END")) {
            // Comprobamos si la palabra actual es "class".
            if (frase.equals("class")) {
                // Si coincide, aumentamos el contador.
                tot++;
                frase = sc.next();
            }
            else {
                // Si no coincide, leemos la siguiente palabra.
                frase = sc.next();
            }
        }
        // Mostramos cuántas veces aparece la palabra "class".
        System.out.println(tot);
    }
}
