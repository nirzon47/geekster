import java.util.*;

public class HW_SumOddSubarrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int count = 1, subArraySum = nums[i];
            sum += nums[i];
            for (int j = i + 1; j < n; j++) {
                count++;
                subArraySum += nums[j];
                if (count % 2 != 0) {
                    sum += subArraySum;
                }
            }
        }

        System.out.println(sum);
    }
}
