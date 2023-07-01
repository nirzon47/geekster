import java.util.*;

public class HW_PrintTheRowWithMaximumNumberOf1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int idx = -1, maxRow = -1;

        for (int i = 0; i < m; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                max += matrix[i][j];
            }
            if (max > maxRow) {
                maxRow = max;
                idx = i;
            }
        }

        if (maxRow == 0) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(matrix[idx][i] + " ");
        }

    }
}
