
import java.util.Locale;
import java.util.Scanner;

public class dividir_multiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int cont = n;

        System.out.println((float)n);
        while (m >= cont) {
            cont++;
            if (cont % 2 == 0) {
                System.out.println((float)n / cont);
                n++;
            }
            else if (cont % 2 == 1){
                System.out.println((float)n * cont);
                n++;
            }

        }
    }
}