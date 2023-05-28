import java.util.*;

public class Pattern15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int step = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(step + " ");
                step++;
            }
            System.out.println();
        }

    }
}