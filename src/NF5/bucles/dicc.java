
import java.util.Locale;
import java.util.Scanner;

public class dicc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String frase = sc.next();

        System.out.println("class Dictionari {");
        System.out.println("    String[] words = {");
        while (!frase.equals("__END__")) {
            System.out.println("        " + frase + ",");
            frase = sc.nextLine();
        }
        System.out.println("    };");
        System.out.println("}");
    }
}