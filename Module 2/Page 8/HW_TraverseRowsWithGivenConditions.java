import java.util.*;

public class HW_TraverseRowsWithGivenConditions {
    public static void reverseColumns(int[][] matrix, int i, int c) {
        int left = 0, right = c - 1;
        while (left < right) {
            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp;
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

        for (int i = 0; i < r; i++) {
            if (i % 2 != 0) {
                reverseColumns(matrix, i, c);
            }
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
