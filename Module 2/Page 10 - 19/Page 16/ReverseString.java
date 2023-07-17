import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String s = sc.next();

        for (char ch : s.toCharArray()) {
            stack.push(ch);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }
}
