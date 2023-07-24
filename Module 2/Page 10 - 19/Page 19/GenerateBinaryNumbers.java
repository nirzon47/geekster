import java.util.*;

public class GenerateBinaryNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        while (n-- > 0) {
            String s = queue.remove();
            System.out.print(s + " ");

            queue.add(s + "0");
            queue.add(s + "1");
        }

    }
}
