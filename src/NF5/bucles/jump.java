
import java.util.Locale;
import java.util.Scanner;

public class jump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int salt = 0;

        while (n2 != -1) {
            if (n1 >= n2){
                n1 = n2;
                n2 = sc.nextInt();
            }
            else if (n1 < n2){
                salt++;
                n1 = n2;
                n2 = sc.nextInt();
            }
        }
        System.out.println(salt);
    }
}