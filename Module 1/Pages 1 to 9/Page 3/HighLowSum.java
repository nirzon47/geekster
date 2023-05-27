import java.util.*;

public class HighLowSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int sum = x + y;

        if (sum >= 100)
            System.out.println("High Sum");
        else
            System.out.println("Low Sum");
    }
}