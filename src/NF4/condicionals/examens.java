import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void examens(String[] args) {
        Scanner sc = new Scanner(System.in);       
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();

        if ((n1 >= 5.0f || n2 >= 5.0f || n3 >= 5.0f) == false){
            System.out.println("No s'ha aprovat cap examen.");
        }
        else if ((!(n1 >= 5.0f) && !(n2 >= 5.0f) && (n3 >= 5.0f)) || (!(n1 >= 5.0f) && (n2 >= 5.0f) && !(n3 >= 5.0f)) || ((n1 >= 5.0f) && !(n2 >= 5.0f) && !(n3 >= 5.0f))){
            System.out.println("S'ha aprovat un examen.");
        }
        else if ((n1 >= 5.0f && n2 >= 5.0f && n3 >= 5.0f) == true){
            System.out.println("S'han aprovat tots els exàmens.");
        }
        else{
            System.out.println("S'han aprovat dos exàmens.");
        }
    }
}
