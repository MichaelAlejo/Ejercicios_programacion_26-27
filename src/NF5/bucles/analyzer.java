
import java.util.Locale;
import java.util.Scanner;

public class analyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String frase = sc.next();
        int tot = 0;

        while (!frase.equals("END")) {
            if (frase.equals("class")) {
                tot++;
                frase = sc.next();
            }
            else {
                frase = sc.next();
            }
        }
        System.out.println(tot);
    }
}