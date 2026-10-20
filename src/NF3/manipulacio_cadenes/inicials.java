import java.util.Locale;
import java.util.Scanner;

public class inicials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String N = sc.next();
        String A = sc.next();

        String NM = N.toUpperCase();
        String AM = A.toUpperCase();

        char NF = NM.charAt(0);
        char AF = AM.charAt(0);

        System.out.println(NF + "" + AF);



    }
}
