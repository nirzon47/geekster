import java.util.*;

public class HW_MergeTwoArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];

        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] nums2 = new int[m];

        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] res = new int[m + n];
        for (int i = 0; i < n; i++) {
            res[i] = nums1[i];
        }
        for (int i = n, j = 0; i < m + n; i++, j++) {
            res[i] = nums2[j];
        }

        Arrays.sort(res);

        for (int r : res) System.out.print(r + " ");

    }
}
