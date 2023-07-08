import java.util.*;

public class HW_CountNumbersInAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                count++;
                while (s.charAt(i) >= '0' && s.charAt(i) <= '9' && i < s.length() - 1) {
                    i++;
                }
            }

        }

        System.out.println(count);

    }
}
