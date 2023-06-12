import java.util.*;

public class SelectionSort {

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
            int minIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (nums[minIndex] > nums[j]) minIndex = j;
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        for (int num : nums) System.out.print(num + " ");

    }
}
