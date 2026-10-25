import java.util.Locale;
import java.util.Scanner;

public class inicials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String N = sc.next();
        String A = sc.next();
        
        //pasamos todo a mayuscula
        String NM = N.toUpperCase();
        String AM = A.toUpperCase();

        // Extraemos el primer carácter de NM 
        //tambien se puede hacer con substring
        char NF = NM.charAt(0);
        char AF = AM.charAt(0);

        System.out.println(NF + "" + AF);



    }
}
