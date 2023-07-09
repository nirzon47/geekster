import java.util.*;

public class DivideArrayIntoEqualPairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        for (int i = 0; i < n; i += 2) {
            if (nums[i] != nums[i + 1]) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);

    }
}
