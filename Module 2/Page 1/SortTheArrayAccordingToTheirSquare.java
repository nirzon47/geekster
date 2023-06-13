import java.util.*;

public class SortTheArrayAccordingToTheirSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            int jLimit = N - i - 1;
            for (int j = 0; j < jLimit; j++) {
                if (nums[j] * nums[j] > nums[j + 1] * nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
