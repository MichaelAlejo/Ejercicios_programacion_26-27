import java.util.Locale;
import java.util.Scanner;

public class venda_llibr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        sc.useLocale(Locale.ENGLISH);

        String libros = sc.nextLine();
        String V = libros.substring(0,1);
        String S = libros.substring(1,2);
        String D = libros.substring(2);
        int viernes = Integer.parseInt(V);
        int sabado = Integer.parseInt(S);
        int domingo = Integer.parseInt(D);
        int lib_tot = viernes + sabado + domingo;

        if (viernes > sabado && viernes > domingo){
            System.out.println("La quantitat total de llibres venuts és: " + lib_tot);
            System.out.println("El dia amb més ventes ha sigut: Divendres");
        }
        else if (sabado > viernes && sabado > domingo){
            System.out.println("La quantitat total de llibres venuts és: " + lib_tot);
            System.out.println("El dia amb més ventes ha sigut: Dissabte");
        }
        else if (domingo > viernes && domingo >= sabado){
            System.out.println("La quantitat total de llibres venuts és: " + lib_tot);
            System.out.println("El dia amb més ventes ha sigut: Diumenge");
        }
        
    }
}
