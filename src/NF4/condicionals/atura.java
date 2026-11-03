
import java.util.Locale;
import java.util.Scanner;

public class atura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String senyal = sc.nextLine();
        int pasajeros = sc.nextInt();
        boolean obst = sc.nextBoolean();

        if (senyal.equals("verd") && pasajeros > 0 && obst == true)  {
            System.out.println("ATURAR");
        }
        else if (senyal.equals("groc") && pasajeros > 0 && obst == true) {
            System.out.println("ATURAR");
        }
        else if (senyal.equals("vermell")) {
            System.out.println("ATURAR");
        }
        else {
            System.out.println("CONTINUAR");
        }


    }
}