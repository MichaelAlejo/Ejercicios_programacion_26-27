import java.util.Locale;
import java.util.Scanner;

public class paella {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int c = sc.nextInt();
        float a = sc.nextFloat();
        float g = sc.nextFloat();
        float pers = (4);
        float pers_arr = 0.50f;
        float pers_gam = 0.25f;


        float arr_tot = ((pers_arr * c)/pers);
        float gam_tot = ((pers_gam * c)/pers);
        float eur_arr = (arr_tot * a);
        float eur_gam = (gam_tot * g);
        float total = (eur_arr + eur_gam);

        System.out.println(arr_tot + " kg arros");
        System.out.println(gam_tot + " kg gambes");
        System.out.println(eur_arr + " euros arros");
        System.out.println(eur_gam + " euros gambes");
        System.out.println("TOTAL: " + total + " euros" );

    }
}