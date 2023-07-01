import java.util.*;

public class GoodStringChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[26];
        char[] chars = s.toCharArray();

        for (char ch : chars) {
            freq[ch - 'a']++;
        }

        int maxFreq = 0;

        for (int f : freq) {
            if (f != 0 && maxFreq == 0) {
                maxFreq = f;
            }
            if (maxFreq != f && f != 0) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);

    }
}
