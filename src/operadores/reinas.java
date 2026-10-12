import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        sc.useLocale(Locale.ENGLISH);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // Comprobamos si las dos reinas estan en la misma fila
        // Si tienen la misma coordenada X, estan en la misma fila
        boolean fila = x1 == x2;

        // Comprobamos si las dos reinas estan en la misma columna
        // Si tienen la misma coordenada Y, estan en la misma columna
        boolean columna = y1 == y2;

        // Comprobamos si las dos reinas estan en la misma diagonal
        // Para ello, las diferencias entre sus coordenadas deben ser iguales
        // o tener el mismo valor, pero con el signo contrario
        boolean diagonal = x1 - x2 == y1 - y2 || x1 - x2 == - (y1 - y2);
        
        boolean res = fila || columna || diagonal;
        
        System.out.println(res);

    }
}
