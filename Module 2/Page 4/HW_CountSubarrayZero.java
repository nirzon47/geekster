import java.util.*;

public class HW_CountSubarrayZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = nums[i];
            if (sum == 0)
                count++;
            for (int j = i + 1; j < n; j++) {
                sum += nums[j];
                if (sum == 0)
                    count++;
            }
        }

        System.out.println(count);

    }
}
