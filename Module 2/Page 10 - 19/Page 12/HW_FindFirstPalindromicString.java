import java.util.*;

public class HW_FindFirstPalindromicString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] sArray = new String[n];

        for (int i = 0; i < n; i++) {
            sArray[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            String s = sArray[i];
            boolean flag = true;
            int left = 0, right = s.length() - 1;

            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    flag = false;
                    break;
                }

                left++;
                right--;
            }
            if (flag) {
                System.out.println(s);
                return;
            }
        }

        System.out.println("empty");

    }
}
