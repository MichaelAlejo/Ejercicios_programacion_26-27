
import java.util.Locale;
import java.util.Scanner;

public class cuenta_pal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String pal = sc.next();
        int cont = 0;

        while (!pal.equals("END")){
            cont++;
            pal = sc.next();
        }
        System.out.println(cont);
    }
}