import java.util.*;

public class PrintN_Nminus3_Nminus6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (; N > 0; N -= 3)
            System.out.println(N);

    }
}