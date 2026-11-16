import java.util.Locale;
import java.util.Scanner;

public class candau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int codi = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        boolean res = false;

        while (n3 != -1){
            if ((n1 + n2) * n3 == codi){
                res = true;
                break;
            }
            n1 = n2;
            n2 = n3;
            n3 = sc.nextInt();
        }
        System.out.println(res);
    }
}