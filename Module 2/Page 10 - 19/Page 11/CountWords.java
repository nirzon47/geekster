import java.util.*;

public class CountWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int len = s.length();
        int i = len - 1;
        while (s.charAt(i) == ' ') i--;

        int count = 0;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                count++;
                while (s.charAt(i) == ' ' && i > 0) i--;
            }
            i--;
        }

        if (s.charAt(0) != ' ') {
            count++;
        }

        System.out.println(count);

    }
}
