import java.util.Locale;
import java.util.Scanner;

public class contrasenya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String contra = sc.nextLine();

        boolean lon =  contra.length() >= 8;

        boolean mayus = !contra.equals(contra.toLowerCase());
        boolean minus = !contra.equals(contra.toUpperCase());

        boolean caracter1 = contra.contains("*");
        boolean caracter2 = contra.contains("&");
        boolean caracter3 = contra.contains("%");
        boolean caracter4 = contra.contains("#");
        boolean charsi = caracter1 || caracter2 || caracter3 || caracter4;

        boolean espaciosi = contra.equals(contra.trim());

        System.out.println(lon && mayus && minus && charsi && espaciosi);

    }
}
