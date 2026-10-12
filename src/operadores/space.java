import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int a1 = sc.nextInt();
        int h1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a2 = sc.nextInt();
        int h2 = sc.nextInt();

        // Comprobamos si los rectangulos estan separados horizontalmente
        boolean separados_horizontalmente = x1 + a1 < x2 || x2 + a2 < x1;

        // Comprobamos si los rectangulos estan separados verticalmente
        boolean separados_verticalmente = y1 + h1 < y2 || y2 + h2 < y1;

        // Comprobamos si los rectangulos se solapan
        boolean se_solapan = !(separadosHorizontalmente || separadosVerticalmente);

        System.out.println(seSolapan);

    }
}
