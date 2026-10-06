import java.util.Locale;
import java.util.Scanner;

public class llums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean d1 = sc.nextBoolean();
        boolean d2 = sc.nextBoolean();
        boolean d3 = sc.nextBoolean();
        boolean d4 = sc.nextBoolean();

        boolean res = !(d1 || d2 || d3 || d4);

        System.out.println(res);
    }
}