import java.util.*;

public class SumEqualsZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            sum += num;
            if (hs.contains(-sum) || sum == 0 || num == 0) {
                System.out.println(true);
                return;
            }
            hs.add(sum);
        }

        System.out.println(false);
    }
}
