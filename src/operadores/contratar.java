import java.util.Locale;
import java.util.Scanner;

public class contratar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean d1 = sc.nextBoolean();
        int d2 = sc.nextInt();
        boolean d3 = sc.nextBoolean();
        int d4 = sc.nextInt();

        boolean res = d1 != d3;

        System.out.println(res);
    }
}