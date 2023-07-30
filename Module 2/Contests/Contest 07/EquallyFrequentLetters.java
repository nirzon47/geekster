import java.util.*;

public class EquallyFrequentLetters {
    public static boolean equalCount(int[] count) {
        int c = 0;

        for (int i : count) {
            if (i == 0) {
                continue;
            } else if (c == 0) {
                c = i;
            } else if (c == i) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] count = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            count[c - 'a']++;
        }
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            count[c - 'a']--;
            if (equalCount(count)) {
                System.out.println(true);
                return;
            }
            count[c - 'a']++;
        }

        System.out.println(false);
    }
}
