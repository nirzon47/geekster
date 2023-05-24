import java.util.*;

public class HW_PrintBigLadder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int flag = 1;

        for (int i = 1; i <= n; i++) {
            if (flag == 1 || (flag - i) == 0) {
                flag = flag + 3;
                for (int j = 1; j <= m; j++) {
                    System.out.print("*\t");
                }
                System.out.println();
            } else {
                System.out.print("*\t");
                for (int j = 1; j < (m - 1); j++)
                    System.out.print(" \t");
                System.out.println("*\t");
            }
        }

    }
}