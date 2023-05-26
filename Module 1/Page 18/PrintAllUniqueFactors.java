import java.util.*;

public class PrintAllUniqueFactors {

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void printPrimes(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && isPrime(i)) {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrimes(n);

    }
}