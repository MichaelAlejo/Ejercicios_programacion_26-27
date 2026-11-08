
import java.util.Locale;
import java.util.Scanner;

public class handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String A = sc.nextLine();

        if (A.equals("1 0 0 0")){
            System.out.println("saltar");
        }
        else if (A.equals("1 0 0 1")){
            System.out.println("tancar els ulls");
            System.out.println("fer l'ullet");
        }
        else if (A.equals("1 0 1 0")){
            System.out.println("doble parpalleig");
            System.out.println("doble parpalleig");
        }
        else if (A.equals("1 0 1 1")){
            System.out.println("doble parpalleig");
            System.out.println("fer l'ullet");
            System.out.println("fer l'ullet");
        }
        else if (A.equals("1 1 0 0")){
            System.out.println("fer l'ullet");
            System.out.println("tancar els ulls");
        }
        else if (A.equals("1 1 0 1")){
            System.out.println("fer l'ullet");
            System.out.println("doble parpalleig");
            System.out.println("fer l'ullet");
        }
        if (A.equals("1 1 1 0")){
            System.out.println("fer l'ullet");
            System.out.println("fer l'ullet");
            System.out.println("doble parpalleig");
        }
        if (A.equals("1 1 1 1")){
            System.out.println("fer l'ullet");
            System.out.println("fer l'ullet");
            System.out.println("fer l'ullet");
            System.out.println("fer l'ullet");
        }
    }
}