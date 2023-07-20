import java.util.*;

public class HW_MaximumProductOfIndexes {
    public static int[] getNextGreaterRight(int[] nums, int n) {
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }

            stack.push(i);
        }

        return res;
    }

    public static int[] getNextGreaterLeft(int[] nums, int n) {
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }

            stack.push(i);
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

        int[] nextGreaterRight = getNextGreaterRight(nums, n);
        int[] nextGreaterLeft = getNextGreaterLeft(nums, n);

        int max = -1;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, (nextGreaterLeft[i] + 1) * (nextGreaterRight[i] + 1));
        }

        System.out.println(max);

    }
}
