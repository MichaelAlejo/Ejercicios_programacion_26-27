import java.util.Locale;
import java.util.Scanner;

public class contando_minutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int H = sc.nextInt();
        int M = sc.nextInt();

        int min_faltantes = (24 - H) * 60 - M;

        System.out.println(min_faltantes);

    }
}