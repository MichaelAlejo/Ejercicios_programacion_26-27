import java.util.Locale;
import java.util.Scanner;

public class ppt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String part = sc.nextLine();
        int j1 = 0;
        int j2 = 0;

        // Repetimos el bucle hasta recibir "END".
        while (!part.equals("END")) {
            String j1m = part.substring(0,1);
            String j2m = part.substring(1);
            // Comprobamos la jugada del jugador 1 cuando utiliza "@".
            if (j1m.equals("@")) {
                // Si el jugador 2 utiliza "%", gana el jugador 1.
                if (j2m.equals("%")) {
                    j1++;
                }
                // Si ambos utilizan "@", hay empate y nadie suma puntos.
                else if (j1m.equals("@") && j2m.equals("@")) {
                    j1 = j1 + 0;
                    j2 = j2 + 0;
                }
                // En cualquier otro caso, gana el jugador 2.
                else {
                    j2++;
                }
            }
            if (j1m.equals("%")) {
                if (j2m.equals("#")) {
                    j1++;
                }
                else if (j1m.equals("%") && j2m.equals("%")) {
                    j1 = j1 + 0;
                    j2 = j2 + 0;
                }
                else {
                    j2++;
                }
            }
            if (j1m.equals("#")) {
                if (j2m.equals("@")) {
                    j1++;
                }
                else if (j1m.equals("#") && j2m.equals("#")) {
                    j1 = j1 + 0;
                    j2 = j2 + 0;
                }
                else {
                    j2++;
                }
            }
            // Leemos la siguiente partida.
            part = sc.nextLine();
        }
        // Comparamos los puntos para determinar el ganador o el empate.
        if (j1 > j2) {
            System.out.println(1);
        }
        else if (j2 > j1) {
            System.out.println(2);
        }
        else {
            System.out.println("-");
        }
    }
}
