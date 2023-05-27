import java.util.*;

public class HW_PrintFirst9Multiples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++)
            System.out.print((9 * i) + " ");
        
    }
}