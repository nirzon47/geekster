import java.util.*;

public class FindLastOccurence {
    public static int findIndex(int[] nums, int n, int check) {
        int left = 0, right = n - 1, res = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < check) {
                left = mid + 1;
            } else if (nums[mid] > check) {
                right = mid - 1;
            } else {
                res = mid;
                left = mid + 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int check = sc.nextInt();

        int idx = findIndex(nums, n, check);

        if (idx == -1 || nums[idx] != check) {
            System.out.println(-1);
        } else {
            System.out.println(idx);
        }

    }
}
