import java.util.*;

public class HW_PrintN_Nminus3k_Nminus6k {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        for (; n > 0; n -= 3 * k) {
            System.out.print(n + " ");
        }

    }
}