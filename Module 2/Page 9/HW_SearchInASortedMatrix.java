import java.util.*;

public class HW_SearchInASortedMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        int row = 0, column = n - 1;

        while (row < m && column >= 0) {
            if (target < matrix[row][column]) {
                column--;
            } else if (target > matrix[row][column]) {
                row++;
            } else {
                System.out.println(row);
                System.out.println(column);
                return;
            }
        }

        System.out.println("Not Found");
    }
}
