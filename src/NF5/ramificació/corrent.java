import java.util.Locale;
import java.util.Scanner;

public class corrent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String res = "CORRECTE";

        while (n2 != 0){
            if (n1 < n2){
                n1 = n2;
                n2 = sc.nextInt();
                if(n2 != 0) {
                    if (n1>n2){
                        n1 = n2;
                        n2 = sc.nextInt();
                    }
                    else {
                        res = "INCORRECTE";
                        break;
                    }
                }
            }
            else {
                res = "INCORRECTE";
                break;
            }
        }
        System.out.println(res);
    }
}