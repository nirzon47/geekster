import java.util.*;

public class HW_MergeKSortedArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        PriorityQueue<Integer> heap = new PriorityQueue<>();


        while (t-- > 0) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                heap.offer(sc.nextInt());
            }
        }

        while (!heap.isEmpty()) {
            System.out.print(heap.poll() + " ");
        }

    }
}
