import java.util.*;

public class BreakStones {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int stone : stones) {
            queue.add(stone);
        }

        while (queue.size() > 1) {
            int y = queue.poll();
            int x = queue.poll();

            if (y - x > 0) {
                queue.offer(y - x);
            }
        }

        return queue.isEmpty() ? 0 : queue.poll();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(lastStoneWeight(nums));
    }
}
