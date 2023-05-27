import java.util.*;

public class PrintPowersOf2LessThanN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int power = 1;
        int n = sc.nextInt();
        while (power <= n) {
            System.out.print(power + " ");
            power *= 2;

        }

    }
}