
import java.util.Locale;
import java.util.Scanner;

public class lletresscra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String letra = sc.nextLine();

        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U") || letra.equals("L") || letra.equals("N") || letra.equals("R") || letra.equals("S") || letra.equals("T")) {
            System.out.println("1");
        }
        else if (letra.equals("D") || letra.equals("G")) {
            System.out.println("2");
        }
        else if (letra.equals("B") || letra.equals("C") || letra.equals("M") || letra.equals("P")) {
            System.out.println("3");
        }
        else if (letra.equals("F") || letra.equals("H") || letra.equals("V") || letra.equals("W") || letra.equals("Y")) {
            System.out.println("4");
        }
        else if (letra.equals("K")){
            System.out.println("5");
        }
        else if (letra.equals("J") || letra.equals("X")) {
            System.out.println("8");
        }
        else if (letra.equals("Q") || letra.equals("Z")) {
            System.out.println("10");
        }
    }
}