import java.util.*;

public class HW_DailyTemperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        stack.push(0);

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                res[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        for (int i : res) {
            System.out.print(i + " ");
        }

    }
}
