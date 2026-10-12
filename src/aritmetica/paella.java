import java.util.Locale;
import java.util.Scanner;

public class paella {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int c = sc.nextInt();
        float a = sc.nextFloat();
        float g = sc.nextFloat();

        // Multiplicamos los comensales por los kilos de arroz y dividimos entre 4,    
        // porque los 0.5 kg de arroz son para 4 personas
        // lo mismo para gambas pero con sus datos
        float arros_total = (c * 0.5f) / 4;
        float gambes_total = (c * 0.25f) / 4;

        // Calculamos el precio de cada ingrediente y el coste total
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
