import java.util.Locale;
import java.util.Scanner;

public class contando_minutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int H = sc.nextInt();
        int M = sc.nextInt();

        //primero las horas totales de un dia las restamos con la hora actual
        // pasamos estas horas a minutos y las restamos con los minutos actuales
        //para calcular cuantas horas faltan
        int min_faltantes = (24 - H) * 60 - M;

        System.out.println(min_faltantes);

    }
}