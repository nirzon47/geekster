import java.util.*;

public class HW_ImplementAQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        while (t-- > 0) {
            switch (sc.next()) {
                case "size" -> System.out.println(queue.size());
                case "dequeue" -> {
                    if (!queue.isEmpty()) {
                        queue.remove();
                    }
                }
                case "enqueue" -> queue.add(sc.nextInt());
                case "display" -> {
                    if (!queue.isEmpty()) {
                        ArrayList<Integer> list = new ArrayList<>(queue);
                        for (int i : list) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
