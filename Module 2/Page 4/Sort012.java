import java.util.*;

public class Sort012 {

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int left = 0, right = n - 1;
        while (left < right) {
            if (nums[left] == 0) {
                left++;
            } else if (nums[right] > 0) {
                right--;
            } else {
                swap(nums, left, right);
            }
        }

        right = n - 1;

        while (left < right) {
            if (nums[left] == 1) {
                left++;
            } else if (nums[right] == 2) {
                right--;
            } else {
                swap(nums, left, right);
            }
        }

        for (int num : nums) System.out.print(num + " ");
    }
}
