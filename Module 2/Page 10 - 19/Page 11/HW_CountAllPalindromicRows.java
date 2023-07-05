import java.util.*;

public class HW_CountAllPalindromicRows {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        for (int i = 0; i < r; i++) {
            int left = 0, right = c - 1;
            boolean flag = true;
            while (left < right) {
                if (matrix[i][left] != matrix[i][right]) {
                    flag = false;
                    break;
                }
                left++;
                right--;
            }
            if (flag) count++;
        }

        System.out.println(count);
    }
}
