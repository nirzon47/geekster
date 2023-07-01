import java.util.*;

public class HW_InsertionSortDecreasing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int key, j;
        for (int i = 1; i < N; i++) {
            key = nums[i];
            j = i - 1;
            while (j >= 0 && nums[j] < key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }

        for (int num : nums) System.out.print(num + " ");

    }
}
