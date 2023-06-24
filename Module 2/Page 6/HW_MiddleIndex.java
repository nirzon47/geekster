import java.util.*;

public class HW_MiddleIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int lSum = 0, rSum = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if (i != 0) {
                rSum += nums[i];
            }
        }

        if (lSum == rSum) {
            System.out.println(0);
            return;
        }

        for (int i = 1; i < n; i++) {
            lSum += nums[i - 1];
            rSum -= nums[i];
            if (lSum == rSum) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
