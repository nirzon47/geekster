import java.util.*;

public class FibonacciNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1, c, i = 0;

        while (i < n) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }

    }

}
