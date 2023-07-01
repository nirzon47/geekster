import java.util.*;

public class HW_ZeroBringsZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int numZeros = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] == 0) numZeros++;
        }
        
        for (int left = n - 1; left >= 0; left--) {
            int right = left + numZeros;
            if (right < n) {
                nums[right] = nums[left];
            }
            if (nums[left] == 0) {
                if (right - 1 < n) {
                    nums[right - 1] = 0;
                }
                numZeros--;
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
