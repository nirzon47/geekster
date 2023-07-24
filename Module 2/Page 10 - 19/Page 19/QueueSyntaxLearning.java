import java.util.*;

public class QueueSyntaxLearning {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        while (t-- > 0) {
            switch (sc.nextInt()) {
                case 1 -> System.out.println(queue.size());
                case 2 -> {
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        queue.remove();
                    }
                }
                case 3 -> queue.add(sc.nextInt());
                case 4 -> {
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.peek());
                    }
                }
            }
        }
    }
}
