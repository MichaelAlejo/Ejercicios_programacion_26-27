import java.util.Locale;
import java.util.Scanner;

public class treurebrossadec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String P1= sc.nextLine();
        String P2= sc.nextLine();

        String num1 = P1.substring(1);
        String num2 = P2.substring(0,P2.length() -2);

        float num1_ent = Float.parseFloat(num1);
        float num2_ent = Float.parseFloat(num2);

        System.out.println(num1_ent + num2_ent);
    }
}
