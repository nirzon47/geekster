import java.util.*;

public class HW_ReverseWordsInAString {
    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (i == 0) {
                if (s.charAt(i) != ' ')
                    word.append(s.charAt(i));
                res.append(word.reverse());
                break;
            } else if (s.charAt(i) != ' ') {
                word.append(s.charAt(i));
            } else {
                if (s.charAt(i - 1) == ' ' || word.length() == 0) continue;
                res.append(word.reverse()).append(' ');
                word.setLength(0);
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(reverseWords(s));

    }
}
