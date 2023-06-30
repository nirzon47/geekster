import java.util.*;

public class Convert1DTo2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int i = 0;
        for (int j = 0; j < r; j++) {
            for (int k = 0; k < c; k++) {
                matrix[j][k] = nums[i++];
                System.out.print(matrix[j][k] + " ");
            }
            System.out.println();
        }

    }
}
