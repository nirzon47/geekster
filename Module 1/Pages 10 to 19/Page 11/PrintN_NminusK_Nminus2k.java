import java.util.*;

public class PrintN_NminusK_Nminus2k {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();

        while (n >= l) {
            System.out.println(n);
            n -= k;
        }

    }
}