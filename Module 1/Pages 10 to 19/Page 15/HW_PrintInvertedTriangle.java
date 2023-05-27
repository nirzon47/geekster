import java.util.*;

public class HW_PrintInvertedTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        for (int i = m; i >= 1; i -= 2) {
            for (int j = m; j > i; j -= 2)
                System.out.print("\t");
            for (int k = 1; k <= i; k++)
                System.out.print("*\t");
            System.out.println();
        }

    }
}