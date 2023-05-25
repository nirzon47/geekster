import java.util.*;

public class HW_CalculateLCM {

    static int HCF(int x, int y) {
        int hcf = 1;
        int small, big;

        big = Math.max(x, y);
        small = x + y - big;

        for (int i = small; i > 1; i--) {
            if (x % i == 0 && y % i == 0) {
                hcf = i;
                return hcf;
            }
        }

        return hcf;
    }

    static int LCM(int x, int y) {
        return (x * y) / HCF(x, y);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int x, y;

        while (T-- > 0) {
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(LCM(x, y));
        }

    }
}