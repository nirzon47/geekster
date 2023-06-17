import java.util.*;

public class HW_MajorityElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        int limit = n % 2 == 0 ? n / 2 : n / 2 + 1;

        int res = nums[0];
        boolean flag = true;

        for (int i : hm.keySet()) {
            if (hm.get(i) >= limit) {
                res = i;
                flag = false;
            }
        }

        if (flag) {
            System.out.println("NO MAJORITY ELEMENT");
        } else {
            System.out.println(res);
        }

    }
}
