import java.util.Locale;
import java.util.Scanner;

public class a11fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int tot = sc.nextInt();
        int anterior = 1;
        int siguiente = 1;
        int cont = 2;
        // Mostramos el primer número de Fibonacci.
        System.out.print(anterior + " ");
        // Si queremos más de un número, mostramos también el segundo.
        if (tot != 1) {
            System.out.print(siguiente + " ");
        }
        // Repetimos hasta haber mostrado la cantidad de números solicitada.
        while (tot > cont) {
            // Calculamos el siguiente número sumando los dos anteriores.
            cont++;
            int resultado = anterior + siguiente;
            System.out.print(resultado + " ");
            // Actualizamos los valores para preparar el siguiente cálculo.
            anterior = siguiente;
            siguiente = resultado;
        }
    }
}
