import java.util.*;

public class TargetSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int targetSum = sc.nextInt();

        Arrays.sort(nums);
        int left = 0, right = n - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == targetSum) {

                while (left + 1 < right && nums[left] == nums[left + 1]) {
                    left++;
                }
                while (right - 1 > left && nums[right] == nums[right - 1]) {
                    right--;
                }

                System.out.println(nums[left] + " " + nums[right]);
                left++;
                right--;
            } else if (sum > targetSum) {
                right--;
            } else {
                left++;
            }
        }
    }
}
