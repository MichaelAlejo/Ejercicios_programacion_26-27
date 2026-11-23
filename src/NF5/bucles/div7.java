
import java.util.Locale;
import java.util.Scanner;

public class div7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int num = sc.nextInt();

        while (num != 0){
            if (num % 7 == 0){
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }
            num = sc.nextInt();
        }
    }
}