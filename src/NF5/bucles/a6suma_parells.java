import java.util.Locale;
import java.util.Scanner;

public class a6suma_parells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        int contador = 0;
        int suma = 0;
        int producto = 1;

        // Repetimos el bucle hasta encontrar el valor -1, que indica el final de los datos.
        while (n1 != -1) {
            // Contamos cada número introducido, excepto el -1.
            contador++;
            // Comprobamos si el número es par.
            if (n1 % 2 == 0) {
                // Si es par, lo añadimos a la suma.
                suma = suma + n1;
            }
            else {
                // Si es impar, lo multiplicamos por el producto acumulado.
                producto = producto * n1;
            }
            // Leemos el siguiente número para continuar el bucle.
            n1 = sc.nextInt();
        }
        // Mostramos la suma de los pares, el producto de los impares y la cantidad de números.
        System.out.println(suma);
        System.out.println(producto);
        System.out.println(contador);
    }
}
