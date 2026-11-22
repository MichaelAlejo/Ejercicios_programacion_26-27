import java.util.Locale;
import java.util.Scanner;

public class dividir_multiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float n = sc.nextFloat();
        int m = sc.nextInt();
        int cont = (int)n;

        System.out.print(n + " ");
        while (m > cont) {
            cont++;
            if (cont % 2 == 0 && cont != 0) {
                n = n / cont;
                System.out.print(n + " ");
            }
            else if (cont % 2 != 0){
                n = n * cont;
                System.out.print(n + " ");
            }
            if (cont == 0){
                System.out.print(n + " ");
            }

        }
    }
}
