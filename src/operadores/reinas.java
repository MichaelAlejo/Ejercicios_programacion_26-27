import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        sc.useLocale(Locale.ENGLISH);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        boolean fila = x1 == x2;
        boolean columna = y1 == y2;
        
        boolean diagonal = x1 - x2 == y1 - y2 || x1 - x2 == - (y1 - y2);
        
        boolean res = fila || columna || diagonal;
        
        System.out.println(res);

    }
}
