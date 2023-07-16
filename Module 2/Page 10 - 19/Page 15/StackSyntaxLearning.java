import java.util.*;

public class StackSyntaxLearning {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            switch (sc.nextInt()) {
                case 1 -> System.out.println(stack.size());
                case 2 -> {
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        stack.pop();
                    }
                }
                case 3 -> stack.push(sc.nextInt());
                case 4 -> {
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peek());
                    }
                }
                default -> System.out.println(-1);
            }
        }

    }
}
