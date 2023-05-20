import java.util.*;

public class AdultOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        /*
        If else approach
        if (age >= 18)
            System.out.println("Adult");
        else
            System.out.println("Below age");
         */

        // Ternary operation
        String res = age >= 18 ? "Adult" : "Below Age";
        System.out.println(res);

    }
}
