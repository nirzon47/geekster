import java.util.*;

public class HW_DeDuplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int pointer = 1, count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == nums[i]) {
                if (count < 2) {
                    nums[pointer++] = nums[i];
                }
                count++;
            } else {
                nums[pointer++] = nums[i];
                count = 1;
            }
        }

        System.out.println(pointer);
    }
}
