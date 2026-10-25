import java.util.Locale;
import java.util.Scanner;

public class mecanogràfica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int ct = sc.nextInt();
        int ce = sc.nextInt();
        int ts = sc.nextInt();

        // Calculamos los caracteres correctos restando los errores
        // al número total de caracteres
        int cc = ct - ce;

        // Calculamos la precisión en porcentaje
        // Convertimos ct a float para que la división
        // no elimine los decimales del resultado
        // Multiplicamos por 100 para obtener el porcentaje
        float precision = (cc/(float)ct) * 100;
        System.out.println((int)precision);
        
        // Calculamos el número de palabras escritas,
        // teniendo en cuenta que el enunciado considera que cada palabra
        // equivale a 5 caracteres, incluidos espacios y signos
        float  velocidad_palabras = ct/5f;
        
        // Convertimos los segundos a minutos
        // Dividimos el tiempo entre 60 para obtener los minutos
        // Usamos 60f para permitir decimales
        float seg_a_min = ts/60f;

        // Dividimos el número de palabras escritas entre el tiempo
        // empleado en minutos para saber cuántas palabras se escriben
        // por minuto
        float velocidad_total = velocidad_palabras/seg_a_min;
        System.out.println((int)velocidad_total);
    }
}
