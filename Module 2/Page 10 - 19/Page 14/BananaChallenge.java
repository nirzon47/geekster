import java.util.*;

public class BananaChallenge {
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = Integer.MIN_VALUE;

        for (int pile : piles) {
            right = Math.max(pile, right);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long hours = 0;

            for (int pile : piles) {
                hours += pile / mid;
                if (pile % mid != 0)
                    hours++;
            }

            if (hours <= h) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int h = sc.nextInt();

        System.out.println(minEatingSpeed(nums, h));
    }
}
