import java.util.*;

public class PrintNBy3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (; n > 0; n /= 3)
            System.out.print(n + " ");

    }
}