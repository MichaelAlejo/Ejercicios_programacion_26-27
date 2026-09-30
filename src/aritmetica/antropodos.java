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

        int insectes = i * 6;
        int aracnidos = 8;
        int crustacios = 10;
        int miri = 2;
        int miri2 = 4;

        System.out.println(i * insectes);
        System.out.println(a * aracnidos);
        System.out.println(c * crustacios);
        System.out.println(i * s1 * miri);
        System.out.println(i * s2 * miri2);

        System.out.println();
    }
}