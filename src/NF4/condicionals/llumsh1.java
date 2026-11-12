import java.util.Locale;
import java.util.Scanner;

public class llumsh1 {
    public static void llumsh1(String[] args) {
        Scanner sc = new Scanner(System.in);       
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        boolean l1 = sc.nextBoolean();
        boolean l2 = sc.nextBoolean();
        boolean l3 = sc.nextBoolean();
        int contador = 0;

        if (l1 == true){
            contador ++;
        }
        if (l2 == true){
            contador ++;
        }
        if (l3 == true){
            contador ++;
        }
        
        switch (contador){
            case 0:
                System.out.println("No s'ha encès cap llum.");
                break;
            case 1:
                System.out.println("Només hi ha un llum encès.");
                break;
            case 2:
                System.out.println("S'han encès dues llums.");
                break;                
            case 3:
                System.out.println("S'han encès totes les llums.");
                break;        
            
        }
    }
}
