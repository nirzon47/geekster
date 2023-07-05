import java.util.*;

public class HW_IsValidMatrixNP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        boolean flag = true;
        int[] freq = new int[9];
        Arrays.fill(freq, 1);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] > 9 || matrix[i][j] <= 0) {
                    System.out.println(false);
                    return;
                }
                freq[matrix[i][j] - 1]--;
                if (freq[matrix[i][j] - 1] < 0) {
                    flag = false;
                }
            }
        }

        System.out.println(flag);

    }
}
