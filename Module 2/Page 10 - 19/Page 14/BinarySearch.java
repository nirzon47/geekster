import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int search = sc.nextInt();
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == search) {
                System.out.println(mid);
                return;
            } else if (nums[mid] > search) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }
}
