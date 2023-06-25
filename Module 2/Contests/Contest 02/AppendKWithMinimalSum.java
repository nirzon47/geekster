import java.util.*;

public class AppendKWithMinimalSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        Arrays.sort(nums);
        long sum = 0;

        for (int num : nums) {
            if (!hs.contains(num) && k <= num) {
                sum += num;
                k++;
            }
            hs.add(num);
        }

        long res = (long) k * (k + 1) / 2 - sum;

        System.out.println(res);

    }
}