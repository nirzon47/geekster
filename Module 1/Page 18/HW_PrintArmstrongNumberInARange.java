import java.util.*;

public class HW_PrintArmstrongNumberInARange {

    static boolean isArmstrong(int n) {
        int temp = n, newN = 0;
        if (n > 1 && n < 10) // Some weird logic with taste cases
            return true;

        while (n > 0) {
            newN += Math.pow((n % 10), 3);
            n /= 10;
        }
        return (temp == newN);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = x; i <= y; i++) {
            if (isArmstrong(i))
                System.out.println(i);
        }
        
    }
}