import java.util.Locale;
import java.util.Scanner;

public class a18mitjana {
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

        // Repetimos hasta haber leído las notas de todos los alumnos.
        while (total > cont) {
            String sign = sc.next();
            float signn = sc.nextFloat();
            // Acumulamos las notas para calcular posteriormente la media.
            tot = tot + signn;
            cont++;
            // Comprobamos si la nota actual es inferior a la menor registrada.
            if (signn < notamenor) {
                nombremenor = sign;
                notamenor = signn;
            }
            // Comprobamos si la nota actual es superior a la mayor registrada.
            if (signn > notamayor) {
                nombremayor = sign;
                notamayor = signn;
            }
        }
        // Mostramos el alumno con la nota más alta y el de la más baja.
        System.out.println("L'alumne amb major nota és el/la " + nombremayor + " amb un " + notamayor);
        System.out.println("L'alumne amb menor nota és el/la " + nombremenor + " amb un " + notamenor);
        // Dividimos la suma de todas las notas entre el número total de alumnos.
        System.out.println("La nota mitjana de la classe és de " + tot / total);
    }
}
