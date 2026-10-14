import java.util.Locale;
import java.util.Scanner;

public class petits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();

        boolean res = p1 < p2 << p3;


        System.out.println(res);
    }
}