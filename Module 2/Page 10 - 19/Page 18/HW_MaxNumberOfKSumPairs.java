import java.util.*;

public class HW_MaxNumberOfKSumPairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int count = 0;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(k - num)) {
                set.remove(k - num);
                count++;
                continue;
            }
            set.add(num);
        }

        System.out.println(count);

    }
}
