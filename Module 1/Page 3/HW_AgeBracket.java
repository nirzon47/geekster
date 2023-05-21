import java.util.*;

public class HW_AgeBracket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 70)
            System.out.println("Super Senior Citizen");
        else if (age >= 59)
            System.out.println("Senior Citizen");
        else if (age >= 18)
            System.out.println("Adult");
        else if (age > 1)
            System.out.println("Underage");
        else
            System.out.println("New Born");

    }
}
