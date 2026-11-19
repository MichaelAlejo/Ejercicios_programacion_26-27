
import java.util.Locale;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int cont = 0;

        while (N > cont){
            int n3 = n1 + n2;
            System.out.print(n3 + " " );
           n1 = n2;
           n2 = n3;
           cont ++;

        }


    }
}