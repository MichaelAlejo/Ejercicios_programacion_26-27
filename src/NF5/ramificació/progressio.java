
import java.util.Locale;
import java.util.Scanner;

public class progressio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int con = 2;
        int serie = n2 - n1;

        while(N > con){
            con++;
            n1 = n2;
            n2 = sc.nextInt();

            if (n2 - n1 == serie){
                break;
            }
            else{
                System.out.println("no");
                return;
            }
        }
        System.out.println("si");
    }
}