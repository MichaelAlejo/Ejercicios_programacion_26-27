
import java.util.Locale;
import java.util.Scanner;

public class preudelfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float distancia = sc.nextFloat();
        int dias = sc.nextInt();
        //miramos si el viaje es major que 800km y supera 7 dias
        // para ver si aplica el descuento
        if (distancia > 800.0f && dias > 7){
            //calculamos el precio si cada km es 0.35€
            float precio = distancia * 0.35f;
            //calculamos el descuento y se lo restamos al precio final
            float descuento = precio * 0.3f;
            float fin = precio - descuento;
            System.out.println(fin);
        }
        //si no cumple los requisitos del descuento
        //calculamos el precio normal
        else {
            float precio = distancia * 0.35f;
            System.out.println(precio);
        }
    }
}
