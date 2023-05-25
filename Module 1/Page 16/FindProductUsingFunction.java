import java.util.*;

public class FindProductUsingFunction {

    public static int findProduct(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(findProduct(x, y));
        }

    }
}