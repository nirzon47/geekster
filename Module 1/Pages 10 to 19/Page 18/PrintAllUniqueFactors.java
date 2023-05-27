import java.util.*;

public class PrintAllUniqueFactors {
    
    static void printPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                while (n % i == 0)
                    n /= i;
            }

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrimes(n);

    }
}