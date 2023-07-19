import java.util.*;

public class HW_AsteroidCollision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();

        for (int num : nums) {
            if (stack.isEmpty() || num > 0) {
                stack.push(num);
            } else {
                while (!stack.isEmpty() && stack.peek() < Math.abs(num) && stack.peek() > 0) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == Math.abs(num)) {
                    stack.pop();
                } else {
                    if (stack.isEmpty() || stack.peek() < 0) {
                        stack.push(num);
                    }
                }
            }
        }

        int[] res = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
