import java.util.*;

public class PrimeChecker {

    static String isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n;

        while (T-- > 0) {
            n = sc.nextInt();
            System.out.println(isPrime(n));
        }
    }
}