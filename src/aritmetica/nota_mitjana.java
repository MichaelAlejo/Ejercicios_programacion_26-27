import java.util.Locale;
import java.util.Scanner;

public class nota_mitjana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        //sumamos las notas
        float media = (n1 + n2 + n3);
        // y las dividimos por el total de notas que hay
        System.out.println( media/ 3);

    }
}