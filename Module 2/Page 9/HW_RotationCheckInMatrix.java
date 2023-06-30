import java.util.*;

public class HW_RotationCheckInMatrix {

    public static boolean isPermuted(int[][] matrix, int n) {
        StringBuilder checker = new StringBuilder();
        for (int i = 0; i < n; i++) {
            checker.append(",").append(matrix[0][i]);
        }
        checker.append(checker);

        for (int i = 1; i < n; i++) {
            StringBuilder test = new StringBuilder();
            for (int j = 0; j < n; j++) {
                test.append(",").append(matrix[i][j]);
            }
            if (!checker.toString().contains(test.toString())) {
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

        if (isPermuted(matrix, n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
