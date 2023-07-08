import java.util.*;

public class LongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        int nLen = name.length(), tLen = typed.length();
        int n = 0, t = 0;

        while (n < nLen && t < tLen) {
            if (name.charAt(n) == typed.charAt(t)) {
                n++;
                t++;
            } else if (n > 0 && name.charAt(n - 1) == typed.charAt(t)) {
                t++;
            } else {
                return false;
            }
        }

        while (t < tLen) {
            if (name.charAt(n - 1) == typed.charAt(t)) {
                t++;
            } else {
                return false;
            }
        }

        return n == nLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String typed = sc.next();

        System.out.println(isLongPressedName(name, typed));
    }
}
