import java.util.Locale;
import java.util.Scanner;

public class impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();

        // Primero calculamos si es par o no
        // si lo restante de la division es 1 es par
        boolean sen = (d1 % 2 == 1);
        boolean sen1 = (d2 % 2 == 1);
        boolean sen2 = (d3 % 2 == 1);

        // Comprobamos si los tres números son impares o si los tres son pares.
        // Usamos && para exigir que se cumplan todas las condiciones de cada caso
        // y || para que baste con que se cumpla uno de los dos casos.
        boolean res = (sen && sen1 && sen2 || !sen && !sen1 && !sen2);

        System.out.println(res);
    }
}
