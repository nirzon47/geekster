import java.util.*;

public class NthPowerOf2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = 1;

        /* With predefined function
            System.out.println((int)Math.pow(2,n));
         */
        
        for (int i = 1; i <= n; i++) {
            power *= 2;
        }

        System.out.println(power);

    }
}