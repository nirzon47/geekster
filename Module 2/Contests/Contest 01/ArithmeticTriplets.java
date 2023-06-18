import java.util.*;

public class ArithmeticTriplets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int diff = sc.nextInt();
        int count = 0;
        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            if (hs.contains(num - diff) && hs.contains(num - 2 * diff)) {
                count++;
            }
            hs.add(num);
        }

        System.out.println(count);
    }
}
