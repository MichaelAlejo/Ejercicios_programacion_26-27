
import java.util.Locale;
import java.util.Scanner;

public class repeatX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int A = sc.nextInt();
        int contador = 0;

        while (contador<A){
            System.out.print(A);
            contador += 1;
        }
    }
}