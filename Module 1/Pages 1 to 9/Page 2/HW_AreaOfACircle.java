import java.util.*;

public class HW_AreaOfACircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int diameter = sc.nextInt();

        int radius = diameter / 2;
        int area = (22 * radius * radius) / 7;

        System.out.println(area);

    }
}
