import java.util.*;

public class LeadersInArray {
    public static Stack<Integer> nextGreatestElementInLeft(int[] nums, int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(nums[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] >= stack.peek()) {
                stack.push(nums[i]);
            }
        }

        return stack;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            Stack<Integer> stack = nextGreatestElementInLeft(nums, n);
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
            System.out.println();
        }

    }
}
