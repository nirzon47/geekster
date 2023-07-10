import java.util.*;

public class HW_FindElementInRotatedArray {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= nums[left]) {
                if (nums[mid] >= target && nums[left] <= target) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }

        return nums[left] == target ? left : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println(search(nums, target));
    }
}
