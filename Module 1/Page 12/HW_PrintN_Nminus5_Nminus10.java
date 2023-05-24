import java.util.*;

public class HW_PrintN_Nminus5_Nminus10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        while (N > 0) {
            System.out.print(N + " ");
            N -= 5;
        }
        
    }
}