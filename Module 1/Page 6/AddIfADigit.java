import java.util.*;

public class AddIfADigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch = sc.nextLine().charAt(0);

        if (Character.isDigit(ch)) {
            int n = Character.getNumericValue(ch) + 100;
            System.out.println(n);
        } else
            System.out.println("This is not a digit");
    }
}