import java.util.*;

public class HW_QueAndRem {

    static int quotient(int x, int y) {
        return x / y;
    }

    static int remainder(int x, int y) {
        return x % y;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print(quotient(x, y) + " ");
        System.out.print(remainder(x, y));

    }
}