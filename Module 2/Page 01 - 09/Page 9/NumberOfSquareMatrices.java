import java.util.*;

public class NumberOfSquareMatrices {
    public static int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int res = 0;

        for (int i = 0; i < n; i++) {
            res += matrix[0][i];
        }
        for (int i = 1; i < m; i++) {
            res += matrix[i][0];
        }

        for (int r = 1; r < m; r++) {
            for (int c = 1; c < n; c++) {
                if (matrix[r][c] == 1) {
                    int squares = Math.min(matrix[r][c - 1], Math.min(matrix[r - 1][c], matrix[r - 1][c - 1])) + 1;
                    matrix[r][c] = squares;
                    res += squares;
                }
            }
        }

        return res;
    }

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

        System.out.println(countSquares(matrix));

    }
}
