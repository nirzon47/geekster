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
        int i = 0;

        while (i < n) {
            if (stack.isEmpty()) {
                stack.push(nums[i]);
                i++;
            } else {
                int last = stack.peek();
                if (last > 0 && nums[i] < 0) {
                    if (last == Math.abs(nums[i])) {
                        stack.pop();
                        i++;
                    } else if (Math.abs(nums[i]) > last) {
                        stack.pop();
                    } else if (Math.abs(nums[i]) < last) {
                        i++;
                    }
                } else {
                    stack.push(nums[i]);
                    i++;
                }
            }
        }


        List<Integer> res = new ArrayList<>(stack);

        for (int r : res) {
            System.out.print(r + " ");
        }

    }
}
