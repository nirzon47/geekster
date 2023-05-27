import java.util.*;

public class PrintTotalStepsNby2 {

    public static int steps(int n) {
        int count = 0;
        while (n >= 1) {
            n /= 2;
            count++;
        }
        return count;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(steps(n));

    }
}