import java.util.*;

public class HW_PrintMultiplesOf8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N % 8 != 0) {
            N -= N % 8;
        }

        for (; N >= 8; N -= 8)
            System.out.print(N + " ");
        
    }
}