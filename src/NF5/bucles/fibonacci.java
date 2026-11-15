
import java.util.Locale;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        int contador = 1;
        int fin = 0;

        while(fin <= n1){
            fin = contador + fin;

        }

    }
}