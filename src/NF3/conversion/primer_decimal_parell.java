import java.util.Locale;
import java.util.Scanner;

public class primer_decimal_parell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int c = sc.nextInt();
        int f = sc.nextInt();

        int a_char = c + 96;

        System.out.print((char)a_char);
        System.out.print(f);


    }
}