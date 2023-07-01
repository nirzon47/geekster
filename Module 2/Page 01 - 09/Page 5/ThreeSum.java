import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1, k = n - 1; j < k; ) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                    j++;
                    k--;
                    while (nums[j] == nums[j - 1] && j < k) j++;
                    while (nums[k] == nums[k + 1] && j < k) k--;
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }

    }
}
