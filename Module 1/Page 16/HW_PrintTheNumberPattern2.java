import java.util.*;

public class HW_PrintTheNumberPattern2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--)
                System.out.print("   ");

            for (int l = 1; l <= i; l++)
                System.out.print((l * k) + " ");

            System.out.println();
        }
    }
}
