import java.util.*;

public class HW_OlympiadTeamSelection {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        int index = n / 2;

        System.out.println(nums[index]);

    }
}
