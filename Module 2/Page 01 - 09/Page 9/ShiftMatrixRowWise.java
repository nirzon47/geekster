import java.util.*;

public class ShiftMatrixRowWise {
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotate(int[][] matrix, int k, int e) {
        for (int[] col : matrix) {
            reverse(col, 0, e - 1);
            reverse(col, e - k, e - 1);
            reverse(col, 0, e - k - 1);
        }
    }

    public static void display(int[][] matrix) {
        for (int[] col : matrix) {
            for (int row : col) {
                System.out.print(row + " ");
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

        int k = sc.nextInt();
        k = k % e;

        rotate(matrix, k, e);

        display(matrix);

    }
}
