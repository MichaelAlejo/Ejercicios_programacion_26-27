import java.util.Locale;
import java.util.Scanner;

public class lletradni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String P1= sc.nextLine();

        String num1 = P1.substring(0,8);
        int num_ent1 = Integer.parseInt(num1);
        String letra_dni = P1.substring(8);

        int num1_mod = num_ent1 % 23;

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        String letra_calculada = letras.substring(num1_mod, num1_mod + 1);

        boolean coincide = letra_calculada.equals(letra_dni);

        System.out.println(letra_calculada);

    }
}
