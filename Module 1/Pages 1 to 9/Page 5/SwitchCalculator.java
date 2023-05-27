import java.util.*;

public class SwitchCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (N) {
            case 10 -> System.out.println(a + b);
            case 20 -> System.out.println(a - b);
            case 30 -> System.out.println(a * b);
            case 40 -> System.out.println(a % b);
            case 50 -> System.out.println(a / b);
            default -> System.out.println("Enter a valid number");
        }
        
    }
}