import java.util.*;

public class RankTransformOfAnArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        SortedMap<Integer, Integer> map = new TreeMap<>();
        int rank = 1;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            map.put(nums[i], 0);
        }

        for (Integer key : map.keySet()) {
            map.put(key, rank++);
        }

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = map.get(nums[i]);
        }

        for (int r : res) System.out.print(r + " ");

    }
}
