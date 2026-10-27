import java.util.Locale;
import java.util.Scanner;

public class contrasenya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String contra = sc.nextLine();
        
        // Comprobamos que la contraseña tenga una longitud mínima de 8 caracteres
        boolean lon =  contra.length() >= 8;

        // Comprobamos que la contraseña tenga al menos una letra mayúscula
        // Si la contraseña es igual que su versión en minúsculas, no tiene mayúsculas
        boolean mayus = !contra.equals(contra.toLowerCase());

        // Comprobamos que la contraseña tenga al menos una letra minúscula
        // Si la contraseña es igual que su versión en mayúsculas, no tiene minúsculas
        boolean minus = !contra.equals(contra.toUpperCase());

        // Comprobamos si la contraseña contiene estos carácter especial
        boolean caracter1 = contra.contains("*");
        boolean caracter2 = contra.contains("&");
        boolean caracter3 = contra.contains("%");
        boolean caracter4 = contra.contains("#");
        
        // Comprobamos que la contraseña contenga al menos uno de los cuatro caracteres especiales
        // El operador || permite que se cumpla cualquiera de las condiciones
        boolean charsi = caracter1 || caracter2 || caracter3 || caracter4;

        // Comprobamos que la contraseña no tenga espacios al principio ni al final
        // trim() elimina los espacios que hay al principio y al final del texto
        boolean espaciosi = contra.equals(contra.trim());

        System.out.println(lon && mayus && minus && charsi && espaciosi);

    }
}
