import java.util.*;

public class HW_ReachTarget {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int left = 0, right = n - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                System.out.println(left + " " + right);
                left++;
                right--;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
    }
}
