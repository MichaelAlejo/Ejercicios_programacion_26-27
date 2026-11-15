
import java.util.Locale;
import java.util.Scanner;

public class esalom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String l1 = sc.nextLine();
        int contador = 0;

        while (!l1.equals("META")){
            contador++;
            System.out.println(l1 + " " + contador);
            l1 = sc.nextLine();
        }
    }
}