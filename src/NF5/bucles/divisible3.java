
import java.util.Locale;
import java.util.Scanner;

public class divisible3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int contador = A;

        while (contador<B){
            System.out.print(contador);
            contador += 1;
        }
    }
}