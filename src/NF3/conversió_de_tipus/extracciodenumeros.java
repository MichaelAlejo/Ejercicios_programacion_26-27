import java.util.Locale;
import java.util.Scanner;

public class extracciodenumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String P1= sc.nextLine();
        
        //cortamos de los string dichos valores
        //como en el primer caso que cortamos
        //desde el espacio 1 hasta el 2, pero
        //este no se incluye, y lo mismo a los demas
        String num1 = P1.substring(1,2);
        String num2 = P1.substring(3,4);
        String num3 = P1.substring(5,6);
        String num4 = P1.substring(7);

        //aqui los pasamos a int y despues los sumamos
        int num_ent1 = Integer.parseInt(num1);
        int num_ent2 = Integer.parseInt(num2);
        int num_ent3 = Integer.parseInt(num3);
        int num_ent4 = Integer.parseInt(num4);


        System.out.println(num_ent1 + num_ent2 + num_ent3 + num_ent4);

    }
}
