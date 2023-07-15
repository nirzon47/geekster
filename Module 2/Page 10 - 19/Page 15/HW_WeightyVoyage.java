import java.util.*;

public class HW_WeightyVoyage {
    public static boolean isPossible(int[] nums, int limit, int k) {
        int count = 1, sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum > limit) {
                count++;
                sum = num;
            }
        }

        return count <= k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int left = 0, right = 0;
        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }
        int res = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isPossible(nums, mid, k)) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(res);
    }
}
