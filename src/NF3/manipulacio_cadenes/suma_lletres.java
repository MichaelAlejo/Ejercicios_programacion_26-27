import java.util.Locale;
import java.util.Scanner;

public class suma_lletres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String p = sc.nextLine();
        
        // Extraemos cada carácter de la cadena de texto
        // indicando su posición, empezando desde la posición 0
        char p1 = p.charAt(0);
        char p2 = p.charAt(1);
        char p3 = p.charAt(2);
        char p4 = p.charAt(3);
        char p5 = p.charAt(4);

        System.out.println(p1 + p2 + p3 + p4 + p5);
    }
}
