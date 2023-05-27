import java.util.*;

public class HW_FindPermutation {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        int factN = factorial(n), factNR = factorial(n - r);

        System.out.println(factN / factNR);
    }
}