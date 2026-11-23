
import java.util.Locale;
import java.util.Scanner;

public class fulln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int fila = sc.nextInt();
        int columna = sc.nextInt();
        int contf = 0;

        while (fila > contf){
            int contc = 0;
            float tot = 0.0f;
            contf++;
            while(columna > contc){
                int num = sc.nextInt();
                if (columna > contc){
                    System.out.print(num + " ");
                }
                tot = tot + num;
                contc++;
            }
            System.out.println(tot / columna);
        }
    }
}