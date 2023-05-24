import java.util.*;

public class HW_PrintRangeXY {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x <= y) {
            System.out.println(x);
            x++;
        }

    }
}