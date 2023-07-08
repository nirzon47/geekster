import java.util.*;

public class HW_CountConsecutiveOnes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int max = 0, count = 0, len = s.length();

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }

        System.out.println(Math.max(count, max));

    }
}
