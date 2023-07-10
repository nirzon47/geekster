import java.util.*;

public class FindSquareRoot {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int left = 1, right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(mySqrt(x));
    }
}
