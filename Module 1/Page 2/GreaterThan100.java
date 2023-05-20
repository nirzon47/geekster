import java.util.*;

public class GreaterThan100 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        /*
        Lengthy process with if else
        if (n > 100)
            System.out.println(true);
        else
            System.out.println(false);
        */

        // Prints a boolean value depending on the value of n
        System.out.println(n > 100);

    }
}
