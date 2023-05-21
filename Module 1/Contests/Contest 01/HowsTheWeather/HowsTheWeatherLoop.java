import java.util.*;

public class HowsTheWeatherLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sunny = 0;

        // Runs a loop for 7 times getting all the inputs and adding them to sunny
        for (int i = 0; i < 7; i++) {
            sunny += sc.nextInt();
        }

        // The difference between the number of days (7) and sunny is rainy
        int rainy = 7 - sunny;

        // Gets the result via ternary operation
        String res = sunny > rainy ? "YES" : "NO";

        System.out.println(res);

    }
}
