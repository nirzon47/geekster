import java.util.*;

public class DecreasingOrderUsingInbuiltSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        for (int i = N - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
