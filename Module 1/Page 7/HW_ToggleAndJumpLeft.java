import java.util.*;

public class HW_ToggleAndJumpLeft {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (Character.isAlphabetic(ch)) {
            if (ch == 'A' || ch == 'a' || ch == 'B' || ch == 'b')
                System.out.println("Sorry");
            else {
                if (Character.isUpperCase(ch))
                    ch = Character.toLowerCase(ch);
                else
                    ch = Character.toUpperCase(ch);
                ch = (char) (ch - 2);
                System.out.println(ch);
            }
        } else
            System.out.println("No alphabet");
        
    }
}