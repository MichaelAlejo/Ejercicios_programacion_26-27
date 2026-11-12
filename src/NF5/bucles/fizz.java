
import java.util.Locale;
import java.util.Scanner;

public class fizz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int A = sc.nextInt();
        int B = sc.nextInt();

        while (A >= B){
            if (A % 3 == 0 && A % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (A % 3 == 0){
                System.out.println("Fizz");
            }
            else if (A % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(A);
            }
            A --;
        }
    }
}