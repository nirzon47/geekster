import java.util.*;

public class JumpingCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        int ascii = ch;

        if (Character.isLowerCase(ch)) {
            if (ch > 'w')
                System.out.println("Can't jump");
            else {
                ascii += 3;
                ch = (char) ascii;
                System.out.println(ch);
            }
        } else {
            if (ch < 'D')
                System.out.println("Can't jump");
            else {
                ascii -= 3;
                ch = (char) ascii;
                System.out.println(ch);
            }

        }
    }
}