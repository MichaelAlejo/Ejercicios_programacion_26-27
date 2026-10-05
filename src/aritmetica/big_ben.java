import java.util.Locale;
import java.util.Scanner;

public class big_ben {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int H = sc.nextInt();
        int N = sc.nextInt();

        System.out.println((H + N) % 12);


    }
}