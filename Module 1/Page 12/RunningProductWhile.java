import java.util.*;

public class RunningProductWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1, prod = 1;

        while (i <= n) {
            int num = sc.nextInt();
            prod *= num;
            System.out.print(prod + " ");
            i++;
        }
        
    }
}