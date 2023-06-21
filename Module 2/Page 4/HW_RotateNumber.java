import java.util.*;

public class HW_RotateNumber {

    public static void reverse(char[] nums, int left, int right) {
        while (left < right) {
            char temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        char[] nums = s.toCharArray();
        int len = nums.length;

        int k = sc.nextInt();

        reverse(nums, 0, len - 1);
        k = len - k;
        k = k % len;
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);

        for (char num : nums) System.out.print(num);

    }
}
