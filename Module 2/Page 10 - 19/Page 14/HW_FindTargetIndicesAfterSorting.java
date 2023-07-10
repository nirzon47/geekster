import java.util.*;

public class HW_FindTargetIndicesAfterSorting {
    public static int findIndex(int[] nums, int target, int left, int right) {
        int res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = left + 1;
            } else {
                res = mid;
                right = right - 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int target = sc.nextInt();

        int left = -1;
        while (left < n) {
            left = findIndex(nums, target, left + 1, n - 1);
            if (left == -1) {
                break;
            }
            res.add(left);
        }

        for (int r : res) {
            System.out.print(r + " ");
        }

    }
}
