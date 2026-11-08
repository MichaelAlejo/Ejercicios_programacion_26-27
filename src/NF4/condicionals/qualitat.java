
import java.util.Locale;
import java.util.Scanner;

public class qualitat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean T = sc.nextBoolean();
        boolean R = sc.nextBoolean();
        boolean M = sc.nextBoolean();
        boolean E = sc.nextBoolean();
        boolean L = sc.nextBoolean();

        if (T == true){
            System.out.println("L'estat del txasis es: correcte");
        }
        else {
            System.out.println("L'estat del txasis es: defectuos");
        }
        if (R == true){
            System.out.println("L'estat de les rodes es: correcte");
        }
        else {
            System.out.println("L'estat de les rodes es: defectuos");
        }
        if (M == true){
            System.out.println("L'estat del motor es: correcte");
        }
        else {
            System.out.println("L'estat del motor es: defectuos");
        }
        if (E == true){
            System.out.println("L'estat de l'electronica es: correcte");
        }
        else {
            System.out.println("L'estat de l'electronica es: defectuos");
        }
        if (L == true){
            System.out.println("L'estat dels llums és: correcte");
        }
        else {
            System.out.println("L'estat dels llums és: defectuos");
        }
        if (T && R && M && E && L == true) {
            System.out.println("L'estat general del cotxe es: correcte");
        }
        else {
            System.out.println("L'estat general del cotxe es: defectuos");
        }
    }
}