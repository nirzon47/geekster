import java.util.*;

public class HW_PrintPrimeNotPrime {

    static String isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return "not prime";
            }
        }
        return "prime";
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num;

        while (n-- > 0) {
            num = sc.nextInt();
            System.out.println(isPrime(num));
        }

    }
}