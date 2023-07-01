import java.util.*;

public class HW_MaximumProductOfThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        int max = Integer.MIN_VALUE, max2nd = Integer.MIN_VALUE, max3rd = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, min2nd = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int num : nums) {
            if (num > max) {
                max3rd = max2nd;
                max2nd = max;
                max = num;

            } else if (num > max2nd) {
                max3rd = max2nd;
                max2nd = num;

            } else if (num > max3rd) {
                max3rd = num;
            }

            if (num < min) {
                min2nd = min;
                min = num;

            } else if (num < min2nd) {
                min2nd = num;
            }
        }

        int res = Math.max(max * max2nd * max3rd, max * min * min2nd);

        System.out.println(res);

        /*
        O(NLogN) solution

        Arrays.sort(nums);

        int res = Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);

        System.out.println(res);

         */

    }
}
