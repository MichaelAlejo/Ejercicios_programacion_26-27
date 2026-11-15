
import java.util.Locale;
import java.util.Scanner;

public class suma_parells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        int contador = 0;
        int suma = 0;
        int producto = 1;

        while (n1 != -1){
            contador++;
            if (n1 % 2 == 0){
                suma = suma + n1;
            }
            else {
                producto = producto * n1;
            }
            n1 = sc.nextInt();
        }
        System.out.println(suma);
        System.out.println(producto);
        System.out.println(contador);
    }
}