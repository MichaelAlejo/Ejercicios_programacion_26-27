import java.util.Locale;
import java.util.Scanner;

public class paella {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int c = sc.nextInt();
        float a = sc.nextFloat();
        float g = sc.nextFloat();

        float arros_total = (c * 0.5f) / 4;
        float gambes_total = (c * 0.25f) / 4;

        float precio_arroz = (arros_total * a);
        float precio_gamb = (gambes_total * g);
        float precio_tot = (precio_arroz + precio_gamb);

        System.out.println(arros_total + " kg arros");
        System.out.println(gambes_total + " kg gambes");
        System.out.println(precio_arroz + " euros arros");
        System.out.println(precio_gamb + " euros gambes");
        System.out.println("TOTAL: " + precio_tot + " euros");

    }
}