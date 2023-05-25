import java.util.*;

public class FindSumUsingFunction {

    public static int findSum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(findSum(x, y));
        }

    }
}