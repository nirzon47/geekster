import java.util.*;

public class HW_PrintAlternateColumnWise {

    public static void transpose(int[][] matrix, int r, int c, int[][] tMatrix) {
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                tMatrix[i][j] = matrix[j][i];
            }
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

        transpose(matrix, r, c, tMatrix);

        for (int i = 0; i < c; i += 2) {
            for (int j = 0; j < r; j++) {
                System.out.print(tMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
