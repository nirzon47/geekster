import java.util.*;

public class GreatestTillMe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            nums[i] = Math.max(nums[i], nums[i - 1]);
        }

        for (int num : nums) System.out.println(num);
    }
}
