
import java.util.Locale;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        int contador = 0;
        int sig = 1;

        while(n1 > contador){
            if (n1 == 0){
                System.out.println(sig);
                contador++;
            }
        }

    }
}