import java.util.Locale;
import java.util.Scanner;

public class notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        float nota = sc.nextFloat();
        
        if (nota < 5.0f){
            System.out.println("INSUFICIENT");
        }
        else if (nota >= 5.0f && nota < 6.0f){
            System.out.println("SUFICIENT");
        }
        else if (nota >= 6.0f && nota < 7.0f){
            System.out.println("BE");
        }
        else if (nota >= 7.0f && nota < 8.5f){
            System.out.println("NOTABLE");
        }
        else if (nota >= 8.5f && nota < 10.0f){
            System.out.println("EXCEL.LENT");
        }
        else if (nota == 10.0f){
            System.out.println("MATRICULA");
        }
    }
}
