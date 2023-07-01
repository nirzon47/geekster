import java.util.*;

public class PeakElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > nums[i + 1] && nums[i] > nums[i - 1]) System.out.print(nums[i] + " ");
        }

    }
}
