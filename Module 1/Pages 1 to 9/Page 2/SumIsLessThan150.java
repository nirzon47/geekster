import java.util.*;

public class SumIsLessThan150 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        /*
        If else approach
        if (x + y + z < 150)
            System.out.println(true);
        else
            System.out.println(false);

         */

        // Prints the boolean result returned by the relational operator.
        System.out.println(x + y + z < 150);

    }
}
