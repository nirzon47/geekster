import java.util.*;

public class ReverseNDigitNumber {

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

        int n = sc.nextInt();
        int join = 0, num;

        while (n-- > 0) {
            num = sc.nextInt();
            join = join * 10 + num;
        }
        System.out.println(join);
        System.out.println(reverseNumber(join));

    }
}