
import java.util.Locale;
import java.util.Scanner;

public class sumar_parells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        sc.nextLine();
        int n2 = sc.nextInt();
        int num = n1;
        int contador = 0;
        int fin = 0;

        while (contador < num){
            if (n2 % 2 == 0){
                fin = fin + n2;
            }
            contador ++;
            n2 = sc.nextInt();
        }
        System.out.println(fin);
    }
}