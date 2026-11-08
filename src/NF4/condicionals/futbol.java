
import java.util.Locale;
import java.util.Scanner;

public class futbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int ga = sc.nextInt();
        int ea = sc.nextInt();
        int pa = sc.nextInt();
        int gfa = sc.nextInt();
        int gca = sc.nextInt();
        sc.nextLine();

        int gb = sc.nextInt();
        int eb = sc.nextInt();
        int pb = sc.nextInt();
        int gfb = sc.nextInt();
        int gcb = sc.nextInt();

        int gols_totalsA = (ga * 3) + ea;
        int gols_totalsB = (gb * 3) + eb;

        if (gols_totalsA > gols_totalsB){
            System.out.println(gols_totalsA >= gols_totalsB);
        }
        else if (gols_totalsA < gols_totalsB) {
            System.out.println(gols_totalsA <= gols_totalsB);
        }
        else {
            System.out.println((gfa - gca)<(gfb - gcb));
        }
    }
}