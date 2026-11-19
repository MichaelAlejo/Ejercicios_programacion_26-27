
import java.util.Locale;
import java.util.Scanner;

public class horizontal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int filas = sc.nextInt();
        int columna = sc.nextInt();
        int cont_columna = 1;
        int cont_fila = -1;

        reiniciar:
        while (filas > cont_fila){
            cont_fila++;
            int n1 = sc.nextInt();
            while (columna > cont_columna) {
                cont_columna++;
                int n2 = sc.nextInt();
                if (n1 != n2){
                sc.nextLine();
                continue reiniciar;
                }
            }
            System.out.println("La fila " + cont_fila + " té tots els números iguals.");
            return;
        }
        System.out.println("No hi ha cap fila amb els números iguals");

    }
}

