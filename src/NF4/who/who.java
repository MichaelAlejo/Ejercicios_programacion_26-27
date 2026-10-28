package NF4.who;

import java.util.Locale;
import java.util.Scanner;

public class who {
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


    }
}