
import java.util.Locale;
import java.util.Scanner;

public class atura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String senyal = sc.nextLine();
        int pasajeros = sc.nextInt();
        boolean obst = sc.nextBoolean();
        
        // Si el semáforo está en verde, hay pasajeros y hay obstáculos, el tren debe parar
        if (senyal.equals("verd") && pasajeros > 0 && obst == true)  {
            System.out.println("ATURAR");
        }
        // Si el semáforo está en amarillo, hay pasajeros y hay obstáculos, el tren debe parar
        else if (senyal.equals("groc") && pasajeros > 0 && obst == true) {
            System.out.println("ATURAR");
        }
        // Si el semáforo está en rojo, el tren siempre debe parar, independientemente de los pasajeros y los obstáculos
        else if (senyal.equals("vermell")) {
            System.out.println("ATURAR");
        }
         // Para cualquier otra combinación, el tren puede continuar
        else {
            System.out.println("CONTINUAR");
        }


    }
}
