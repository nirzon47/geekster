import java.util.*;

public class RunningSumForLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= limit; i++) {
            int n = sc.nextInt();
            sum += n;
            System.out.print(sum + " ");
        }
        
    }
}