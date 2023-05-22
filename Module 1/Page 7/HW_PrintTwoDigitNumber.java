import java.util.*;

public class HW_PrintTwoDigitNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        int n1 = Character.getNumericValue(c1);
        int n2 = Character.getNumericValue(c2);
        System.out.println((n1 * 10) + n2);

    }
}