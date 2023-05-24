import java.util.*;

public class NthPowerOf10While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long prod;
        if (n == 0)
            prod = 1;
        else
            prod = 10;

        for (int i = 2; i <= n; i++)
            prod *= 10;

        System.out.println(prod);
        
    }
}