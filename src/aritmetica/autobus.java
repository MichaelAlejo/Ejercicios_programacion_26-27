import java.util.Locale;
import java.util.Scanner;

public class autobus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        Integer n = sc.nextInt();

        System.out.println((a + b) * n);
    }
}

