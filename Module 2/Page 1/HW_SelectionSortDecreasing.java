import java.util.*;

public class HW_SelectionSortDecreasing {

    public static void main(String[] args) {

        // Inputs
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        // Inputs done

        // Taking the index of the minimum element and pushing it to the i-th position
        for (int i = 0; i < N; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (nums[maxIndex] < nums[j]) maxIndex = j;
            }
            int temp = nums[maxIndex];
            nums[maxIndex] = nums[i];
            nums[i] = temp;
        }

        for (int num : nums) System.out.print(num + " ");

    }
}
