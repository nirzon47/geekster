import java.util.*;

public class NthFibonacciNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0, b = 1, c, i = 0;
        
        while (i < n) {
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        System.out.println(a);

    }
}