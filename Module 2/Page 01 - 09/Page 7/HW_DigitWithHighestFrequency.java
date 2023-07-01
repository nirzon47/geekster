import java.util.*;

public class HW_DigitWithHighestFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = String.valueOf(n);
        int[] freq = new int[10];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - '0']++;
        }

        int max = Integer.MIN_VALUE;
        int idx = -1;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > max) {
                max = freq[i];
                idx = i;
            }
        }

        System.out.println(idx);
    }
}
