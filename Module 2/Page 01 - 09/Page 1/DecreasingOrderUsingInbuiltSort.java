import java.util.*;

public class DecreasingOrderUsingInbuiltSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[] nums = new Integer[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums, Collections.reverseOrder());

        for (Integer num : nums) System.out.print(num + " ");
        
    }
}
