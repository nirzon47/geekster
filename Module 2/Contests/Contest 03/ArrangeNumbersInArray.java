import java.util.*;

public class ArrangeNumbersInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        int left = 0, right = n - 1, val = 1;
        while (left < right) {
            nums[left++] = val++;
            nums[right--] = val++;
        }

        if (n % 2 != 0) {
            nums[left] = val;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
