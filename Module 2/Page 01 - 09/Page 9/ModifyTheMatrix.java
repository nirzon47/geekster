import java.util.*;

public class ModifyTheMatrix {
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
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        int[] trackRows = new int[r];
        int[] trackColumns = new int[c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 1) {
                    trackRows[i] = 1;
                    trackColumns[j] = 1;
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (trackRows[i] == 1 || trackColumns[j] == 1) {
                    matrix[i][j] = 1;
                }
            }
        }

        display(matrix);

    }
}
