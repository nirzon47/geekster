import java.util.*;

public class HW_ReverseDigits {
    static int reverseNumber(int n) {
        int reverseN = 0;
        while (n > 0) {
            reverseN = (reverseN * 10) + (n % 10);
            n /= 10;
        }
        return reverseN;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int n;

        while (T-- > 0) {
            n = sc.nextInt();
            System.out.println(reverseNumber(n));
        }

    }
}