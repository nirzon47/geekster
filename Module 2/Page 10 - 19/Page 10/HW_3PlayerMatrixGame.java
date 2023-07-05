import java.util.*;

public class HW_3PlayerMatrixGame {
    public static boolean checkRows(int[][] matrix, int target, int n) {
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (matrix[j][i] != target) {
                    flag = false;
                    break;
                }
            }
            if (flag) return true;
        }
        return false;
    }

    public static boolean checkColumns(int[][] matrix, int target, int n) {
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != target) {
                    flag = false;
                    break;
                }
            }
            if (flag) return true;
        }
        return false;
    }

    public static boolean checkD1(int[][] matrix, int target, int n) {
        for (int i = 0; i < n; i++) {
            if (matrix[i][i] != target) return false;
        }

        return true;
    }

    public static boolean checkD2(int[][] matrix, int target, int n) {
        for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
            if (matrix[i][j] != target) return false;
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

        for (int i = 0; i < 4; i++) {
            if (checkRows(matrix, i, n)) {
                System.out.println(i);
                return;
            }
            if (checkColumns(matrix, i, n)) {
                System.out.println(i);
                return;
            }
            if (checkD1(matrix, i, n)) {
                System.out.println(i);
                return;
            }
            if (checkD2(matrix, i, n)) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);

    }
}
