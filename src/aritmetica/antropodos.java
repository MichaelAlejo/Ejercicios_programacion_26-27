import java.util.Locale;
import java.util.Scanner;

public class antropodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int i = sc.nextInt();
        sc.nextLine();
        int a = sc.nextInt();
        sc.nextLine();
        int c = sc.nextInt();
        sc.nextLine();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        sc.nextLine();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        int insectes = (i * 6);
        int aracnidos = (a * 8);
        int crustacios = (c * 10);
        int miri = ((s1 * 2) * m1);
        int miri2 = ((s2 * 4)* m2);

        System.out.println(insectes + aracnidos + crustacios + miri + miri2);

    }
}