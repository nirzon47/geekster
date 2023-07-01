import java.util.*;

public class PrintPrefixSumBetweenLR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int l = sc.nextInt();
        int r = sc.nextInt();

        int sum = 0;

        for (int i = 0; i <= r; i++) {
            sum += nums[i];
            if (i >= l) {
                System.out.println(sum);
            }
        }
    }
}
