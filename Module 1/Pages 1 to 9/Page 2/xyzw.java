import java.util.*;

public class xyzw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int w = sc.nextInt();

        /* If else approach */
        /* if (x*y == z*w)
                System.out.println(true);
            else
                System.out.println(false);
         */

        // Printing the boolean value returned by the relational operator.
        System.out.println(x * y == z * w);
    }
}
