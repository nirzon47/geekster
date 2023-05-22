import java.util.*;

public class SmallCapitalOrDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch = sc.nextLine().charAt(0);

        if (Character.isUpperCase(ch))
            System.out.println("Capital case");
        else if (Character.isLowerCase(ch))
            System.out.println("Small case");
        else if (Character.isDigit(ch))
            System.out.println("Digit");
        else
            System.out.println("None");
        
    }
}