import java.util.*;

public class CheckArmstrong {

    static boolean checkArmstrong(int n) {
        int temp = n, newN = 0;
        while (n > 0) {
            newN += Math.pow((n % 10), 3);
            n /= 10;
        }
        return (temp == newN);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int n;

        while (T-- > 0) {
            n = sc.nextInt();
            System.out.println(checkArmstrong(n));
        }
        
    }
}