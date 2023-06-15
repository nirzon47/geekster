import java.util.*;

public class MinimumDifference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        if (k == 1) {
            System.out.println(0);

        } else {
            Arrays.sort(nums);
            int min = Integer.MAX_VALUE;

            int i = 0, j = k - 1;
            while (j < n) {
                min = Math.min(min, nums[j++] - nums[i++]);
            }

            System.out.println(min);
        }

    }
}
