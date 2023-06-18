import java.util.*;

public class ShiftZeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            int i = 0;

            for (int j = 0; j < n; j++) {
                nums[j] = sc.nextInt();
            }

            for (int num : nums) {
                if (num != 0) {
                    nums[i++] = num;
                }
            }

            for (; i < n; i++) {
                nums[i] = 0;
            }

            for (int num : nums) System.out.print(num + " ");
            System.out.println();
        }
    }
}
