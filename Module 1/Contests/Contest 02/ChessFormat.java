import java.util.*;

public class ChessFormat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        if (sum < 3)
            System.out.println(1);
        else if (sum <= 10)
            System.out.println(2);
        else if (sum <= 60)
            System.out.println(3);
        else
            System.out.println(4);

    }
}
