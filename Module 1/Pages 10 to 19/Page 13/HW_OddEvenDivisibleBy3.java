import java.util.*;

public class HW_OddEvenDivisibleBy3 {

    public static String checkCondition(int n) {
        if (n % 2 == 0) {
            if (n % 3 == 0)
                return "Even Divisible by 3";
            else
                return "Even Not Divisible by 3";
        } else {
            if (n % 3 == 0)
                return "Odd Divisible by 3";
            else
                return "Odd Not Divisible by 3";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num;

        while (n-- > 0) {
            num = sc.nextInt();
            System.out.println(checkCondition(num));
        }

    }
}