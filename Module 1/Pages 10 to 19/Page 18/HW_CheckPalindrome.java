import java.util.*;

public class HW_CheckPalindrome {
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
        int n, rN;

        while (T-- > 0) {
            n = sc.nextInt();
            rN = reverseNumber(n);
            if (n == rN)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}