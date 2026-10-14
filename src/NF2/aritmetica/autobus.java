import java.util.Locale;
import java.util.Scanner;

public class autobus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        Integer n = sc.nextInt();

        // calculamos lo buses tota, y multiplicamos por la capacidad de cada autobus.
        System.out.println((a + b) * n);
    }
}

