import java.util.*;

public class PeakIndexMountain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Using binary search to find the largest element (peak) in the array
        int left = 0, right = n - 1, mid;

        while (left < right) {
            mid = left + (right - left) / 2;
            // Checking arr[mid] with arr[mid+1] essentially
            int check = nums[mid + 1];

            // If arr[mid] is greater than arr[mid+1], we are descending, so we need to lower our upper bound
            if (nums[mid] > check) {
                right = mid;
            }
            // If arr[mid] is lesser than arr[mid+1], we are ascending still, so we up our lower bound
            else if (nums[mid] < check) {
                left = mid + 1;
            }
        }

        // We can return either left or right since they should be equal
        System.out.println(left);

    }
}
