import java.util.*;

public class HW_OddOccurrence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] freq = new int[10];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            freq[nums[i]]++;
        }

        boolean flag = false;

        for (int i = 0; i < 10; i++) {
            if (freq[i] % 2 != 0) {
                System.out.println(i);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("There is no odd occurring element");
        }
    }
}
