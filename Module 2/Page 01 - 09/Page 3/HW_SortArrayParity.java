import java.util.*;

public class HW_SortArrayParity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int odd = 1, even = 0;
        int[] res = new int[n];

        Arrays.sort(nums);

        for (int num : nums) {
            if (num % 2 == 0) {
                res[even] = num;
                even += 2;
            } else {
                res[odd] = num;
                odd += 2;
            }
        }

        for (int r : res) {
            System.out.print(r + " ");
        }
    }
}
