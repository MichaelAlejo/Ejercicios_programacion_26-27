import java.util.Locale;
import java.util.Scanner;

public class impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();

        boolean senr = (d1 % 2 == 1);
        boolean sen1 = (d2 % 2 == 1);
        boolean sen2 = (d3 % 2 == 1);

        boolean res = ();

        System.out.println(res);
    }
}