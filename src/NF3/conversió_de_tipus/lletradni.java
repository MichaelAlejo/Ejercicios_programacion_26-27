import java.util.Locale;
import java.util.Scanner;

public class lletradni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String P1= sc.nextLine();

        // Extraemos los primeros 8 caracteres del DNI,
        // que corresponden a la parte numérica
        String num1 = P1.substring(0,8);

        //lo converitmos a int
        int num_ent1 = Integer.parseInt(num1);

        // Extraemos el carácter que ocupa la posición 8,
        // que corresponde a la letra final del DNI
        String letra_dni = P1.substring(8);

        // Calculamos el resto de dividir el número del DNI entre 23
        // El resultado será un número entre 0 y 22
        // que corrspondra a una letra de dni
        int num1_mod = num_ent1 % 23;

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        // Extraemos de la variable letras la letra que corresponde
        // al valor obtenido en el módulo anterior.
        // El primer parámetro indica la posición donde empezamos
        // y el segundo indica dónde acaba la extracción, sin incluir esa posición.
        // Por eso sumamos 1 al módulo para extraer únicamente una letra.
        String letra_calculada = letras.substring(num1_mod, num1_mod + 1);

        // Comprobamos si la letra calculada coincide con la letra
        // que aparece en el DNI
        // con .equals compara el contenido de las dos cadenas de texto
        //y dice si coinciden o no
        boolean coincide = letra_calculada.equals(letra_dni);

        System.out.println(coincide);

    }
}
