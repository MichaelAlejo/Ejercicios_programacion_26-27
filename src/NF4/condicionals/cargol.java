import java.util.Locale;
import java.util.Scanner;

public class cargol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int mida = sc.nextInt();
        
        if (mida >= 1 && mida < 3){
            System.out.println("petit");
        }
        else if (mida >= 3 && mida < 5){
            System.out.println("mitja");
        }
        else if (mida >= 5 && mida < 8){
            System.out.println("gran");
        }        
        else if (mida >= 8 && mida <= 10){
            System.out.println("molt gran");
        }
        else {
            System.out.println("mida incorrecta");
        }
    }
}
