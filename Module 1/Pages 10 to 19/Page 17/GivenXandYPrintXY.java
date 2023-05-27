import java.util.*;

public class GivenXandYPrintXY {

    static void join(int x, int y) {
        System.out.println(x + "" + y);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int x, y;

        while (T-- > 0) {
            x = sc.nextInt();
            y = sc.nextInt();
            join(x, y);
        }

    }
}