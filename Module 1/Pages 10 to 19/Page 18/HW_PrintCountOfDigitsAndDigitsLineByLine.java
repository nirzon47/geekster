import java.util.*;

public class HW_PrintCountOfDigitsAndDigitsLineByLine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String temp = "" + n;
        int len = temp.length();
        System.out.println(len);

        while (n > 0) {
            System.out.println(n % 10);
            n /= 10;
        }

    }
}