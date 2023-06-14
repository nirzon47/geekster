import java.util.*;

public class SortArrayParity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        ArrayList<Integer> res = new ArrayList<>();

        for (int num : nums) {
            if (num % 2 == 0) res.add(num);
        }
        for (int num : nums) {
            if (num % 2 != 0) res.add(num);
        }

        for (int i : res) System.out.print(i + " ");
    }
}
