import java.util.Locale;
import java.util.Scanner;

public class velocitats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int vel = sc.nextInt();
        int size = sc.nextInt();
        int mb = (1024);
        int siz_fin = (size * mb);


        System.out.println(siz_fin / vel);

    }
}