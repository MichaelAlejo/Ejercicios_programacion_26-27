
import java.util.Locale;
import java.util.Scanner;

public class llumsh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean llums = sc.nextBoolean();
        boolean llums2 = sc.nextBoolean();
        boolean llums3 = sc.nextBoolean();

        if ((llums || llums2 || llums3) == false) {
            System.out.println("No s'ha encès cap llum.");
        }
        else if ((llums && llums2 && llums3) == true ) {
            System.out.println("S'han encès totes les llums.");
        }
        else if ((llums && !llums2 && !llums3 || !llums && llums2 && !llums3 || !llums && !llums2 && llums3) == true) {
            System.out.println("Només hi ha un llum encès.");
        }
        else {
            System.out.println("S'han encès dues llums.");
        }

    }
}