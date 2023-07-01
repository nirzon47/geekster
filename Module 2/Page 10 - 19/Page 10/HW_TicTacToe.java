import java.util.*;

public class HW_TicTacToe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[3][3];
        int n = sc.nextInt(); // This is customary for the test cases

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int d1 = 0, d2 = 0;

        // Diagonals
        for (int i = 0, j = 2; i < 3 && j >= 0; i++, j--) {
            d1 += grid[i][i];
            d2 += grid[i][j];
        }

        if (d1 == 3 || d1 == 0 || d2 == 3 || d2 == 0) {
            System.out.println("Games End");
            return;
        }

        // Rows and Columns
        for (int i = 0; i < 3; i++) {
            int r = 0, c = 0;
            for (int j = 0; j < 3; j++) {
                c += grid[i][j];
                r += grid[j][i];
            }
            if (r == 3 || r == 0 || c == 3 || c == 0) {
                System.out.println("Games End");
                return;
            }
        }

        System.out.println("Draw");
    }
}
