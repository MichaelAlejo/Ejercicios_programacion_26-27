
import java.util.Locale;
import java.util.Scanner;

public class cuenta_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int num = sc.nextInt();
        int cont = 0;

        while (num != 0){
            cont++;
            num = sc.nextInt();
        }
        System.out.println(cont);
    }
}