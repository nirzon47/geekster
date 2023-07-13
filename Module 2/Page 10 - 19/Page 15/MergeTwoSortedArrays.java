import java.util.*;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] B = new int[n];
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }

        ArrayList<Integer> res = new ArrayList<>();

        int i = 0;
        int j = 0;

        if (A[i] > B[j]) {
            res.add(B[j]);
            j++;
        } else {
            res.add(A[i]);
            i++;
        }

        while (i < n && j < m) {
            int lastVal = res.get(res.size() - 1);

            if (A[i] > B[j]) {
                if (B[j] != lastVal) {
                    res.add(B[j]);
                }
                j++;
            } else {
                if (A[i] != lastVal) {
                    res.add(A[i]);
                }

                i++;
            }
        }

        while (i < n) {
            int lastVal = res.get(res.size() - 1);
            if (lastVal != A[i]) {
                res.add(A[i]);

            }
            i++;
        }
        while (j < m) {
            int lastVal = res.get(res.size() - 1);
            if (lastVal != B[j]) {
                res.add(B[j]);

            }
            j++;
        }


        for (int ele : res) {
            System.out.print(ele + " ");

        }
    }
}
