import java.util.Locale;
import java.util.Scanner;

public class parejo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();

        // Primero calculamos si es par o no
        // si lo restante de la division es 0 es par
        boolean par = (d1 % 2 == 0);
        boolean par1 = (d2 % 2 == 0);
        boolean par2 = (d3 % 2 == 0);
        
        // Creamos las tres posibilidades para que solo haya un número par.
        // Usamos && para que se cumplan todas las condiciones de cada posibilidad
        // y || para que baste con que se cumpla una de las tres.
        boolean res = (!par && !par1 && par2 || !par && par1 && !par2 || par && !par1 && !par2);

        System.out.println(res);
    }
}
