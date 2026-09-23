package scanner;

import java.util.Scanner;

public class archivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String c1 = sc.next();
        String c2 = sc.nextLine();

        String j1 = sc.next();
        String j2 = sc.nextLine();

        String py1 = sc.next();
        String py2 = sc.nextLine();

        String js1 = sc.next();
        String js2 = sc.nextLine();

        System.out.println(js2 + " " + js1);
        System.out.println(py2 + " " + py1);
        System.out.println(j2 + " " + j1);
        System.out.println(c2 + " " + c1);

    }
}