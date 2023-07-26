import java.util.*;

public class WeakestRows {
    public static int binarySearch(int[] nums, int right) {
        int left = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < m; i++) {
            int strength = binarySearch(mat[i], n - 1);
            pq.offer(strength * 10000 + i);
        }

        int[] res = new int[k];

        int i = 0;
        while (i < k) {
            res[i++] = pq.poll() % 10000;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[] res = kWeakestRows(mat, k);

        for (int r : res) {
            System.out.print(r + " ");
        }

    }
}
