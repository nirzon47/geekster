import java.util.*;

public class AddLastDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        /*
        Extracting the last digit using % 10.
        int n1LastDigit = n1 % 10;
        int n2LastDigit = n2 % 10;

        Printing the sum of that.
        System.out.println(n1LastDigit + n2LastDigit);
        */

        // Skipping the extra steps and variable allocation.
        System.out.println(n1 % 10 + n2 % 10);

    }
}
