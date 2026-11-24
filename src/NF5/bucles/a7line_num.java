import java.util.Locale;
import java.util.Scanner;

public class a7line_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String A = sc.nextLine();
        int contador = 0;

        // Repetimos el bucle mientras la línea introducida no sea "END".
        while (!A.equals("END")) {
            // Comprobamos si el contador tiene una sola cifra.
            if (contador < 9) {
                contador++;
                // Añadimos un espacio delante del número para alinear las líneas.
                System.out.println(" " + contador + " | " + A);
                A = sc.nextLine();
            }
            else {
                // A partir de la línea 10, ya no necesitamos el espacio inicial.
                contador++;
                System.out.println(contador + " | " + A);
                A = sc.nextLine();
            }
        }
    }
}
