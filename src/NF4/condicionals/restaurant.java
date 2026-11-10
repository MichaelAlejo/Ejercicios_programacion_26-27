import java.util.Locale;
import java.util.Scanner;

public class restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        sc.useLocale(Locale.ENGLISH);

        //El teu codi aqui
        int op = sc.nextInt();
        int pa = sc.nextInt();
        int pb = sc.nextInt();
        int tot = pa + pb;
        
        switch (op){
            case 1:
                System.out.println("MENU:");
                System.out.println("1.- ESMORZARS");
                System.out.println("2.- DINARS");
                System.out.println("3.- BERENARS");
                System.out.println("4.- SOPARS");
                System.out.println("");
                System.out.println("Total ESMORZARS del restaurant A i B: " + tot);
                break;
                
            case 2:
                System.out.println("MENU:");
                System.out.println("1.- ESMORZARS");
                System.out.println("2.- DINARS");
                System.out.println("3.- BERENARS");
                System.out.println("4.- SOPARS");
                System.out.println("");
                System.out.println("Total DINARS del restaurant A i B: " + tot);
                break;
                
            case 3:
                System.out.println("MENU:");
                System.out.println("1.- ESMORZARS");
                System.out.println("2.- DINARS");
                System.out.println("3.- BERENARS");
                System.out.println("4.- SOPARS");
                System.out.println("");
                System.out.println("Total BERENARS del restaurant A i B: " + tot);
                break;
            
            case 4:
                System.out.println("MENU:");
                System.out.println("1.- ESMORZARS");
                System.out.println("2.- DINARS");
                System.out.println("3.- BERENARS");
                System.out.println("4.- SOPARS");
                System.out.println("");
                System.out.println("Total SOPARS del restaurant A i B: " + tot);
                break;
            
            default:
                System.out.println("MENU:");
                System.out.println("1.- ESMORZARS");
                System.out.println("2.- DINARS");
                System.out.println("3.- BERENARS");
                System.out.println("4.- SOPARS");
                System.out.println("");
                System.out.println("OPCIO INEXISTENT !!");
                break;
        }
    }
}
