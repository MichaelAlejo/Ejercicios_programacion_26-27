import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        String dia = sc.nextLine();
        
        if (dia.equals("Dilluns") || dia.equals("Dimarts") || dia.equals("Dimecres") || dia.equals("Dijous") || dia.equals("Divendres")){
            System.out.println("8:00");
        }
        else {
            System.out.println("10:00");
        }
    }
}
