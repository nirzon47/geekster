import java.util.*;

public class IsPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("Not a Palindrome");
                return;
            }
            left++;
            right--;
        }

        System.out.println("Palindrome");
    }
}
