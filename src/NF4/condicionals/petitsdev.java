
import java.util.Locale;
import java.util.Scanner;

public class petitsdev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();

        if (d1 <= d2)  {
            System.out.println( d1 <= d2 && d2 <= d3);
        }
        else if (d1 >= d2 ) {
            System.out.println( d1 <= d2 && d2 <= d3);

        }

    }
}