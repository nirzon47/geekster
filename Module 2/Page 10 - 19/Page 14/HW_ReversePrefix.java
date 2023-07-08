import java.util.*;

public class HW_ReversePrefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] chars = s.toCharArray();
        char c = sc.next().charAt(0);
        int right = 0;

        while (chars[right] != c && right < chars.length - 1) right++;

        if (right == chars.length - 1) {
            System.out.println(chars);
            return;
        }

        int left = 0;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        System.out.println(chars);
    }
}
