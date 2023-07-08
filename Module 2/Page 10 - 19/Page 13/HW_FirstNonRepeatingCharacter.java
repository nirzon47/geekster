import java.util.*;

public class HW_FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int['z' + 1];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                System.out.println(s.charAt(i));
                return;
            }
        }

        System.out.println(-1);

    }
}
