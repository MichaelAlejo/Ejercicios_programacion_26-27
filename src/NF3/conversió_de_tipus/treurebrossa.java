import java.util.Locale;
import java.util.Scanner;

public class treurebrossa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String P1= sc.nextLine();
        String P2= sc.nextLine();

        // Quitamos el primer carácter de P1, porque el enunciado
        // indica que el primer número tiene una letra al principio
        // que debemos eliminar para quedarnos solo con el número
        String num1 = P1.substring(1);

        // Quitamos los dos últimos caracteres de P2, porque el enunciado
        // indica que el segundo número tiene dos letras al final
        // que debemos eliminar para quedarnos solo con el número
        //ademas de que la longitud de la frase puede variar
        //por lo que medimos la longitud y a esta le restamos dos 
        //que son los caracteres que sobran
        String num2 = P2.substring(0,P2.length() -2);
        
        //los convertimos a int
        int num1_ent = Integer.parseInt(num1);
        int num2_ent = Integer.parseInt(num2);

        System.out.println(num1_ent + num2_ent);
    }
}
