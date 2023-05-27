import java.util.*;

public class HW_PrintVowelsInString {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch);
            }
        }

    }
}