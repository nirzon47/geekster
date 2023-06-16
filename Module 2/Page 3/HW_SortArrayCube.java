import java.util.*;

public class HW_SortArrayCube {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] nums = new Integer[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums, (o1, o2) -> o1 * o1 * o1 - o2 * o2 * o2);

        for (int num : nums) System.out.print(num + " ");
    }
}
