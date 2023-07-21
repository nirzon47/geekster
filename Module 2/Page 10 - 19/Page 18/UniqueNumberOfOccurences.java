import java.util.*;

public class UniqueNumberOfOccurences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Set<Integer> set = new HashSet<>(map.values());

        System.out.println(set.size() == map.size());

    }
}
