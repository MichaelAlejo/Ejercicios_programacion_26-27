package NF4.condicionals;

import java.util.Locale;
import java.util.Scanner;

public class saluda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String idioma = sc.nextLine();

        if (idioma.equals("French")) {
            System.out.println("Bonjour");
        }
        else if (idioma.equals("Spanish")) {
            System.out.println("Hola");
        }
        else if (idioma.equals("Russian")) {
            System.out.println("Hola");
        }
        else if (idioma.equals("Chinese")) {
            System.out.println("Hola");
        }
        else if (idioma.equals("Japanese")) {
            System.out.println("Hola");
        }



    }
}