import java.util.*;

public class HW_HappyNumber {
    public static int findSquare(int n) {
        int res = 0;
        while (n > 0) {
            int digit = n % 10;
            res += digit * digit;
            n /= 10;
        }

        return res;
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (set.add(n)) {
            if (n == 1) {
                return true;
            } else {
                n = findSquare(n);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isHappy(n));
    }
}
