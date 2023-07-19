import java.util.*;

public class PostfixExpressionCalculator {
    public static int calculator(int n1, int n2, char operator) {

        switch (operator) {
            case '+' -> {
                return n2 + n1;
            }
            case '-' -> {
                return n2 - n1;
            }
            case '*' -> {
                return n2 * n1;
            }
            case '/' -> {
                return n2 / n1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Integer> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                stack.push(c - '0');
            } else {
                stack.push(calculator(stack.pop(), stack.pop(), c));
            }
        }

        System.out.println(stack.pop());

    }
}
