import java.util.*;

public class HW_ThreeStacks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum1 = 0, sum2 = 0, sum3 = 0;

        int m = sc.nextInt();
        int n = sc.nextInt();
        int o = sc.nextInt();

        int[] nums1 = new int[m];
        int[] nums2 = new int[n];
        int[] nums3 = new int[o];

        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
            sum1 += nums1[i];
        }
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
            sum2 += nums2[i];
        }
        for (int i = 0; i < o; i++) {
            nums3[i] = sc.nextInt();
            sum3 += nums3[i];
        }


        int p1 = 0, p2 = 0, p3 = 0;

        while (!(sum1 == sum2 && sum2 == sum3)) {
            if (sum1 >= sum2 && sum1 >= sum3) {
                sum1 -= nums1[p1++];
            } else if (sum2 >= sum1 && sum2 >= sum3) {
                sum2 -= nums2[p2++];
            } else if (sum3 >= sum2 && sum3 >= sum1) {
                sum3 -= nums3[p3++];
            }
        }

        System.out.println(sum1);
    }
}
