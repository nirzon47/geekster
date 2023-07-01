import java.util.*;

public class InterleavingXandY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int left = 0, right = n / 2;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                res[i] = nums[left++];
            } else {
                res[i] = nums[right++];
            }
        }

        for (int r : res) System.out.print(r + " ");
    }
}
