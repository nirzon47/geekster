import java.util.*;

public class PrintDivisibleBy3and4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 3 == 0 && x % 4 == 0)
            System.out.println("Divisible by 3 and 4");
        else
            System.out.println("Not Divisible");
    }
}