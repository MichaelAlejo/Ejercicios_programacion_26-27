import java.util.Scanner;

public class cont_un_xef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dato1 = sc.nextLine();
        int dato2 = sc.nextInt();
        sc.nextLine();
        String dato3 = sc.nextLine();
        int dato4 = sc.nextInt();
        sc.nextLine();
        String dato5 = sc.nextLine();

        System.out.println("El formulari de " + dato1 + " s'ha completat. Et contactarem si necessitem un xef de cuina " + dato5 + ".");


    }
}