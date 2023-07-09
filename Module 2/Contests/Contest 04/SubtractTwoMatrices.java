import java.util.*;

public class SubtractTwoMatrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int[][] matrix1 = new int[m1][n1];

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        int[][] matrix2 = new int[m2][n2];

        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        if (m1 != m2 || n1 != n2) {
            return;
        }

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(matrix1[i][j] - matrix2[i][j] + "   ");
            }
            System.out.println();
        }

    }
}
