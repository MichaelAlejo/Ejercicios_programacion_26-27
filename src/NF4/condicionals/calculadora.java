
import java.util.Locale;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int op = sc.nextInt();

        //depende de la opcion escogida hace x operacion
        switch (op) {
            case 1:
                System.out.println("MENU:");
                System.out.println("1.-SUMAR");
                System.out.println("2.-RESTAR");
                System.out.println("3.-MULTIPLICAR");
                System.out.println("4.-DIVIDIR");
                System.out.println("Esculli una opcio:");
                System.out.println(d1 + d2);
                break;

            case 2:
                System.out.println("MENU:");
                System.out.println("1.-SUMAR");
                System.out.println("2.-RESTAR");
                System.out.println("3.-MULTIPLICAR");
                System.out.println("4.-DIVIDIR");
                System.out.println("Esculli una opcio:");
                System.out.println(d1 - d2);
                break;
            case 3:
                System.out.println("MENU:");
                System.out.println("1.-SUMAR");
                System.out.println("2.-RESTAR");
                System.out.println("3.-MULTIPLICAR");
                System.out.println("4.-DIVIDIR");
                System.out.println("Esculli una opcio:");
                System.out.println(d1 * d2);
                break;
            case 4:
                System.out.println("MENU:");
                System.out.println("1.-SUMAR");
                System.out.println("2.-RESTAR");
                System.out.println("3.-MULTIPLICAR");
                System.out.println("4.-DIVIDIR");
                System.out.println("Esculli una opcio:");
                System.out.println(d1 / d2);
                break;
        }
    }
}
