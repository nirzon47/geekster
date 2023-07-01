import java.util.*;

public class CrossWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] crossword = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                crossword[i][j] = sc.next().charAt(0);
            }
        }

        String checker = sc.next();

        // Diagonals
        StringBuilder d1 = new StringBuilder(), d2 = new StringBuilder();
        for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
            d1.append(Character.valueOf(crossword[i][i]));
            d2.append(Character.valueOf(crossword[i][j]));
        }
        if (d1.toString().contains(checker) || d2.toString().contains(checker)) {
            System.out.println(true);
            return;
        }

        // Rows and Columns
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder(), column = new StringBuilder();
            for (int j = 0; j < n; j++) {
                row.append(Character.valueOf(crossword[i][j]));
                column.append(Character.valueOf(crossword[j][i]));
            }
            if (row.toString().contains(checker) || column.toString().contains(checker)) {
                System.out.println(true);
                return;
            }
        }

        System.out.println(false);
    }
}
