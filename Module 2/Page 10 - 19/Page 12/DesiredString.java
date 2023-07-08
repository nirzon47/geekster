import java.util.*;

public class DesiredString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0, count = 0;
        String res = null;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String check = (s.substring(i, j));
                int diff = j - i;
                if (check.charAt(0) == 'A' && check.charAt(diff - 1) == 'A' && check.length() > 1) {
                    count++;
                    if (diff > max) {
                        max = diff;
                        res = check;
                    }
                }
            }
        }

        if (count > 0) {
            System.out.println(count);
            System.out.println(max);
            System.out.println(res);
        } else {
            System.out.println(-1);
        }

    }
}
