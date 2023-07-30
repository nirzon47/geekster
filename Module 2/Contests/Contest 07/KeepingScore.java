import java.util.*;

public class KeepingScore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String c = sc.next();

            switch (c) {
                case "+" -> {
                    int s1 = stack.pop();
                    int s2 = stack.pop();
                    stack.push(s2);
                    stack.push(s1);
                    stack.push(s1 + s2);
                }
                case "C" -> stack.pop();
                case "D" -> stack.push(stack.peek() * 2);
                default -> stack.push(Integer.parseInt(c));
            }
        }

        List<Integer> res = new ArrayList<>(stack);
        int sum = 0;
        for (int r : res) {
            sum += r;
        }

        System.out.println(sum);

    }
}
