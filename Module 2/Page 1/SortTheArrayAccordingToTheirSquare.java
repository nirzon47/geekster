import java.util.*;

public class SortTheArrayAccordingToTheirSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[] nums = new Integer[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        // Using comparators and lambda function
        Arrays.sort(nums, (n1, n2) -> n1 * n1 - n2 * n2);

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
