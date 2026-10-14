import java.util.Locale;
import java.util.Scanner;

public class caducidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int cd = sc.nextInt();
        int cm = sc.nextInt();
        int cy = sc.nextInt();

        int ad = sc.nextInt();
        int am = sc.nextInt();
        int ay = sc.nextInt();

        // Comprobamos si la fecha de caducidad es anterior a la fecha actual. 
        // Primero comparamos los años si son iguales, comparamos los meses 
        // y si también son iguales, comparamos los días. 
        // Usamos || porque basta con que se cumpla uno de los casos, 
        // y && porque deben cumplirse todas las condiciones de cada caso.
        boolean res = (cy < ay) || (cy == ay && cm < am) || (cy == ay && cm == am && cd < ad);

        System.out.println(res);
    }
}
