import java.util.*;

public class HW_GenerateRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            String res = s.substring(s.length() - i) + s.substring(0, s.length() - i);
            System.out.println(res);
        }

    }
}
