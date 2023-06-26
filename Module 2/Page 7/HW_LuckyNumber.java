import java.util.*;

public class HW_LuckyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] freq = new int[10];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            freq[nums[i]]++;
        }

        int lucky = -1;

        for (int i = 1; i < 10; i++) {
            if (i == freq[i]) {
                lucky = i;
            }
        }

        System.out.println(lucky);
    }
}
