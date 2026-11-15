
import java.util.Locale;
import java.util.Scanner;

public class line_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String A = sc.nextLine();
        int contador = 0;

        while (!A.equals("END")){
            if (contador < 9){
                contador ++;
                System.out.println(" " + contador + " | " + A);
                A = sc.nextLine();
            }
            else{
                contador ++;
                System.out.println(contador + " | " + A);
                A = sc.nextLine();
            }
        }
    }
}