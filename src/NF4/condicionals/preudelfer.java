
import java.util.Locale;
import java.util.Scanner;

public class preudelfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float distancia = sc.nextFloat();
        int dias = sc.nextInt();

        if (distancia > 800.0f && dias > 7){
            float precio = distancia * 0.35f;
            float descuento = precio * 0.3f;
            float fin = precio - descuento;
            System.out.println(fin);
        }
        else {
            float precio = distancia * 0.35f;
            System.out.println(precio);
        }
    }
}