import java.util.Locale;
import java.util.Scanner;

public class big_ben {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int H = sc.nextInt();
        int N = sc.nextInt();

        //sumamos la hora actual con las horas que queremos sumar
        // y lo dividimos entre 12 usando % porque queremos quedarnos lo restante de la operacion
        System.out.println((H + N) % 12);


    }
}