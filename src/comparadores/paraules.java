import java.util.Locale;
import java.util.Scanner;

public class paraules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String p1 = sc.nextLine();
        String p2 = sc.nextLine();

        boolean res = p1 .equals (p2);

        System.out.println(res);
    }
}