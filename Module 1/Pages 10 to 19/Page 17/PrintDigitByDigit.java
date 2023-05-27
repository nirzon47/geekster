import java.util.*;

public class PrintDigitByDigit {

    static void seperateNumber(int n) {
        while (n > 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        seperateNumber(n);

    }
}