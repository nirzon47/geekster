import java.util.*;

public class CandyChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            max = Math.max(max, nums[i]);
        }

        int extraCandies = sc.nextInt();
        boolean[] res = new boolean[n];

        for (int i = 0; i < n; i++) {
            int newCandies = nums[i] + extraCandies;
            res[i] = newCandies >= max;
        }

        for (boolean r : res) {
            System.out.print(r + " ");
        }
    }
}