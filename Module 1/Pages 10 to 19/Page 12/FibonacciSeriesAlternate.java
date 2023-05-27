import java.util.*;

public class FibonacciSeriesAlternate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 1, b = 0, c = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0)
                System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
        }
        
    }
}