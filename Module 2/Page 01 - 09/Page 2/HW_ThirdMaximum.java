import java.util.*;

public class HW_ThirdMaximum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int max = Integer.MIN_VALUE, max2nd = Integer.MIN_VALUE, max3rd = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int num : nums) {
            if (num == max || num == max2nd || num == max3rd) continue;
            if (num > max) {
                max3rd = max2nd;
                max2nd = max;
                max = num;

            } else if (num > max2nd) {
                max3rd = max2nd;
                max2nd = num;

            } else if (num > max3rd) {
                max3rd = num;
            }
        }

        int res = max3rd == Integer.MIN_VALUE ? max : max3rd;

        System.out.println(res);

        /*
        O(NLogN) solution

        Arrays.sort(nums);
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            res.add(nums[i]);
            if (res.size() >= 3) break;
            while (i > 0 && nums[i - 1] == nums[i]) i--;
        }

        if (res.size() == 3) {
            System.out.println(res.get(2));
        } else {
            System.out.println(res.get(0));
        }

         */
    }
}
