import java.util.*;

public class InsertionSort {

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
            // Move elements of arr[0..i-1],
            // that are greater than key,
            // to one position ahead of their
            // current position
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }

        for (int num : nums) System.out.print(num + " ");

    }
}
