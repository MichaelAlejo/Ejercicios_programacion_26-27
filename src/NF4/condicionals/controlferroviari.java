import java.util.Locale;
import java.util.Scanner;

public class controlferroviari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String color = sc.nextLine();
        boolean freno = sc.nextBoolean();
        int orden = sc.nextInt();

        if (color.equals("verd") && freno == false && orden == 0) {
            System.out.println("Estat del semàfor (vermell, ambar, verd): ");
            System.out.println("Fre d'emergència? (true, false): ");
            System.out.println("Ordres del centre de control (0, 1, 2): ");
            System.out.println("El tren pot continuar");
        }
        else if (color.equals("àmbar") && freno == false && orden == 0) {
            System.out.println("Estat del semàfor (vermell, ambar, verd): ");
            System.out.println("Fre d'emergència? (true, false): ");
            System.out.println("Ordres del centre de control (0, 1, 2): ");
            System.out.println("El tren pot continuar");
        }
        else {
            System.out.println("Estat del semàfor (vermell, ambar, verd): ");
            System.out.println("Fre d'emergència? (true, false): ");
            System.out.println("Ordres del centre de control (0, 1, 2): ");
            System.out.println("El tren s'ha d'aturar!!");
        }

    }
}