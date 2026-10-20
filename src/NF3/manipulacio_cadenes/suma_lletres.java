import java.util.Locale;
import java.util.Scanner;

public class suma_lletres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String p = sc.nextLine();

        char p1 = p.charAt(0);
        char p2 = p.charAt(1);
        char p3 = p.charAt(2);
        char p4 = p.charAt(3);
        char p5 = p.charAt(4);

        int p1n = (int)p1;
        int p2n = (int)p2;
        int p3n = (int)p3;
        int p4n = (int)p4;
        int p5n = (int)p5;

        System.out.println(p1n + p2n + p3n + p4n + p5n);
    }
}
