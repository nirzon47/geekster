import java.util.*;

public class FindTheIndexOfRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int prev = (mid - 1 + n) % n;
            int next = (mid + 1) % n;
            if (nums[mid] <= nums[prev] && nums[mid] <= nums[next]) {
                System.out.println(mid - 1);
                return;
            } else if (nums[mid] <= nums[right]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(-1);

    }
}
