import java.util.*;

public class EvenDigits {

    static int numberOfDigits(int n) {
        int digits = 0;
        while (n > 0) {
            digits++;
            n /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (numberOfDigits(arr[i]) % 2 == 0)
                count++;
        }
        System.out.println(count);

    }
}