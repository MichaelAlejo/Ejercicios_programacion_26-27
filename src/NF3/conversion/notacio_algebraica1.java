import java.util.Locale;
import java.util.Scanner;

public class notacio_algebraica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int c = sc.nextInt();
        int f = sc.nextInt();
        
        //Las letras min en la tabla ASCII comienzan
        // en el valor 97, por lo que sumamos el numero
        //que nos han dado y un valor antes de donde
        //empieza la tabla ascii que es 96 y nos dara la letra
        //corresponiente
        int a_char = c + 96;

        //pasamos la letra a char
        System.out.print((char)a_char);
        System.out.print(f);


    }
}
