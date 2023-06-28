import java.util.*;

public class HW_ReverseRowsOfMatrix {
    public static void reverseColumns(int[][] matrix, int i, int e) {
        int left = 0, right = e - 1;
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
        int e = sc.nextInt();
        int[][] matrix = new int[e][e];

        for (int i = 0; i < e; i++) {
            for (int j = 0; j < e; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < e; i++) {
            reverseColumns(matrix, i, e);
            for (int j = 0; j < e; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
