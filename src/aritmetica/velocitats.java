import java.util.Locale;
import java.util.Scanner;

public class velocitats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int vel = sc.nextInt();
        int size = sc.nextInt();
        //1mb=1024kb
        int mb = (1024);
        //pasamos el tamaño en mb a kb
        int siz_fin = (size * mb);
        //dividimos el tamaño total por el tiempo de velocidad para ver cantos segundos tarda
        System.out.println(siz_fin / vel);

    }
}