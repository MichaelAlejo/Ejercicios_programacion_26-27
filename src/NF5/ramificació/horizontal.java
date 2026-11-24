import java.util.Locale;
import java.util.Scanner;

public class horizontal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int filas = sc.nextInt();
        int columna = sc.nextInt();
        int cont_fila = 0;

        // Etiqueta que permite volver al inicio del bucle de filas usando continue.
        reiniciar:
        while (filas > cont_fila) {
            int n1 = sc.nextInt();
            int cont_columna = 1;
            // Comprobamos si todos los números de la fila son iguales al primero.
            while (columna > cont_columna) {
                cont_columna++;
                int n2 = sc.nextInt();
                // Si encontramos un número diferente, descartamos la fila y pasamos a la siguiente.
                if (n1 != n2) {
                    sc.nextLine();
                    cont_fila++;
                    continue reiniciar;
                }
            }
            // Si terminamos de comprobar la fila sin encontrar diferencias, mostramos el resultado.
            System.out.println("La fila " + cont_fila + " té tots els números iguals.");
            return;
        }
        // Si ninguna fila cumple la condición, mostramos este mensaje.
        System.out.println("No hi ha cap fila amb els números iguals");
    }
}
