import java.util.*;

public class HowsTheWeather {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Adds all the inputs in sunny
        int sunny = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();

        // The difference between the number of days (7) and sunny is rainy
        int rainy = 7 - sunny;

        // Gets the result via ternary operation
        String res = sunny > rainy ? "YES" : "NO";

        System.out.println(res);

    }
}
