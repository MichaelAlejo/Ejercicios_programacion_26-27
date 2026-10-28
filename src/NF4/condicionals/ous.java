
import java.util.Locale;
import java.util.Scanner;

public class ous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int huevos = sc.nextInt();

        if (huevos % 24 == 0) {
            System.out.println((huevos / 24) + " " + (huevos % 24));
        }
        else if (huevos == 0) {
            System.out.println((huevos / 2) + " " + (huevos % 0));

        }
        else {
            int hueveras = huevos / 24 + 1;
            int huevosrest = 24 - (huevos % 4);
            System.out.println(hueveras + " " + huevosrest);
        }

    }
}