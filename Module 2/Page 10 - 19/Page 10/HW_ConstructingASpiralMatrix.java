import java.util.*;

public class HW_ConstructingASpiralMatrix {

    public static void display(int[][] matrix) {
        for (int[] r : matrix) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[k];

        for (int i = 0; i < k; i++) {
            nums[i] = sc.nextInt();
        }

        int[][] matrix = new int[m][n];

        int left = 0, right = n - 1, top = 0, bottom = m - 1, pointer = 0;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = nums[pointer++];
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = nums[pointer++];
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = nums[pointer++];
                }
            }
            bottom--;

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = nums[pointer++];
                }
            }
            left++;
        }

        display(matrix);
    }
}
