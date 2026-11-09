import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int edad = sc.nextInt();
        String gen = sc.next();
        boolean arracad = sc.nextBoolean();
        boolean vestit = sc.nextBoolean();
        boolean vip = sc.nextBoolean();
        
        if (((edad >= 18) && gen.equals("home") && (arracad == false) && (vestit == true)) == true){
            System.out.println("ENTRA");
        } 
        else if ((((edad >= 18) && gen.equals("dona") && (vestit == true)) == true)){
            System.out.println("ENTRA");
        }
        else if (vip == true){
            System.out.println("ENTRA");
        }
        else {
            System.out.println("NO ENTRA");
        }

    }
}
