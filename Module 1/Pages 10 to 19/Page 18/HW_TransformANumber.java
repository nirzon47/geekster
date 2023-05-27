import java.util.*;

public class HW_TransformANumber {

    static int reverseNumber(int n) {
        int reverseN = 0;
        while (n > 0) {
            reverseN = (reverseN * 10) + (n % 10);
            n /= 10;
        }
        return reverseN;
    }

    static int rotate(int n) {
        int temp = 0;
        for (int i = 1; i <= 2; i++) {
            temp = (temp * 10) + (n % 10);
            n /= 10;
        }
        return (reverseNumber(temp) * 10000 + n);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(rotate(n));

    }
}