import java.util.*;

public class HW_ElementAsAnIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        int[] ans = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
            System.out.print(ans[i] + " ");
        }

    }
}