import java.util.*;

public class SwapXY {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int c = x;

        System.out.println("c = " + c);
        System.out.println("x = " + y);
        System.out.println("y = " + x);

        x = y;
        y = c;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}