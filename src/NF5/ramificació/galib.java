import java.util.Locale;
import java.util.Scanner;

public class galib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float altura = sc.nextFloat();
        int puentes = sc.nextInt();
        float altura_p = sc.nextFloat();
        int cont = 1;

        while (altura <= altura_p){
            cont++;
            altura_p = sc.nextFloat();
            if (puentes <= cont){
                return;
            }
        }
        System.out.println("xoca amb el pont " + cont );
    }
}