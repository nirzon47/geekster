import java.util.*;

public class HW_SumEqualsOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;

        for (int num : nums) {
            sum += num;
            if (hs.contains(1 - sum) || num == 1 || sum == 1) {
                System.out.println(true);
                return;
            }
            hs.add(sum);
        }

        System.out.println(false);
    }
}
