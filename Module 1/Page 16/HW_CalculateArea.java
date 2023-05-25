import java.util.*;

public class HW_CalculateArea {

    static int calculateArea(int l, int b) {
        return l * b;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int l, b;

        while (T-- > 0) {
            l = sc.nextInt();
            b = sc.nextInt();
            System.out.println(calculateArea(l, b));
        }

    }
}