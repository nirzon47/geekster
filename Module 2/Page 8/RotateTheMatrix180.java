import java.util.*;

public class RotateTheMatrix180 {
    public static void transpose(int[][] matrix, int e) {
        for (int i = 0; i < e; i++) {
            for (int j = i + 1; j < e; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reverseColumns(int[][] matrix, int e) {
        for (int i = 0; i < e; i++) {
            int left = 0, right = e - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void rotate(int[][] matrix, int e) {
        transpose(matrix, e);
        reverseColumns(matrix, e);
    }

    public static void display(int[][] matrix) {
        for (int[] rows : matrix) {
            for (int columns : rows) {
                System.out.print(columns + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int[][] matrix = new int[e][e];

        for (int i = 0; i < e; i++) {
            for (int j = 0; j < e; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        rotate(matrix, e);
        rotate(matrix, e);

        display(matrix);

    }
}
