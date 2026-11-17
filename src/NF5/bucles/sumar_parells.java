
import java.util.Locale;
import java.util.Scanner;

public class sumar_parells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int tot = sc.nextInt();
        int n1 = sc.nextInt();
        int res = 0;
        int cont = 1;

        while(tot >= cont){
            cont++;
            if (n1 % 2 == 0){
                res = res + n1;
            }
            if (tot >= cont){
                n1 = sc.nextInt();
            }
        }
        System.out.println(res);
    }
}