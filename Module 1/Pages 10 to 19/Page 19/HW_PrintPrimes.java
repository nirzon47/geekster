import java.util.*;

public class HW_PrintPrimes {

    static String isPrime(int n) {
        String s;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return "";
            }
        }
        s = String.valueOf(n) + " ";
        return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for (; x <= y; x++) {
            System.out.print(isPrime(x));
        }
    }
}