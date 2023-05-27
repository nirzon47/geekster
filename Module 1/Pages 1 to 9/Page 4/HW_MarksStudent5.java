import java.util.*;

public class HW_MarksStudent5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = sc.nextDouble() + sc.nextDouble() + sc.nextDouble() + sc.nextDouble() + sc.nextDouble();
        double percentage = (total / 500.0) * 100.0;

        System.out.println(total);
        System.out.println(percentage);
    }
}