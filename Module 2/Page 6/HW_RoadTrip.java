import java.util.*;

public class HW_RoadTrip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int altitude = 0, maxDifference = 0;

        for (int num : nums) {
            altitude += num;
            maxDifference = Math.max(maxDifference, altitude);
        }

        System.out.println(maxDifference);
    }
}
