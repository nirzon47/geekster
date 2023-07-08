import java.util.*;

public class HW_LongestPalindromeSubstring {
    public static boolean isPalindrome(StringBuilder s) {
        String s1 = s.toString();
        String s2 = s.reverse().toString();
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int len = s.length();
        String palindrome = null;
        int max = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                StringBuilder subStr = new StringBuilder();
                for (int k = i; k <= j; k++) {
                    subStr.append(s.charAt(k));
                }
                if (isPalindrome(subStr)) {
                    if (subStr.length() > max) {
                        max = subStr.length();
                        palindrome = subStr.toString();
                    }
                }
            }
        }

        System.out.println(Objects.requireNonNullElse(palindrome, ""));
    }
}
