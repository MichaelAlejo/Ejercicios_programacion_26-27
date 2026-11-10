import java.util.Locale;
import java.util.Scanner;

public class class_triangle {
    public static void class_triangle(String[] args) {
        Scanner sc = new Scanner(System.in);       
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        if (n1 == n2 && n2 == n3 && n1 == n3){
            System.out.println("Equilàter");
        }
        else if (n1 == n2 || n2 == n3 || n1 == n3){
            System.out.println("Isòsceles");
        }
        else {
            System.out.println("Escalè");
        }
    }
}
