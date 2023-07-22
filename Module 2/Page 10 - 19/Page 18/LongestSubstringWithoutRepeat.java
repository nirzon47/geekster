import java.util.*;

public class LongestSubstringWithoutRepeat {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, res = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);

            if (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(ch);
                right++;
            }

            res = Math.max(res, set.size());
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(lengthOfLongestSubstring(s));
    }
}
