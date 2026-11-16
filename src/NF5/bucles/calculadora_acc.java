import java.util.Locale;
import java.util.Scanner;

public class calculadora_acc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String op = sc.next();
        float n1 = sc.nextFloat();
        float res = 0.0f;

        while(!op.equals("END")){
            switch (op){
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
            System.out.println(res);
            op = sc.next();
            n1 = sc.nextFloat();
        }

    }
}