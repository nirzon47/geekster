import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Taking the number of elements for the array (N)
        int N = sc.nextInt();

        int[] nums = new int[N];

        // Taking input for the array
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        // The First array goes until N - 1 since in a worst case scenario, the last element is always sorted
        for (int i = 0; i < N - 1; i++) {
            // Setting the limit for j-loop and initializing the flag
            int flag = 0;
            int jLimit = N - i - 1;

            for (int j = 0; j < jLimit; j++) {
                // Standard swapping in case we find an anomaly
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                } else {
                    flag++;
                }
            }
            // If the flag is equal to the jLimit, it means all the elements are sorted.
            if (flag == jLimit) break;
        }

        for (int num : nums) System.out.print(num + " ");

    }
}
