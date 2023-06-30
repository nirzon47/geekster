import java.util.*;

public class HW_PrintTheColumnWiseWithGivenCondition {
    public static void transpose(int[][] tMatrix, int[][] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                tMatrix[i][j] = matrix[j][i];
            }
        }
    }

    public static void reverseColumn(int[][] tMatrix, int r, int c) {
        int left = 0, right = c - 1;
        while (left < right) {
            int temp = tMatrix[r][left];
            tMatrix[r][left] = tMatrix[r][right];
            tMatrix[r][right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] tMatrix = new int[c][r];

        transpose(tMatrix, matrix, r, c);

        for (int i = 0; i < c; i++) {
            if (i % 2 != 0) {
                reverseColumn(tMatrix, i, r);
            }
            for (int j = 0; j < r; j++) {
                System.out.print(tMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
