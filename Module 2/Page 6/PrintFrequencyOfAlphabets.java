import java.util.*;

public class PrintFrequencyOfAlphabets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] chars = s.toCharArray();
        int[] freq = new int['z' + 1];

        for (char ch : chars) {
            freq[ch]++;
        }


        for (char ch : chars) {
            if (freq[ch] != 0) {
                System.out.println(ch + "-" + freq[ch]);
            }
            freq[ch] = 0;
        }

    }
}
