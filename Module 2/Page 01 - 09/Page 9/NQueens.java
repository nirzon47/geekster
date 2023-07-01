import java.util.*;

public class NQueens {

    public static boolean check(int[][] matrix, int r, int c, int n) {
        for (int i = c - 1; i >= 0; i--) {
            if (matrix[r][i] == 1) {
                return false;
            }
        }
        for (int i = r - 1; i >= 0; i--) {
            if (matrix[i][c] == 1) {
                return false;
            }
        }
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (matrix[i][j] == 1) {
                return false;
            }
        }
        for (int i = r - 1, j = c + 1; i >= 0 && j < n; i--, j++) {
            if (matrix[i][j] == 1) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean res;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    res = check(matrix, i, j, n);
                    if (!res) {
                        System.out.println("Danger");
                        return;
                    }
                }
            }
        }

        System.out.println("N Queens");
    }
}
