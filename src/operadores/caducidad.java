import java.util.Locale;
import java.util.Scanner;

public class caducidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int cd = sc.nextInt();
        int cm = sc.nextInt();
        int cy = sc.nextInt();

        int ad = sc.nextInt();
        int am = sc.nextInt();
        int ay = sc.nextInt();

        boolean res = (cy < ay) || (cy == ay && cm < am) || (cy == ay && cm == am && cd < ad);

        System.out.println(res);
    }
}