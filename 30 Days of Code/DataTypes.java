
import java.util.*;

public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        try (Scanner scan = new Scanner(System.in)) {
            i += scan.nextInt();
            d += scan.nextDouble();
            scan.nextLine();
            s += scan.nextLine();
            System.out.printf("%d\n%.01f\n%s\n", i, d, s);
        }
    }
}