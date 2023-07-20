import java.util.*;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = -1;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = nums[stack.peek()];
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

        int[] res = nextGreaterElement(nums);

        for (int i : res) {
            System.out.print(i + " ");
        }

    }
}
