import java.util.*;

public class HW_HappyNumber {
    public static int splitNumbersAndSquare(int num) {
        int n = 0;
        while (num > 0) {
            int digit = num % 10;
            n += digit * digit;
            num /= 10;
        }

        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();

        while (set.add(n)) {
            n = splitNumbersAndSquare(n);
        }

        System.out.println(n == 1);
    }
}
