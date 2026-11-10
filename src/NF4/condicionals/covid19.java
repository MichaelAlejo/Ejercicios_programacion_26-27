import java.util.Locale;
import java.util.Scanner;

public class covid19 {
    public static void covid19(String[] args) {
        Scanner sc = new Scanner(System.in);       
        sc.useLocale(Locale.ENGLISH);

        boolean vacuna = sc.nextBoolean();
        boolean prova = sc.nextBoolean();
        
        if (vacuna == true && prova == false){
            System.out.println("Torna a classe");
        }
        else if (vacuna == true && prova == true){
            boolean pcr = sc.nextBoolean();
            if (pcr == false){
                System.out.println("Torna a classe");
            }
            else {
                System.out.println("Quarantena");
            }
        }
        else if(vacuna == false){
            System.out.println("Quarantena");

        }
    }
}
