import java.util.*;

public class LengthOfLongestPalindrome {
    public static int longestPalindrome(String s) {
        int[] freq = new int[128];
        int oddCount = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            freq[ch]++;

            if (freq[ch] % 2 == 1) {
                oddCount++;
            } else {
                oddCount--;
            }
        }

        return oddCount > 1 ? len - oddCount + 1 : len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(longestPalindrome(s));

    }
}
