import java.util.*;

public class HW_CountingMismatched {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] expected = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            expected[i] = nums[i];
        }

        Arrays.sort(expected);
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != expected[i]) count++;
        }

        System.out.println(count);

    }
}
