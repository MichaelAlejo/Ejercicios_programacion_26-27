import java.util.Locale;
import java.util.Scanner;

public class decimal_senars_o_cap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float d1 = sc.nextFloat();
        float d2 = sc.nextFloat();
        float d3 = sc.nextFloat();

        int d1e = (int)d1;
        int d2e = (int)d2;
        int d3e = (int)d3;

        boolean senar = d1e % 2 == 1;
        boolean senar2 = d2e % 2 == 1;
        boolean senar3 = d3e % 2 == 1;

        boolean res = (!senar && !senar2 && !senar3 || senar && senar2 && senar3);

        System.out.println(res);

    }
}