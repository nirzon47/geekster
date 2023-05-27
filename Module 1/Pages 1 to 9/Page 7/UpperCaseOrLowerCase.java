import java.util.*;

public class UpperCaseOrLowerCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch))
            System.out.println("Char is Uppercase");
        else if (Character.isLowerCase(ch))
            System.out.println("Char is Lowercase");

    }
}