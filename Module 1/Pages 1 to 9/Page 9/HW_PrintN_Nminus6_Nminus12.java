import java.util.*;

public class HW_PrintN_Nminus6_Nminus12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (; n > 0; n -= 6)
            System.out.print(n + " ");

    }
}