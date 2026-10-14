import java.util.Locale;
import java.util.Scanner;

public class un_decimal_parell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float d1 = sc.nextFloat();
        float d2 = sc.nextFloat();
        float d3 = sc.nextFloat();

        int d1e = (int)d1;
        int d2e = (int)d2;
        int d3e = (int)d3;

        boolean parelld1 = d1e % 2 == 0;
        boolean parelld2 = d2e % 2 == 0;
        boolean parelld3 = d3e % 2 == 0;

        boolean res = (!parelld1 && !parelld2 && parelld3 || !parelld1 && parelld2 && !parelld3 || parelld1 && !parelld2 && !parelld3);

        System.out.println(res);

    }
}