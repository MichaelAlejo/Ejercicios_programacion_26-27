import java.util.Locale;
import java.util.Scanner;

public class libro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        int espai = p * q * r;

        boolean res = espai >= n;

        System.out.println(res);
    }
}

