import java.util.Locale;
import java.util.Scanner;

public class fulln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fila = sc.nextInt();
        int columna = sc.nextInt();
        int contf = 0;

        // Repetimos el proceso mientras queden filas por leer.
        while (fila > contf) {
            int contc = 0;
            float tot = 0.0f;
            contf++;
            // Recorremos todas las columnas de la fila actual.
            while (columna > contc) {
                int num = sc.nextInt();
                // Mostramos cada número de la fila.
                System.out.print(num + " ");
                // Sumamos los valores para calcular la media de la fila.
                tot = tot + num;
                contc++;
            }
            // Dividimos la suma entre el número de columnas para obtener la media.
            System.out.println(tot / columna);
        }
    }
}
