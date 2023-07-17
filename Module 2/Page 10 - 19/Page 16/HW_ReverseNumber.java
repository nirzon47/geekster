import java.util.*;

public class HW_ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Stack<Integer> stack = new Stack<>();
            while (n > 0) {
                stack.push(n % 10);
                n /= 10;
            }

            int reverse = 0;
            int place = 1;

            while (!stack.isEmpty()) {
                reverse += stack.pop() * place;
                place *= 10;
            }
            System.out.println(reverse);
        }

    }
}
