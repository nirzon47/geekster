import java.util.*;

public class HW_CrossWordII {

    public static boolean checkDiagonals(char[][] matrix, int m, int n, String checker) {
        // NE to SW diagonals
        for (int i = 0; i < n; i++) {
            StringBuilder d = new StringBuilder();
            for (int j = 0, k = i; j <= i && k >= 0 && j < m; j++, k--) {
                d.append(matrix[j][k]);
            }
            if (d.toString().contains(checker)) {
                return true;
            }
        }
        // Second half of NE to SW diagonal
        for (int i = 1; i < m; i++) {
            StringBuilder d = new StringBuilder();
            for (int j = i, k = n - 1; k >= i && j < m; j++, k--) {
                d.append(matrix[j][k]);
            }
            if (d.toString().contains(checker)) {
                return true;
            }
        }

        // NW to SE diagonals
        for (int i = 0; i < n; i++) {
            StringBuilder d = new StringBuilder();
            for (int j = 0, k = i; j < m && k < n; j++, k++) {
                d.append(matrix[j][k]);
            }
            if (d.toString().contains(checker)) {
                return true;
            }
        }
        // Second half of NW to SE
        for (int k = 1; k < m; k++) {
            StringBuilder d = new StringBuilder();
            for (int i = k, j = 0; i < m && j < n; i++, j++) {
                d.append(matrix[i][j]);
            }
            if (d.toString().contains(checker)) {
                return true;
            }
        }

        return false;
    }

    public static boolean checkRowsAndColumns(char[][] matrix, int m, int n, String checker) {
        for (int i = 0; i < m; i++) {
            StringBuilder row = new StringBuilder(), column = new StringBuilder();
            for (int j = 0; j < n; j++) {
                row.append(matrix[i][j]);
                if (j < m)
                    column.append(matrix[j][i]);
            }
            if (row.toString().contains(checker) ||
                    column.toString().contains(checker)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] matrix = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }

        String checker = sc.next();

        System.out.println(checkDiagonals(matrix, m, n, checker) || checkRowsAndColumns(matrix, m, n, checker));


    }
}
