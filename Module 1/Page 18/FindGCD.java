import java.util.*;

public class FindGCD {

    static int GCD(int x, int y) {
        int gcd = 1;
        int small, big;

        big = Math.max(x, y);
        small = x + y - big;

        for (int i = small; i > 1; i--) {
            if (x % i == 0 && y % i == 0) {
                return i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int x, y;

        while (T-- > 0) {
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(GCD(x, y));
        }

    }
}