import java.util.*;

public class FindUnique {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[10];

        for (int i = 0; i < s.length(); i++) {
            int n = Character.getNumericValue(s.charAt(i));
            freq[n]++;
        }

        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }

        System.out.println(count);

    }
}
