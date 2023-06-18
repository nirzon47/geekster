import java.util.*;

public class PlaceFlower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0 && (i == 0 || nums[i - 1] == 0) && (i == n - 1 || nums[i + 1] == 0)) {
                nums[i] = 1;
                k--;
            }
            if (k == 0) {
                System.out.println(true);
                return;
            }
        }

        System.out.println(false);
    }
}
