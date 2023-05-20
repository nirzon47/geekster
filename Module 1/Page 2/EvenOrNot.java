import java.util.*;

public class EvenOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
        If else approach
        if (n %2  == 0)
            System.out.println(true);
        else
             System.out.println(false);

         */

        // Printing the boolean value depending on the result of the relational operator
        System.out.println(n % 2);

    }
}
