import java.util.*;

public class DeleteConsecutive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (!stack.isEmpty() && s.equals(stack.peek())) {
                stack.pop();
                continue;
            }
            stack.push(s);
        }

        System.out.println(stack.size());
    }
}
