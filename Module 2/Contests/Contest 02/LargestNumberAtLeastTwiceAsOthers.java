import java.util.*;

public class LargestNumberAtLeastTwiceAsOthers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int idx = -1;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] > max) {
                max = nums[i];
                idx = i;
            }
        }

        for (int num : nums) {
            if (max == num) continue;
            if (max < num * 2) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(idx);

    }
}