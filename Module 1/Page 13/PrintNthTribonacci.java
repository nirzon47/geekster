import java.util.*;

public class PrintNthTribonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 0, a = 0, b = 1, c = 1, d = 0;

        while (i < n) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
            i++;
        }
        System.out.println(a);
    }

}
