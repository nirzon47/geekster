import java.util.*;

public class Pattern7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= m; j++)
                    System.out.print("*");
                System.out.println();
            } else {
                System.out.print("*");
                for (int j = 2; j < m; j++)
                    System.out.print(" ");
                System.out.println("*");

            }
            i++;
        }

    }
}