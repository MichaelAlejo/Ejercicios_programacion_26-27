import java.util.Locale;
import java.util.Scanner;

public class primer_decimal_parell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float d1 = sc.nextFloat();

        // Multiplicamos el número por 10 y lo convertimos a int
        // para eliminar los decimales que quedan después del primero
        // Después usamos % 10 para obtener únicamente el primer decimal
        // que sera el resto de la division entre 10
        int parelld1 = (int)(d1 * 10) % 10;

        boolean res = parelld1 % 2 == 0;


        System.out.println(res);

    }
}
