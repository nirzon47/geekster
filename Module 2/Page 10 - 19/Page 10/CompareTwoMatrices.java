import java.util.*;

public class CompareTwoMatrices {

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

        boolean flag = m1 == m2 && n1 == n2;

        if (flag) {
            for (int i = 0; i < m1; i++) {
                if (!Arrays.equals(matrix2[i], matrix1[i])) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

    }
}
