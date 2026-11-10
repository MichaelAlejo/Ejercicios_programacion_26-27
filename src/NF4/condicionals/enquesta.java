import java.util.Locale;
import java.util.Scanner;

public class enquesta {
    public static void enquesta(String[] args) {
        Scanner sc = new Scanner(System.in);       
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        String resp = sc.next();
        
        if (resp.equals("no")){
            System.out.println("Benvingut a l'enquesta.");
            System.out.println("Coneixes algun framework?");
            System.out.println("Gracies per contestar");
        }
        else if (resp.equals("si")){
            String fram = sc.next();
            System.out.println("Benvingut a l'enquesta.");
            System.out.println("Coneixes algun framework?");
            System.out.println("Quin?");
            System.out.println("S'ha registrat la resposta: " + fram);
            System.out.println("Gracies per contestar");

            
        }
    }
}
