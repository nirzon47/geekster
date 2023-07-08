import java.util.*;

public class PowerOfAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 1, max = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 1;
            }
        }

        System.out.println(Math.max(count, max));

    }
}
