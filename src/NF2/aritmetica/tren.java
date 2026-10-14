import java.util.Locale;
import java.util.Scanner;

public class tren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        sc.useLocale(Locale.ENGLISH);

        float dt = sc.nextFloat();
        float vt = sc.nextFloat();
        float vo = sc.nextFloat();

        //Con esto calculamos el tiempo que tarda el tren en llegar a la estacion
        float tiempo_tren = dt / vt;

        //Con estee calculamos  la distancia recorrida por el pajaro
        float res = tiempo_tren * vo;
        
        System.out.println(res);
    }
}
