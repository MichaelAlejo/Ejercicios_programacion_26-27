package NF3.conversion;

import java.util.Locale;
import java.util.Scanner;

public class mecanogràfica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int c = sc.nextInt();
        int e = sc.nextInt();
        int t = sc.nextInt();

        int ct = (c - e);
        int prec = (ct / c) * 100;

        System.out.println(prec);
    }
}