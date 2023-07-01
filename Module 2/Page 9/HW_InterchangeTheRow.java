import java.util.*;

public class HW_InterchangeTheRow {

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

        for (int i = 0; i < n; i++) {
            int temp = matrix[0][i];
            matrix[0][i] = matrix[m - 1][i];
            matrix[m - 1][i] = temp;
        }
        for (int[] r : matrix) {
            for (int e : r) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
