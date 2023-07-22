import java.util.*;

public class HW_DistributeCandies {
    public static int distributeCandies(int[] candyType) {
        int maxCandies = candyType.length / 2;
        Set<Integer> set = new HashSet<>();

        for (int type : candyType) {
            set.add(type);
        }

        return Math.min(set.size(), maxCandies);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(distributeCandies(nums));
    }
}
