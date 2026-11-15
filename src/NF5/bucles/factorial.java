
import java.util.Locale;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        int contador = n1;
        int fin = 1;

        while(contador > 0){
            fin = fin * contador;
            contador--;
        }
        System.out.println(fin);
    }
}