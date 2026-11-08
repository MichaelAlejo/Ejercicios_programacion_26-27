
import java.util.Locale;
import java.util.Scanner;

public class llumsh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean llums = sc.nextBoolean();
        boolean llums2 = sc.nextBoolean();
        boolean llums3 = sc.nextBoolean();

        //miramos si todas las luces estan apagadas 
        if ((llums || llums2 || llums3) == false) {
            System.out.println("No s'ha encès cap llum.");
        }
        //miramos si estan las tres luces encendidas
        else if ((llums && llums2 && llums3) == true ) {
            System.out.println("S'han encès totes les llums.");
        }
        //miramos si solo hay una luz encendida revisando tres casos
        //y si uno da true es que solo hay una
        else if ((llums && !llums2 && !llums3 || !llums && llums2 && !llums3 || !llums && !llums2 && llums3) == true) {
            System.out.println("Només hi ha un llum encès.");
        }
        // Si no se cumple ninguna condición anterior, significa que hay dos luces encendidas.
        else {
            System.out.println("S'han encès dues llums.");
        }

    }
}
