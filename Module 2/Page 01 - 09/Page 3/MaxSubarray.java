import java.util.*;

public class MaxSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE, sum = 0;

        for (int num : nums) {
            if (sum < 0) {
                sum = 0;
            }
            sum += num;
            maxSum = Math.max(sum, maxSum);
        }

        System.out.println(maxSum);
    }
}
