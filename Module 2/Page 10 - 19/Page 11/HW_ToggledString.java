import java.util.*;

public class HW_ToggledString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        boolean flag = true;
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isLowerCase(s1.charAt(i))) {
                if (Character.isLowerCase(s2.charAt(i))) {
                    flag = false;
                }
            } else {
                if (Character.isUpperCase(s2.charAt(i))) {
                    flag = false;
                }
            }
        }

        System.out.println(flag);

    }
}
