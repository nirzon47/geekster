import java.util.*;

public class IntWithMaximumFreq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] freq = new int[11];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            freq[nums[i]]++;
        }

        int max = Integer.MIN_VALUE, maxIndex = -1;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > max) {
                max = freq[i];
                maxIndex = i;
            }
        }

        System.out.println(maxIndex);

    }
}
