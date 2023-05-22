import java.util.*;

public class GradeTheStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch = sc.nextLine().charAt(0);

        switch (ch) {
            case 'A' -> System.out.println("Excellent!");
            case 'B' -> System.out.println("Well done!");
            case 'C' -> System.out.println("You passed!");
            case 'F' -> System.out.println("Better luck next time!");
            default -> System.out.println("Invalid grade");
        }
    }
}