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

        //multiplicamos los bichos de cada uno por el numero de patas de cada bicho
        int insectes = (i * 6);
        int aracnidos = (a * 8);
        int crustacios = (c * 10);

        //primero calculamos las patas por segmentos que tiene cada bicho
        //despues lo multiplicamos por el numero de bichos que tenemos
        int miri = ((s1 * 2) * m1);
        int miri2 = ((s2 * 4)* m2);

        System.out.println(insectes + aracnidos + crustacios + miri + miri2);

    }
}