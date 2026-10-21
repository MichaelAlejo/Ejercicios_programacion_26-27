import java.util.Locale;
import java.util.Scanner;

public class treurebrossa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String P1= sc.nextLine();
        String P2= sc.nextLine();

        String num1 = P1.substring(1);
        String num2 = P2.substring(0,P2.length() -2);

        int num1_ent = Integer.parseInt(num1);
        int num2_ent = Integer.parseInt(num2);

        System.out.println(num1_ent + num2_ent);
    }
}
