import java.util.*;

public class TheDifference {

    public static int digitSum(int n) {
        int sumOfDigits = 0;
        while (n > 0) {
            sumOfDigits += n % 10;
            n /= 10;
        }
        return sumOfDigits;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0, sumDigit = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            sumDigit += digitSum(arr[i]);

        }
        int diff = Math.abs(sum - sumDigit);
        System.out.println(diff);

    }
}