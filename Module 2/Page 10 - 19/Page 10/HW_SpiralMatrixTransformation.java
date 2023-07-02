import java.util.*;

public class HW_SpiralMatrixTransformation {
    public static void shiftMatrix(int[][] matrix, int m, int n) {
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        int prev = matrix[0][0];

        while (true) {
            if (left > right) {
                break;
            }

            // change top row
            for (int i = left; i <= right; i++) {
                int temp = matrix[top][i];
                matrix[top][i] = prev;
                prev = temp;
            }

            top++;

            if (top > bottom) {
                break;
            }

            // change right column
            for (int i = top; i <= bottom; i++) {
                int temp = matrix[i][right];
                matrix[i][right] = prev;
                prev = temp;
            }

            right--;

            if (left > right) {
                break;
            }

            // change bottom row
            for (int i = right; i >= left; i--) {
                int temp = matrix[bottom][i];
                matrix[bottom][i] = prev;
                prev = temp;
            }

            bottom--;

            if (top > bottom) {
                break;
            }

            // change left column
            for (int i = bottom; i >= top; i--) {
                int temp = matrix[i][left];
                matrix[i][left] = prev;
                prev = temp;
            }

            left++;
        }

        // the first element of the matrix will be the last element replaced
        matrix[0][0] = prev;
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

        shiftMatrix(matrix, m, n);

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
