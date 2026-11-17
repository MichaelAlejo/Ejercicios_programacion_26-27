import java.util.Locale;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        int fin = 1;

        while(n1 > 0){
            fin = fin * n1;
             n1--;
        }
        System.out.println(fin);
    }
}
