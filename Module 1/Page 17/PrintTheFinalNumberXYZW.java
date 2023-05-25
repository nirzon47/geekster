import java.util.*;

public class PrintTheFinalNumberXYZW {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int res = 0, num;
        int n = sc.nextInt();
        while (n-- > 0) {
            num = sc.nextInt();
            res = (res * 10) + num;
        }
        System.out.println(res);

    }
}