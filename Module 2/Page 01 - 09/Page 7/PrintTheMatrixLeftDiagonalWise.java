import java.util.*;

public class PrintTheMatrixLeftDiagonalWise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int diagonal = 2 * n - 1;

        for (int i = 0; i < diagonal; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (j + k == i) {
                        System.out.print(matrix[j][k] + " ");
                    }
                }
            }
        }
    }
}
