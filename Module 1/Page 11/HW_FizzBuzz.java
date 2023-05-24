import java.util.*;

public class HW_FizzBuzz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 7 == 0)
                System.out.print("FizzBuzz ");
            else if (i % 3 == 0)
                System.out.print("Fizz ");
            else if (i % 7 == 0)
                System.out.print("Buzz ");
            else
                System.out.print(i + " ");
        }

    }
}