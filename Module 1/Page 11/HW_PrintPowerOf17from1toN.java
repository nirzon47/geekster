import java.util.*;

public class HW_PrintPowerOf17from1toN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long prod = 17;
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                prod *= 17;
            }
            System.out.print(prod + " ");
            prod = 17;
        }

    }
}