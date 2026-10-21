import java.util.Locale;
import java.util.Scanner;

public class lletradni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String P1= sc.nextLine();

        String num1 = P1.substring(0,8);
        int num_ent1 = Integer.parseInt(num1);

        int num1_mod = num_ent1 % 23;

        System.out.println(num1_mod);

    }
}
