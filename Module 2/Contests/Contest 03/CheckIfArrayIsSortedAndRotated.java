import java.util.*;

public class CheckIfArrayIsSortedAndRotated {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] sortedNums = new int[n];
        StringBuilder check = new StringBuilder(), array = new StringBuilder();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            sortedNums[i] = nums[i];
            check.append(nums[i]);
        }

        Arrays.sort(sortedNums);

        int start = 0;
        while (sortedNums[0] != nums[start]) {
            start++;
        }

        // Checking if the array is sorted or not
        for (int i = 0; i < n; i++) {
            if (nums[start++] != sortedNums[i]) {
                System.out.println(false);
                return;
            }
            if (start == n) {
                start = 0;
            }
        }

        array.append(check);
        check.append(check);

        System.out.println(check.toString().contains(array.toString()));

    }
}
