
import java.util.Locale;
import java.util.Scanner;

public class aprova {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int cont = 0;

        while (n > cont){
            String nombre = sc.next();
            String apellido = sc.next();
            float nota = sc.nextFloat();
            cont++;

            if (nota >= 5.0f){
                System.out.println(nombre + " " + apellido + ": aprova");
            }
            else {
                System.out.println(nombre + " " + apellido + ": suspèn");
            }
        }

    }
}