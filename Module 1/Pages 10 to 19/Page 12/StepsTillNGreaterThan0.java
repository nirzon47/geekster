import java.util.*;

public class StepsTillNGreaterThan0 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int count, i = 1;

        while (i <= T) {

            int n = sc.nextInt();
            count = 0;

            while (n > 0) {
                count++;
                if (n % 2 == 0)
                    n -= 1;
                else
                    n -= 3;
            }

            System.out.println(count);
            i++;
        }

    }
}