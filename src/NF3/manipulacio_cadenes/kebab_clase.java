import java.util.Locale;
import java.util.Scanner;

public class kebab_clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String pal = sc.nextLine();

        //pasamos a minusculas
        String palm = pal.toLowerCase();
        
        //remplazamos todoslos espacios por -
        String espacios =  palm.replace(" " , "-");

        System.out.println(espacios);

    }
}
