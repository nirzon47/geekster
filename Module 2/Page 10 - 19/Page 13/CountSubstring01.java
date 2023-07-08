import java.util.*;

public class CountSubstring01 {
    public static int countBinarySubstrings(String s) {
        int res = 0, prev = 0, curr = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                curr++;
            } else {
                res += Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }
        }

        res += Math.min(curr, prev);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(countBinarySubstrings(s));
    }
}
