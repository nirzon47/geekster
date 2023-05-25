import java.util.*;

public class FindNcR {

    public static long fact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        long factN = 1, factR = 1, factNR = 1, res;

        if (r > n)
            System.out.println(0);
        else {
            factN = fact(n);
            factR = fact(r);
            factNR = fact(n - r);

            res = factN / (factR * factNR);

            System.out.println(res);
        }
    }
}