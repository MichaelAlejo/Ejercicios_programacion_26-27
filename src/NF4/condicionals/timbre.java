
import java.util.Locale;
import java.util.Scanner;

public class timbre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        String d3 = sc.nextLine();

        if (d2 == 00 && d3.equals("automatic"))  {
            System.out.println("RING");
        }
        else if (d3.equals("alarma")) {
            System.out.println("RING RING RING");
        }
        else if (d3.equals("manual")) {
            System.out.println("RING");
        }
        else {
            System.out.println("---");
        }


    }
}