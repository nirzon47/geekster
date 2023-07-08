import java.util.*;

public class SumOfAllSubstrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                sum += Integer.parseInt(s.substring(i, j));
            }
        }

        System.out.println(sum);
    }
}
