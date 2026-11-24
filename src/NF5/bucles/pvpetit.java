import java.util.Locale;
import java.util.Scanner;

public class pvpetit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int tot = sc.nextInt();
        int cont = 1;

        int n1 = sc.nextInt();
        int valorp = n1;
        int poscp = cont;

        while(tot > cont){
            int n2 = sc.nextInt();
            cont++;

            if (valorp > n2){
                valorp = n2;
                poscp = cont;
            }
        }
        System.out.println("El nombre més petit és el " +  valorp  + " i es troba a la posició " + poscp);
    }
}