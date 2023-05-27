import java.util.*;

public class PrintN_NminusK_Nminus2k {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        for (; N >= 0; N -= K)
            System.out.println(N);
        
    }
}