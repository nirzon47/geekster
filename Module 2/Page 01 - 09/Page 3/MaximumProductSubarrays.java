import java.util.*;

public class MaximumProductSubarrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int res = nums[0], minProd = 1, maxProd = 1;

        for (int num : nums) {
            int temp = maxProd * num;
            maxProd = Math.max(Math.max(minProd * num, maxProd * num), num);
            minProd = Math.min(Math.min(minProd * num, temp), num);

            res = Math.max(res, maxProd);
        }

        System.out.println(res);
    }
}
