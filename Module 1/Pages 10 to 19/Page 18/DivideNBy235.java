import java.util.*;

public class DivideNBy235 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int steps = sc.nextInt();

        while (n > 1) {
            if (n % 2 == 0) {
                steps += 2;
                n /= 2;
            } else if (n % 3 == 0) {
                steps += 3;
                n /= 3;
            } else if (n % 5 == 0) {
                steps += 5;
                n /= 5;
            } else
                break;
        }
        System.out.println(steps);
        System.out.println(n);

    }
}