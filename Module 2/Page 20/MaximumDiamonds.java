import java.util.*;

public class Page10_MaximumDiamonds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), mins = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(((o1, o2) -> o2 - o1));

        for (int i = 0; i < n; i++) {
            pq.offer(sc.nextInt());
        }

        int res = 0;

        while (mins-- > 0) {
            int max = pq.poll();
            res += max;
            pq.offer(max / 2);
        }

        System.out.println(res);
    }
}
