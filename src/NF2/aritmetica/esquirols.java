import java.util.Locale;
import java.util.Scanner;

public class esquirols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int a = sc.nextInt();
        int n = sc.nextInt();

        // hacemos una division para ver cuantas nueces sobra, y nos quedamos con lo restante de la operacion con el %
        System.out.println(n % a);
    }
}