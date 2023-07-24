import java.util.*;

public class MinimumDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.offer(sc.nextInt());
        }

        long n1 = 0, n2 = 0;

        while (queue.size() > 1) {
            n1 = n1 * 10 + queue.poll();
            n2 = n2 * 10 + queue.poll();
        }

        if (!queue.isEmpty()) {
            n1 = n1 * 10 + queue.poll();
        }

        System.out.println(n1 + n2);
    }
}
