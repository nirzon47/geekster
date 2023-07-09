import java.util.*;

public class HW_RotationCheckInMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        StringBuilder checker = new StringBuilder();
        for (int i = 0; i < n; i++) {
            checker.append(matrix[0][i]);
        }
        checker.append(checker);

        for (int i = 1; i < n; i++) {
            StringBuilder check = new StringBuilder();
            for (int j = 0; j < n; j++) {
                check.append(matrix[i][j]);
            }
            if (!checker.toString().contains(check.toString())) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");

    }
}
