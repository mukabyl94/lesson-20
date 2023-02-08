import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        Oblastar oblasta = Oblastar.valueOf(name.toUpperCase());

        switch (oblasta){
            case CHUI -> System.out.println(Oblastar.CHUI);
            case NARYN -> System.out.println(Oblastar.NARYN);
            case TALAS -> System.out.println(Oblastar.TALAS);
            case OSH -> System.out.println(Oblastar.OSH);
            case YSSYK_KOL -> System.out.println(Oblastar.YSSYK_KOL);
            case JALAL_ABAD -> System.out.println(Oblastar.JALAL_ABAD);
            case BATKEN -> System.out.println(Oblastar.BATKEN);
            default -> System.out.println("myndai oblast jok");

        }
    }
}