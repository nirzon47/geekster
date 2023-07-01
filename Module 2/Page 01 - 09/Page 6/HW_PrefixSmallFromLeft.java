import java.util.*;

public class HW_PrefixSmallFromLeft {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] prefix = new int[n];
        int min = nums[0];

        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            prefix[i] = min;
        }

        for (int p : prefix) System.out.println(p);

    }
}
