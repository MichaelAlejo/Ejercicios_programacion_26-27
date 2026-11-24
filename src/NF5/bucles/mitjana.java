import java.util.Locale;
import java.util.Scanner;

public class mitjana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int total = sc.nextInt();

        String nombremayor = sc.next();
        float notamayor = sc.nextFloat();

        String nombremenor = nombremayor;
        float notamenor = notamayor;

        int cont = 1;
        float tot = notamayor;

        while(total > cont){
            String sign = sc.next();
            float signn = sc.nextFloat();
            tot = tot + signn;
            cont++;
            if (signn < notamenor) {
                nombremenor = sign;
                notamenor = signn;
            }

            if (signn > notamayor) {
                nombremayor = sign;
                notamayor = signn;
            }
        }
        System.out.println("L'alumne amb major nota és el/la " + nombremayor + " amb un " + notamayor);
        System.out.println("L'alumne amb menor nota és el/la " + nombremenor + " amb un " + notamenor);
        System.out.println("La nota mitjana de la classe és de " + tot / total);
    }
}