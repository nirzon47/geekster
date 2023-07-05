import java.util.*;

public class MultiplyTwoMatrices {

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

        if (n1 != m2) {
            System.out.println(-1);
            return;
        }

        int[][] prod = new int[m1][n2];

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    prod[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        for (int[] r : prod) {
            for (int e : r) {
                System.out.print(e + " ");
            }
            System.out.println();
        }

    }
}
