import java.util.*;

public class HW_PalindromicString {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            if (!Character.isLetterOrDigit(l)) {
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        s = s.toLowerCase();
        System.out.println(isPalindrome(s));
    }
}
