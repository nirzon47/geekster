import java.util.*;

public class FirstNegativeInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Queue<Integer> queue = new LinkedList<>();
        int pointer = 0;

        while (pointer < k) {
            if (nums[pointer] < 0) {
                queue.add(pointer);
            }

            pointer++;
        }

        while (pointer < n) {
            if (queue.isEmpty()) {
                System.out.print(0 + " ");
            } else {
                System.out.print(nums[queue.peek()] + " ");
            }

            if (!queue.isEmpty() && queue.peek() < pointer - k + 1) {
                queue.remove();
            }

            if (nums[pointer] < 0) {
                queue.add(pointer);
            }

            pointer++;
        }

        if (queue.isEmpty()) {
            System.out.print(0 + " ");
        } else {
            System.out.print(nums[queue.peek()] + " ");
        }

    }
}
