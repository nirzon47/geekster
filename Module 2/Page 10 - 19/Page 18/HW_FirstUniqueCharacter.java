import java.util.*;

public class HW_FirstUniqueCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int res = Integer.MAX_VALUE;

        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) != -1 && s.indexOf(c) == s.lastIndexOf(c)) {
                res = Math.min(res, s.indexOf(c));
            }
        }

        if (res == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(res);
        }
    }
}
