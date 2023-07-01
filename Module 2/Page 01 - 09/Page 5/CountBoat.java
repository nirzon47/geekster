import java.util.*;

public class CountBoat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int limit = sc.nextInt();
        int count = 0, left = 0, right = n - 1;
        Arrays.sort(nums);

        while (left <= right) {
            int sum = nums[left] + nums[right];

            if (sum <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
            count++;
        }

        System.out.println(count);
    }
}
