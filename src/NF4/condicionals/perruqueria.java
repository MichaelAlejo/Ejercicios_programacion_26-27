import java.util.Locale;
import java.util.Scanner;

public class perruqueria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        sc.useLocale(Locale.ENGLISH);

        int pt = sc.nextInt();
        int pe = sc.nextInt();
        float nota = sc.nextFloat();
        int huf = sc.nextInt();
        int hf = sc.nextInt();
        
        if (pe >= (pt/2) && nota >= 4.0f && hf<(huf*0.2f)){
            System.out.println("APROVA !!");
        }
        else if (nota>=5.0f && hf<(huf*0.2f)){
            System.out.println("APROVA !!");
        }
        else {
            System.out.println("SUSPEN");
        }
    }
}
