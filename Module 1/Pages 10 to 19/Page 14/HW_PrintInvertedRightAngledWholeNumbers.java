import java.util.*;

public class HW_PrintInvertedRightAngledWholeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int step = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(step + " ");
                step++;
            }
            System.out.println();
            step = 1;
        }
        
    }
}