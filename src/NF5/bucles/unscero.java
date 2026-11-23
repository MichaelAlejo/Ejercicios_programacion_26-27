
import java.util.Locale;
import java.util.Scanner;

public class unscero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int fila = sc.nextInt();
        int columna = sc.nextInt();
        int contf = 0;
        int u = 0;
        int c = 0;

        while(fila > contf){
            contf++;
            int contc = 0;
            while(columna > contc){
                int num  = sc.nextInt();
                if (num == 1){
                    u++;
                }
                if (num == 0){
                    c++;
                }
                contc++;
            }
            sc.nextLine();
        }
        System.out.println(c + " " + u);

    }
}