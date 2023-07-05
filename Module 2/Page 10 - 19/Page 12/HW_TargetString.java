import java.util.*;

public class HW_TargetString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String target = sc.next();

        s += s;

        if (s.contains(target)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
