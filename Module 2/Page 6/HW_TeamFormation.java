import java.util.*;

public class HW_TeamFormation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        if (n % 2 != 0) {
            System.out.println(-1);
            return;
        }

        Arrays.sort(nums);
        int left = 0, right = n - 1, sum = nums[left] + nums[right], skills = 0;

        while (left < right) {
            if (nums[left] + nums[right] == sum) {
                skills += nums[left] * nums[right];
            } else {
                System.out.println(-1);
                return;
            }

            left++;
            right--;
        }

        System.out.println(skills);
    }
}
