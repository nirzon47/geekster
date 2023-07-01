import java.util.*;

public class HW_KthSmallestElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int K = sc.nextInt();

        Arrays.sort(nums);

        System.out.println(nums[K - 1]);

    }
}
