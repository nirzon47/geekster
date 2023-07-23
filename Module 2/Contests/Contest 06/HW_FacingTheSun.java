import java.util.*;

public class HW_FacingTheSun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int count = 1, max = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                count++;
            }
        }

        System.out.println(count);
    }
}
