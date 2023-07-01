import java.util.*;

public class HW_UniqueSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        int sum = 0;

        for (Integer key : hm.keySet()) {
            if (hm.get(key) == 1) {
                sum += key;
            }
        }

        System.out.println(sum);
    }
}
