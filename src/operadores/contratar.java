import java.util.Locale;
import java.util.Scanner;

public class contratar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean d1 = sc.nextBoolean();
        int d2 = sc.nextInt();
        boolean d3 = sc.nextBoolean();
        int d4 = sc.nextInt();

        // Primero vemos si los años de experiencia son suficientes
        boolean java_yo = (d2 >= 1 );
        boolean py_yo = (d4 >= 3);

        // Vemos si cumple los años y si conoce el lenguaje
        // Y si cumple alguna de las dos da true y sino false
        boolean acept = ((d1 && java_yo) || (d3 && py_yo));

        System.out.println(acept);
    }
}
