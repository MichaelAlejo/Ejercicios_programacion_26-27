
import java.util.Locale;
import java.util.Scanner;

public class vocals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        int cont = 0;

        while (n > cont){
            String letra = sc.next();
            cont++;
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u") ){
                System.out.println(letra);
            }
        }

    }
}