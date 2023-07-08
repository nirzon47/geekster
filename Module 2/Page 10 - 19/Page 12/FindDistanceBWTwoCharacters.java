import java.util.*;

public class FindDistanceBWTwoCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        int first = 0, second = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c1) {
                first = i;
            }
            if (s.charAt(i) == c2) {
                second = i;
            }
        }

        System.out.println(second - first - 1);

        // Using indexOf function 
        //System.out.println(Math.abs(s.indexOf(c2) - s.indexOf(c1)) - 1);
    }
}
