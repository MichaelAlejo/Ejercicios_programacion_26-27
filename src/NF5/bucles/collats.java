
import java.util.Locale;
import java.util.Scanner;

public class collats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        int contador = 0;

        while(n1 != 1){
            if (n1 % 2 == 0){
                n1 = n1 / 2;
                contador++;
            }
            else if (n1 % 2 == 1){
                n1 = (n1 * 3) + 1;
                contador++;
            }

        }
        System.out.println(contador);

    }
}