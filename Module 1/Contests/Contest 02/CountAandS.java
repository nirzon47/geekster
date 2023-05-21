import java.util.*;

public class CountAandS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int countA = 0, countS = 0;

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == 's')
                countS++;
            if (curr == 'a')
                countA++;
        }

        System.out.println(countS + " " + countA);

    }
}
