import java.util.*;

public class PrintAllSubarrarys {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j <= n; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(nums[k] + " ");
                    if (k == j - 1)
                        System.out.println();
                }
            }
        }
    }
}
