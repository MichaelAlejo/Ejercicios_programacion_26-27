import java.util.Locale;
import java.util.Scanner;

public class a12calculadora_acc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String op = sc.next();
        float res = 0.0f;

        // Comprobamos si la primera entrada es distinta de "END".
        if (!op.equals("END")) {
            float n1 = sc.nextFloat();
            // Repetimos las operaciones hasta recibir "END".
            while (!op.equals("END")) {
                // Ejecutamos la operación correspondiente según el operador introducido.
                switch (op) {
                    case "+":
                        res = res + n1;
                        break;
                    case "-":
                        res = res - n1;
                        break;
                    case "*":
                        res = res * n1;
                        break;
                    case "/":
                        res = res / n1;
                        break;
                }
                // Mostramos el resultado acumulado después de cada operación.
                System.out.println(res);
                // Leemos el siguiente operador y, si no es END, su número.
                op = sc.next();
                if (!op.equals("END")) {
                    n1 = sc.nextFloat();
                }
            }
        }
        else {
            // Si la primera entrada es END, mostramos el resultado inicial.
            System.out.println(res);
        }
    }
}
