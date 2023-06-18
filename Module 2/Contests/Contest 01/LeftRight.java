import java.util.*;

public class LeftRight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        int leftSum = 0, rightSum = 0, i = 0;
        int[] res = new int[n];

        for (int j = 0; j < n; j++) {
            nums[j] = sc.nextInt();
            rightSum += nums[j];
        }

        for (int num : nums) {
            leftSum += num;
            res[i++] = Math.abs(leftSum - rightSum);
            rightSum -= num;
        }

        for (int r : res) System.out.print(r + " ");

    }
}
