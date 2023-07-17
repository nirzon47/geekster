import java.util.*;

public class DeleteConsecutive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] sArr = new String[n];
        for (int i = 0; i < n; i++) {
            sArr[i] = sc.next();
        }

        Stack<String> stack = new Stack<>();
        for (String s : sArr) {
            if (!stack.isEmpty()) {
                if (s.equals(stack.peek())) {
                    stack.pop();
                } else {
                    stack.push(s);
                }
            } else {
                stack.push(s);
            }
        }

        System.out.println(stack.size());
    }
}
