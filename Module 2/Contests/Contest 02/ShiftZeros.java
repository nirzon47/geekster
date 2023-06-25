import java.util.*;

public class ShiftZeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int pointer = 0;

            for (int num : nums) {
                if (num != 0) {
                    nums[pointer++] = num;
                }
            }

            for (; pointer < n; pointer++) {
                nums[pointer] = 0;
            }

            for (int num : nums) System.out.print(num + " ");
            System.out.println();
        }

    }
}