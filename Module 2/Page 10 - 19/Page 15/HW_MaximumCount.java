import java.util.*;

public class HW_MaximumCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        int negatives = left;
        right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        int positives = n - left;
        System.out.println(Math.max(positives, negatives));
    }
}
