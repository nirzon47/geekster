import java.util.*;

public class HW_ValidAnagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        if (s.length() != t.length()) {
            System.out.println("No");
            return;
        }

        int[] tFreq = new int[26];
        int[] sFreq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            tFreq[t.charAt(i) - 'a']++;
            sFreq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (sFreq[i] != tFreq[i]) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

    }
}
