import java.util.*;

public class HW_KFrequentElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        int[] freq = new int[10];
        int[] tempFreq = new int[10];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            freq[nums[i]]++;
            tempFreq[nums[i]]++;
        }

        int k = sc.nextInt();

        Arrays.sort(freq);

        for (int i = 9; i >= 0; i--) {
            if (k > 0) {
                for (int j = 9; j >= 0; j--) {
                    if (tempFreq[j] == freq[i]) {
                        System.out.print(j + " ");
                        tempFreq[j] = 0;
                        break;
                    }
                }
                k--;
            } else {
                break;
            }
        }
    }
}
