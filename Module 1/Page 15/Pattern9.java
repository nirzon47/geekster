import java.util.*;

public class Pattern9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++)
                    System.out.print("*\t");
                System.out.println();
            } else {
                System.out.print("*\t");
                for (int j = 2; j < n; j++)
                    System.out.print("\t");
                System.out.println("*\t");

            }
        }
        
    }
}