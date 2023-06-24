import java.util.*;

public class MaximumFreqCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int['z' + 1];

        char[] chars = s.toCharArray();

        for (char ch : chars) {
            freq[ch]++;
        }
        int max = Integer.MIN_VALUE;
        char maxChar = ' ';

        for (int i = 'a'; i <= 'z'; i++) {
            if (max < freq[i]) {
                max = freq[i];
                maxChar = (char) i;
            }
        }

        System.out.println(maxChar);
    }
}
