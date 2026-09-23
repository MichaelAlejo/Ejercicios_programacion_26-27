package scanner;

import java.util.Scanner;

public class carta_formal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dato1 = sc.nextLine();
        String dato2 = sc.nextLine();
        String dato3 = sc.nextLine();
        String dato4 = sc.nextLine();

        System.out.println(dato1 + " " + dato3 + " " + dato4 + ", " + dato2);
        System.out.println();
        System.out.println("El principal objectiu de la present carta...");

    }
}