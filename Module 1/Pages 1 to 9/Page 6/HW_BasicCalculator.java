import java.util.*;

public class HW_BasicCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'A' -> System.out.println(n1 + n2);
            case 'S' -> System.out.println(n1 - n2);
            case 'M' -> System.out.println(n1 * n2);
            case 'D' -> System.out.println(n1 / n2);
            case 'R' -> System.out.println(n1 % n2);
            default -> System.out.println("Enter again");
        }
        
    }
}