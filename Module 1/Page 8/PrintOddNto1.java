import java.util.*;

public class PrintOddNto1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0)
            n--;

        for (; n >= 1; n -= 2)
            System.out.println(n);

    }
}