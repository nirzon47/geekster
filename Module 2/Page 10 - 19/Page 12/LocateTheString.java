import java.util.*;

public class LocateTheString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String check = sc.nextLine();
        int checkLen = check.length();

        if (s.contains(check)) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == check.charAt(0)) {
                    if (s.substring(i, checkLen + i).equals(check)) {
                        System.out.println(i);
                        return;
                    }
                }
            }
        } else {
            System.out.println(-1);
        }

        /*
         * System.out.println(s.indexOf(t));
         */

    }
}
