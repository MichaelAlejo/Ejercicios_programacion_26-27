
import java.util.Locale;
import java.util.Scanner;

public class liniadepunts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int puntos = sc.nextInt();
        int contador = 0;

        while (contador<puntos){
            contador += 1;
            System.out.print(".");
        }

    }
}