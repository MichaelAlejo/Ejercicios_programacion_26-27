import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int amplada = sc.nextInt();
            int alcada = sc.nextInt();
            int k = sc.nextInt();

            int totalQuadradets = amplada * alcada;

            // Comprobamos si no supera el total 
            // y si se puede obtener cortando en vertical u horizontal
            if (totalQuadradets >= k  && (k % amplada == 0 || k % alcada == 0)) {
                System.out.println("SI");
            } 
            else {
                System.out.println("NO");
            }
    }
}
